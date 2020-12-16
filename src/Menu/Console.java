package Menu;

import java.util.ArrayList;
import java.util.Map;

public class Console {
    //region Write
    /**
     * Modified Print
     * @param input Consolen Input
     */
    public void write(String input){
        System.out.print(input);
    }

    /**
     * Same as above but with ~fancy~ color
     * @param input Console Input
     * @param color
     */
    public void write(String input, String color){
        write(color + input + Colors.RESET);
    }
    //endregion

    //region Write Tag
    /**
     * Same as write but with the Tag (Useful for loading stuff)
     * @param input Console Input
     */
    public void writeWithTag(String input){
        write(Colors.WHITE_BRIGHT + "[" + Colors.WHITE_BRIGHT + "Calc"+ Colors.RED_BRIGHT +"EXTREME"+ Colors.WHITE_BRIGHT + "]" + Colors.RESET + ": " + input);
    }
    //endregion

    //region Write Line
    /**
     * Modified Println for program tag
     * @param input Console Input
     */
    public void writeLine(String input){
        System.out.println(Colors.WHITE_BRIGHT + "["+ Colors.WHITE_BRIGHT + "Calc"+ Colors.RED_BRIGHT +"EXTREME"+ Colors.WHITE_BRIGHT + "]" + Colors.RESET + ": " +  input);
    }

    /**
     * Same as above but with ~fancy~ color
     * @param input Console Input
     * @param color
     */
    public void writeLine(String input, String color){
        System.out.println(color + "[CalcEXTREME]: " + input + Colors.RESET);
    }

    public void writeEmptyLine(String input){
        System.out.println(input);
    }
    //endregion

    //region Write Info
    /**
     * Writes the output with an info tag and in yellow color
     * @param input Console Input
     */
    public void writeInfo(String input){
        try {
            System.out.println(Colors.YELLOW + "[CalcEXTREME][INFO]: " + input + Colors.RESET);
            Thread.sleep(1000);
        }catch (Exception e){}
    }

    /**
     * Same as above but with display time
     * @param input Console Input
     * @param time How long it takes before continue
     */
    public void writeInfo(String input, int time){
        try {
            System.out.println(Colors.YELLOW + "[CalcEXTREME][INFO]: " + input + Colors.RESET);
            Thread.sleep(time);
        }catch (Exception e){}
    }
    //endregion

    //region Write Error
    /**
     * Writes the output with an error tag and in red color
     * @param input displayed text
     */
    public void writeError(String input){
        try {
            System.out.println(Colors.RED + "[CalcEXTREME][ERR]: " + input + Colors.RESET);
            Thread.sleep(1500);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Writes the output with an error tag and in red color and waits for a given time
     * @param input displayed text
     * @param time time/ms
     */
    public void writeError(String input, int time){
        try {
            System.out.println(Colors.RED + "[CalcEXTREME][ERR]: " + input + Colors.RESET);
            Thread.sleep(time);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //endregion

    //region Print Result
    /**
     * Prints input as a result
     * @param input Result
     */
    public void printResult(String input){
        write("\n" + Colors.GREEN_BACKGROUND + "[CalcEXTREME][RESULT]: " + input + Colors.RESET + "\n\n");
    }
    //endregion

    //region Read Stuff

    //region Read Integer
    /**
     * Just a handy methode to use the IO class in console
     * @return
     */
    public int readInt(){
        return IO.readInteger();
    }
    //endregion

    //region Read Double
    /**
     * Same as above. Just outsourced it here.
     * @return
     */
    public double readDouble() {
        return IO.readDouble();
    }
    //endregion

    //region Read Number
    /**
     * Same again. Just outsourced it here... Again.
     * @return
     */
    public double readNumber() {
        return IO.readNumber();
    }
    //endregion

    //region Read Input
    /**
     * New read number input method
     * @return double array with written numbers
     */
    public double[] readInput(){
        ArrayList<Double> inputArray = new ArrayList<Double>();

        writeInfo("Type in your numbers and separate them via enter. If your done, just type 'x' and press enter.", 500);
        writeWithTag("Please enter now your numbers: ");
        while (true){
            try{
                String input = IO.readAnything();

                if(input.contains("x")){
                    int arrSize = inputArray.size();
                    double[] outputArray = new double[arrSize];

                    for(int i = 0; i < arrSize; i++){
                        outputArray[i] = inputArray.get(i);
                    }

                    return outputArray;
                }

                if(input.contains(",")){

                }

                double in = Double.parseDouble(input.toLowerCase().trim().replace(",", "."));
                inputArray.add(in);
            }
            catch (Exception e){
                writeError("Whops. Something went wrong. But keep on typing :)");
            }
        }
    }

    public double[][] readDoubleInput(String value1Description, String value2Description){
        ArrayList<double[]> temp = new ArrayList<double[]>();
        int index = 0;

        writeInfo("Please type in your numbers and separate them via enter.", 1500);
        boolean running = true;
        while (running){
            double input1;
            double input2;
            double[] out = new double[2];

            clear();

            writeInfo("Number ["+index+"]: " + value1Description, 500);
            write("\nInput: ");
            input1 = readDouble();

            clear();

            writeInfo("Number ["+index+"]: " + value2Description, 500);
            write("\nInput: ");
            input2 = readDouble();

            temp.add(new double[]{input1, input2});

            index++;

            clear();

            writeInfo("Do you want to add another number? (Y/N)");
            switch (readChoice(new String[]{"y","n"})){
                case "n" -> {running = false;}
            }
        }

        double[][] out = new double[temp.size()][2];
        for(int i = 0; i < temp.size(); i++){
            double[] xs = temp.get(i);
            out[i][0] = xs[0];
            out[i][1] = xs[1];
        }

        return out;
    }

    //endregion

    //region Read Choice
    /**
     * Reads an input from an user and makes im choose one of the pre definded words
     * @param choices choices
     * @return selectedChoice
     */
    public String readChoice(String[] choices){
        while(true) {
            write("\nPlease select: ");
            String input = IO.readAnything().trim().toLowerCase();

            for (int i = 0; i < choices.length; i++) {
                String choice = choices[i].trim().toLowerCase();
                if (input.contains(choice)) {
                    write("\n");
                    return choice;
                }
            }

            write("Only [");

            write("" + choices[0].toUpperCase(), Colors.RED);
            for(int i = 1; i < choices.length; i++){
                write("/" + choices[i].toUpperCase(), Colors.RED);
            }

            write("] are valid choices!\n");
        }
    }

    /**
     * Same as above but with Integer
     * @param choices choices
     * @return selectedChoice
     */
    public int readChoice(int[] choices){
        while(true) {
            write("\nPlease select: ");
            int input = IO.readInteger();

            for (int i = 0; i < choices.length; i++) {
                int choice = choices[i];
                if (input == choice) {
                    write("\n");
                    return choice;
                }
            }

            write("Only [");

            write("" + choices[0], Colors.RED);
            for(int i = 1; i < choices.length; i++){
                write("/" + choices[i], Colors.RED);
            }

            write("] are valid choices!\n");
        }
    }
    //endregion

    //endregion

    //region ReadAndWrite Arrays
    private ArrayList<double[]> savedArr = new ArrayList<double[]>();

    /**
     * Saves a given double array into the saved arr list
     * @param arr Arr to save
     */
    public void saveCurrentArray(double[] arr){
        savedArr.add(arr);
    }

    /**
     * Gets all saved Arrays and returns them
     * @return ArrayList with all saved arrays
     */
    public ArrayList<double[]> getAllSavedArrays(){
        return savedArr;
    }

    /**
     * Finds an specific array in the list and returns it
     * @param index Where to find it
     * @return Found Array
     */
    public double[] getSpecificArray(int index){
        return savedArr.get(index);
    }
    //endregion

    //region Some Methods

    //region Press Enter To Continue
    /**
     * What the methode name already explains
     */
    public void pressEnterToContinue(){
        writeInfo("Do you want to save the result to your list? (Y/N)");
        switch (readChoice(new String[]{"y","n"})){
            case "y" -> {
                writeError("Not added yet! Sorry :/");
                return;
            }
            case "n" -> {
                return;
            }
        }
    }
    //endregion

    //region Clear
    /**
     * Clears the console
     */
    public void clear(){
        /* Maybe Later but for now its not working in the IDE
        System.out.flush();
        try {
            outStream.flush();
            Thread.sleep(100);
        }catch (Exception e){
            e.printStackTrace();
        }*/
        for(int i = 0; i < 40; i++){
            writeEmptyLine("");
        }
    }
    //endregion

    //region Loading Emulator
    /**
     * Emulating loading
     * @param loadingName Name of the thing to load
     * @param loadingTime Time to load in ms
     */
    public void loadingEmulator(String loadingName, int loadingTime){
        long loadingTimeDiv = loadingTime / 4;

        try{
            writeInfo("Loading " + loadingName + " now");
            writeWithTag("Loading" );

            //1/4 loadingTime
            Thread.sleep(loadingTimeDiv);
            write(".");

            //1/4 loadingTime
            Thread.sleep(loadingTimeDiv);
            write(".");

            //1/4 loadingTime
            Thread.sleep(loadingTimeDiv);
            write(".");

            //1/4 loadingTime
            Thread.sleep(loadingTimeDiv);
            write("\n");
        }catch (Exception e){}
    }
    //endregion

    //region Get Input
    /**
     * Standard equation beginning. To select a saved array or create new one.
     * @return
     */
    public double[] getInput(){
        writeInfo("Do you want to use one of your saved arrays? (Y/N)");
        String choice = readChoice(new String[]{"n", "y"});
        if(choice.contains("y")){
            writeError("Function not implemented yet.");
            return readInput();
        }
        if(choice.contains("n")){
            return readInput();
        }

        return null;
    }

    public double[] getInput(String name){
        writeInfo("For the variable: " + name );
        return getInput();
    }
    //endregion

    //region Create Sub Menu
    /**
     * Prints an dynamical created Sub Menu
     * @param title Title Text
     * @param subMenus Menus
     */
    public void createSubMenu(String title, SubMenu[] subMenus){
        clear();
        int headerLength = title.length() + 19;
        int bottomLength = 0;

        int longestWord = subMenus[0].name.length();
        for(int i = 1; i < subMenus.length; i++){
            if(subMenus[i].name.length() > longestWord){
                longestWord = subMenus[i].name.length();
            }
        }

        if(headerLength < (longestWord + 14)){
            headerLength = longestWord + 14;
            String spacer = "";

            //19
            if(headerLength % 2 != 0){
                headerLength += 1;

                int ex = headerLength - title.length() - 19;
                for(int i = 0; i < ex / 2; i++){
                    spacer += "─";
                }

            }else{

                int ex = headerLength - title.length() - 19;

                if(ex % 2 != 0){
                    ex = ex + 1;
                    headerLength++;
                }

                for(int i = 0; i < ex / 2; i++){
                    spacer += "─";
                }

            }
            writeLine("╔═⸗═══─"+spacer+"─{ "+title+" }─"+spacer+"─════╗");//19


            bottomLength = headerLength - 19;


        }else{
            if(headerLength % 2 != 0){
                headerLength += 1;
                bottomLength = headerLength - 19;
                writeLine("╔═⸗═══──{ "+title+" }───════╗");//20
            }else{
                bottomLength = headerLength - 19;
                writeLine("╔═⸗═══──{ "+title+" }──════╗");//19
            }
        }

        for(int i = 0; i < subMenus.length; i++){
            String name = subMenus[i].name;
            int index = subMenus[i].index;
            int length = headerLength - (name.length() + 14);
            String chain = "";

            for(int j = 0; j < length; j++){
                chain += "─";
            }

            writeLine("╠═─ "+index+" : "+name+" ⸗"+chain+"──═╣");
        }

        String bottomFill = "";
        String bottomFill2 = "";

        for(int i = 0; i < bottomLength; i++){
            double flip = Math.random() * 2;
            int fli = (int)flip;
            if(fli == 1){
                bottomFill += "═";
            }else{
                bottomFill += "─";
            }

            bottomFill2 += "─";
        }

        writeLine("╠═─ 0 : ←─Back⸗─" + bottomFill2 + "─═╣");
        writeLine("╚═══───══"+ bottomFill +"══───══⸗═╝"); //19
    }
    //endregion

    //endregion
}

//region SUBMENU Class
class SubMenu{
    int index;
    String name;

    public SubMenu(int i, String name){
        this.index = i;
        this.name = name;
    }
}
//endregion

//region Colors Class
/**
 * SOURCE: https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
 */
class Colors{
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE
}
//endregion