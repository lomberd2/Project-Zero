package Menu;

import Main.Main;

import java.util.ArrayList;

public class Console {
    //<editor-fold desc="All Write">
    //region Write
    /**
     * Modified Print
     * @param input Console Input
     */
    public void write(String input){
        System.out.print(input);
    }

    /**
     * Same as above but with ~fancy~ color
     * @param input Console Input
     * @param color color
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
     * @param color color
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
        }catch (Exception e){
            e.printStackTrace();
        }
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
        }catch (Exception e){
            e.printStackTrace();
        }
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
    //</editor-fold>

    //region Print Result
    /**
     * Prints input as a result
     * @param text Result
     */
    public void printResult(String text){
        write("\n" + Colors.GREEN_BACKGROUND + "[CalcEXTREME][RESULT]: " + text + Colors.RESET + "\n\n");
    }

    /**
     * Prints an double array as an result
     * @param output out
     */
    public void printResult(double[] output){
        int i = 0;
        write("\n" + Colors.GREEN_BACKGROUND + "[CalcEXTREME][RESULT]: " + "\n");
        for(double value: output){
            i++;
            write("\tArray["+i+"] : " + value + "\n");
        }
        write(Colors.RESET + "\n\n");
    }

    /**
     * Prints an array with a given tag name
     * @param output array to print
     * @param name tag name
     */
    public void printResult(double[] output, String name){
        int i = 0;
        write("\n" + Colors.GREEN_BACKGROUND + "[CalcEXTREME][RESULT]: " + "\n");
        for(double value: output){
            i++;
            write("\t"+name+"["+i+"] : " + value + "\n");
        }
        write(Colors.RESET + "\n\n");
    }

    /**
     * Prints an matrix array as an result
     * @param output out
     */
    public void printResult(double[][] output){
        write("\n" + Colors.GREEN_BACKGROUND + "[CalcEXTREME][RESULT]: " + "\n");
        for(int i = 0; i < output.length; i++){
            for(int j = 0; j < output[i].length; j++){
                write("Value for Array["+i+"]["+j+"] : " + output[i][j] + "\n");
            }
        }
        write(Colors.RESET + "\n\n");
    }
    //endregion

    //region Read Stuff

    //region Read Integer
    /**
     * Just a handy methode to use the IO class in console
     * @return out
     */
    public int readInt(){
        return IO.readInteger();
    }
    //endregion

    //region Read Double
    /**
     * Same as above. Just outsourced it here.
     * @return out
     */
    public double readDouble() {
        return IO.readDouble();
    }
    //endregion

    //region Read Number
    /**
     * Same again. Just outsourced it here... Again.
     * @return out
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
        ArrayList<Double> inputArray = new ArrayList<>();

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

                double in = Double.parseDouble(input.toLowerCase().trim().replace(",", "."));
                inputArray.add(in);
            }
            catch (Exception e){
                writeError("Whops. Something went wrong. But keep on typing :)");
            }
        }
    }

    /**
     * Same as above but with Matrix
     * @param value1Description description
     * @param value2Description description
     * @return result
     */
    public double[][] readDoubleInput(String value1Description, String value2Description){
        ArrayList<double[]> temp = new ArrayList<>();
        int index = 0;

        writeInfo("Please type in your numbers and separate them via enter.", 1500);
        boolean running = true;
        while (running){
            double input1;
            double input2;

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
            if(readChoice(new String[]{"y","n"}).contains("n")){
                running = false;
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

    /**
     * Reads matrix array
     * @param i size of i
     * @param j size of j
     * @return matrix
     */
    public double[][] readDoubleInput(int i, int j){
        double[][] out = new double[i][j];
        for(int is = 0; is < out.length; is++){
            for(int js = 0; js < j; js++){
                write("Please enter value for Array["+is+"]["+js+"] : ");
                out[is][js] = readDouble();
            }
        }
        return out;
    }

    /**
     * Reads an input with a given size
     * @param size input size
     * @return input[]
     */
    public double[] readInput(int size){
        double[] temp = new double[size];
        clear();
        writeInfo("Please enter the values for an array with the size of " + size);
        for(int i = 0; i < temp.length; i++){
            write("[INPUT] Number ["+i+"]: ");
            temp[i] = readDouble();
        }
        return temp;
    }

    //endregion

    //region Read Choice
    /**
     * Reads an input from an user and makes im choose one of the pre defined words
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
    private ArrayList<SavedArray> savedArrays = new ArrayList<>();

    //<editor-fold desc="Save Current Arrays">
    /**
     * Gets an array and saves it in RAM
     * @param input Arr to save
     */
    public void saveCurrentArray(double[] input){
        String name = getArrayName();
        savedArrays.add(new SavedArray(input, name));
    }

    /**
     * Same as above
     * @param input input
     * @param description description
     */
    public void saveCurrentArray(double[] input, String description){
        String name = getArrayName();
        savedArrays.add(new SavedArray(input, name, description));
    }

    /**
     * Same as above
     * @param input input1
     * @param input2 input2
     */
    public void saveCurrentArray(double[] input, double[] input2){
        String name = getArrayName();
        savedArrays.add(new SavedArray(input, input2, name));
    }

    /**
     * Same as above
     * @param input input1
     * @param result input2
     */
    public void saveCurrentArray(double[] input, double result){
        String name = getArrayName();
        savedArrays.add(new SavedArray(input, result, name));
    }

    /**
     * Same as above
     * @param input input1
     * @param input2 input2
     * @param description description
     */
    public void saveCurrentArray(double[] input, double[] input2, String description){
        String name = getArrayName();
        savedArrays.add(new SavedArray(input, input2, name, description));
    }

    /**
     * Same as above
     * @param input input1
     * @param result results
     * @param description description
     */
    public void saveCurrentArray(double[] input, double result, String description){
        String name = getArrayName();
        savedArrays.add(new SavedArray(input, result, name, description));
    }

    /**
     * Same as above
     * @param input input1
     * @param input2 input2
     * @param result result
     */
    public void saveCurrentArray(double[] input, double[] input2, double result){
        String name = getArrayName();
        savedArrays.add(new SavedArray(input, input2, result, name));
    }

    /**
     * Same as above
     * @param input input
     * @param input2 input2
     * @param result result
     * @param description description
     */
    public void saveCurrentArray(double[] input, double[] input2, double result, String description){
        String name = getArrayName();
        savedArrays.add(new SavedArray(input, input2, result, name, description));
    }

    /**
     * Same as above
     * @param input input1
     * @param input2 input2
     * @param resultArr result Array
     */
    public void saveCurrentArray(double[] input, double[] input2, double[] resultArr){
        String name = getArrayName();
        savedArrays.add(new SavedArray(input, input2, resultArr, name));
    }

    /**
     * Same as above
     * @param input input1
     * @param input2 input2
     * @param resultArr result Array
     * @param description description
     */
    public void saveCurrentArray(double[] input, double[] input2, double[] resultArr, String description){
        String name = getArrayName();
        savedArrays.add(new SavedArray(input, input2, resultArr, name, description));
    }

    /**
     * Reads the name of the array
     * @return Array name
     */
    private String getArrayName(){
        writeInfo("Please enter a name for your array!");
        write("Name: ");
        return IO.readAnything();
    }
    //</editor-fold>

    /**
     * Gets all saved Arrays and returns them
     * @return ArrayList with all saved arrays
     */
    public ArrayList<SavedArray> getAllSavedArrays(){
        return savedArrays;
    }

    /**
     * Finds an specific array in the list and returns it
     * @param index Where to find it
     * @return Found Array
     */
    public SavedArray getSpecificArray(int index){
        return savedArrays.get(index);
    }

    /**
     * Gets the size of the arrays and returns it
     * @return size or length of arrays
     */
    public int countSavedArrays(){
        return savedArrays.size();
    }

    /**
     * Gets the name of an given array index
     * @param i index
     * @return name
     */
    public String getArrName(int i){
        return savedArrays.get(i).name;
    }

    /**
     * Prints all the saved arrays
     */
    public void printAllSavedArrays(){
        if(Main.isDebug){
            for(int ind = 0; ind < 21; ind++){
                SavedArray arr = new SavedArray(new double[]{50*Math.random(),50*Math.random(),50*Math.random()}, "["+ind+"] Array");
                savedArrays.add(arr);
            }
        }

        int savedArrSize = countSavedArrays();

        if(savedArrSize == 0){
            writeInfo("No saved arrays here. Sorry. Write something first.");
            return;
        }

        int menuSize = 5, lastIndex = 0, currentIndex = 0;
        int i;

        while(true){
            ArrayList<SubMenu> subMenus = new ArrayList<>();
            boolean isRun = true;

            i = 0;
            while (isRun){
                int is = lastIndex + i;
                subMenus.add(new SubMenu(i + 1, getArrName(is)));

                i++;
                is++;
                writeLine("is: ["+is+"] savedArrSize: [" + savedArrSize + "] Last Index: [" + lastIndex + "]");
                if(is > savedArrSize - 1){
                    currentIndex = is;
                    isRun = false;
                }
                if(i > (menuSize - 1)){
                    currentIndex = is;
                    isRun = false;
                }
            }

            SubMenu[] finalSubmenu = new SubMenu[subMenus.size()];
            for(int index = 0; index < subMenus.size(); index++){
                finalSubmenu[index] = subMenus.get(index);
            }

            if(lastIndex < 5){
                createSubMenu("Saved Arrays", finalSubmenu, 0);
            }else if(currentIndex >= savedArrSize){
                createSubMenu("Saved Arrays", finalSubmenu, 1);
            }
            else{
                createSubMenu("Saved Arrays", finalSubmenu, 2);
            }

            int range = Math.max(lastIndex, currentIndex) - Math.min(lastIndex, currentIndex);
            int[] selectedItems = new int[range];
            for(int s = 0; s < selectedItems.length; s++){
                selectedItems[s] = (currentIndex - range) + s;
            }


            int choice = readChoice(new int[]{0,1,2,3,4,5,6});
            int[] returnValues = getChoiceForArrays(choice, lastIndex, currentIndex, range, savedArrSize, selectedItems, false);

            lastIndex = returnValues[0];

            int exitLoop = returnValues[1];
            if(exitLoop == 1){
                return;
            }
        }
    }

    private int[] getChoiceForArrays(int choice, int lastIndex, int currentIndex, int range, int savedArrSize, int[] selectedItems, boolean getValuesForEquation){
        int[] returnValues = new int[3];
        switch (choice){
            case 0 ->{
                lastIndex = currentIndex;

                if(lastIndex < 6 && !getValuesForEquation){
                    writeInfo("Exiting to main menu");
                    returnValues[1] = 1;
                }else{
                    if(range < 5){
                        lastIndex += -range -5;
                    }else{
                        writeInfo("Page back", 100);
                        lastIndex += (-5 * 2);
                    }
                }
            }
            case 6 ->{
                lastIndex = currentIndex;

                if(lastIndex < 5){
                    lastIndex += -range;
                }
                if(range < 5){
                    lastIndex += -range -5;
                }

                if(lastIndex >= savedArrSize){
                    lastIndex += -5;
                }else {
                    writeInfo("Next page", 100);
                }
            }
            case 1,2,3,4,5 ->{
                if(getValuesForEquation){
                    returnValues[2] = selectedItems[choice - 1];
                    returnValues[1] = 1;
                }else {
                    printSpecificArray(selectedItems[choice - 1]);
                }
            }
        }
        returnValues[0] = lastIndex;
        return returnValues;
    }

    public double[] getArrayForEquation() {
        int savedArrSize = countSavedArrays();

        if(savedArrSize == 0){
            writeInfo("No saved arrays here. Sorry. Write something first.");
            return readInput();
        }

        int menuSize = 5, lastIndex = 0, currentIndex = 0;
        int i;

        while(true){
            ArrayList<SubMenu> subMenus = new ArrayList<>();
            boolean isRun = true;

            i = 0;
            while (isRun){
                int is = lastIndex + i;
                subMenus.add(new SubMenu(i + 1, getArrName(is)));

                i++;
                is++;
                writeLine("is: ["+is+"] savedArrSize: [" + savedArrSize + "] Last Index: [" + lastIndex + "]");
                if(is > savedArrSize - 1){
                    currentIndex = is;
                    isRun = false;
                }
                if(i > (menuSize - 1)){
                    currentIndex = is;
                    isRun = false;
                }
            }

            SubMenu[] finalSubmenu = new SubMenu[subMenus.size()];
            for(int index = 0; index < subMenus.size(); index++){
                finalSubmenu[index] = subMenus.get(index);
            }

            if(lastIndex < 5){
                createSubMenu("Saved Arrays", finalSubmenu, 0);
            }else if(currentIndex >= savedArrSize){
                createSubMenu("Saved Arrays", finalSubmenu, 1);
            }
            else{
                createSubMenu("Saved Arrays", finalSubmenu, 2);
            }

            int range = Math.max(lastIndex, currentIndex) - Math.min(lastIndex, currentIndex);
            int[] selectedItems = new int[range];
            for(int s = 0; s < selectedItems.length; s++){
                selectedItems[s] = (currentIndex - range) + s;
            }


            int choice = readChoice(new int[]{0,1,2,3,4,5,6});
            int[] returnValues = getChoiceForArrays(choice, lastIndex, currentIndex, range, savedArrSize, selectedItems, true);

            lastIndex = returnValues[0];

            int exitLoop = returnValues[1];
            if(exitLoop == 1){
                return getArray(returnValues[2]);
            }
        }
    }

    private double[] getArray(int i){
        SavedArray arr = getSpecificArray(i);

        if(arr.resultArray.length != 0){
            return arr.resultArray;
        }

        if(arr.input2.length != 0){
            writeLine("Do you want to use your first(1) or second(2) input?");
            if(readChoice(new int[]{1,2}) == 1){
                return arr.input;
            }else{
                return arr.input2;
            }
        }

        return arr.input;
    }

    public void printSpecificArray(int i){
        clear();

        SavedArray arr = getSpecificArray(i);

        writeLine("Name: " + arr.name);
        if(!arr.description.isEmpty()) {
            writeLine("Description: " + arr.description);
        }

        writeLine("Input: \n");
        printArray(arr.input);

        if(arr.input2.length > 0) {
            writeLine("Input2: \n");
            printArray(arr.input2);
        }

        if(arr.resultArray.length > 0){
            writeLine("Result Array: \n");
            printArray(arr.resultArray);
        }

        if(arr.result != 0){
            writeLine("Result: " + arr.result + "\n");
        }


        pressEnter();
    }

    public void printArray(double[] arr){
        int i = 0;
        for(double value: arr){
            i++;
            write("\tArray["+i+"] : " + value + "\n");
        }
        write("\n");
    }
    //endregion

    public void pressEnter(){
        write("\n\nPress enter to continue");
        IO.readAnything();
    }

    //<editor-fold desc="Enter to Continue">
    /**
     * Asks if user wants to save stuff
     */
    public void pressEnterToContinue(double[] arr){
        writeInfo("Do you want to save the result to your list? (Y/N)");
        if ("y".equals(readChoice(new String[]{"y", "n"}))) {
            saveCurrentArray(arr);
        }
    }

    /**
     * Asks if user wants to save stuff
     */
    public void pressEnterToContinue(double[] arr, String description){
        writeInfo("Do you want to save the result to your list? (Y/N)");
        if ("y".equals(readChoice(new String[]{"y", "n"}))) {
            saveCurrentArray(arr, description);
        }
    }

    /**
     * Asks if user wants to save stuff
     */
    public void pressEnterToContinue(double[] arr, double results){
        writeInfo("Do you want to save the result to your list? (Y/N)");
        if ("y".equals(readChoice(new String[]{"y", "n"}))) {
            saveCurrentArray(arr, results);
        }
    }

    /**
     * Asks if user wants to save stuff
     */
    public void pressEnterToContinue(double[] arr, double results, String description){
        writeInfo("Do you want to save the result to your list? (Y/N)");
        if ("y".equals(readChoice(new String[]{"y", "n"}))) {
            saveCurrentArray(arr, results, description);
        }
    }

    /**
     * Asks if user wants to save stuff
     */
    public void pressEnterToContinue(double[] arr, double[] arr2){
        writeInfo("Do you want to save the result to your list? (Y/N)");
        if ("y".equals(readChoice(new String[]{"y", "n"}))) {
            writeInfo("Saving first array: ");
            saveCurrentArray(arr);

            writeInfo("Saving second array: ");
            saveCurrentArray(arr2);
        }
    }

    /**
     * Asks if user wants to save stuff
     */
    public void pressEnterToContinue(double[] arr, double[] arr2, String description){
        writeInfo("Do you want to save the result to your list? (Y/N)");
        if ("y".equals(readChoice(new String[]{"y", "n"}))) {
            saveCurrentArray(arr, arr2, description);
        }
    }

    /**
     * Asks if user wants to save stuff
     */
    public void pressEnterToContinue(double[] arr, double[] arr2, double[] resultArr){
        writeInfo("Do you want to save the result to your list? (Y/N)");
        if ("y".equals(readChoice(new String[]{"y", "n"}))) {
            saveCurrentArray(arr, arr2, resultArr);
        }
    }

    /**
     * Asks if user wants to save stuff
     */
    public void pressEnterToContinue(double[] arr, double[] arr2, double[] resultArr, String description){
        writeInfo("Do you want to save the result to your list? (Y/N)");
        if ("y".equals(readChoice(new String[]{"y", "n"}))) {
            saveCurrentArray(arr, arr2, resultArr, description);
        }
    }

    /**
     * Asks if user wants to save stuff
     */
    public void pressEnterToContinue(double[] arr, double[] arr2, double result){
        writeInfo("Do you want to save the result to your list? (Y/N)");
        if ("y".equals(readChoice(new String[]{"y", "n"}))) {
            saveCurrentArray(arr, arr2, result);
        }
    }

    /**
     * Asks if user wants to save stuff
     */
    public void pressEnterToContinue(double[] arr, double[] arr2, double result, String description){
        writeInfo("Do you want to save the result to your list? (Y/N)");
        if ("y".equals(readChoice(new String[]{"y", "n"}))) {
            saveCurrentArray(arr, arr2, result, description);
        }
    }
    //</editor-fold>

    //<editor-fold desc="Clear">
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
    //</editor-fold>

    //<editor-fold desc="Loading Emulator">
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
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //</editor-fold>

    //<editor-fold desc="Get Input">
    /**
     * Standard equation beginning. To select a saved array or create new one.
     * @return input
     */
    public double[] getInput(){
        writeInfo("Do you want to use one of your saved arrays? (Y/N)");
        String choice = readChoice(new String[]{"n", "y"});
        if(choice.contains("y")){
            return getArrayForEquation();
        }
        if(choice.contains("n")){
            return readInput();
        }

        return null;
    }

    /**
     * Same as above but with name given
     * @param name variable name
     * @return input
     */
    public double[] getInput(String name){
        writeInfo("For the variable: " + name );
        return getInput();
    }
    //</editor-fold>

    //<editor-fold desc="Create Sub Menu">
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

    /**
     * Same as above but with more than one page
     * @param title title
     * @param subMenus menus
     * @param caseNum case
     */
    public void createSubMenu(String title, SubMenu[] subMenus, int caseNum){
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

        if(caseNum == 0){
            writeLine("╠═─ 6 : ─→Next⸗─" + bottomFill2 + "─═╣");
            writeLine("╠═─ 0 : ←─Exit⸗─" + bottomFill2 + "─═╣");
        } else if(caseNum == 1) {
            writeLine("╠═─ 0 : ←─Back⸗─" + bottomFill2 + "─═╣");
        }else if(caseNum == 2){
            writeLine("╠═─ 0 : ←─Exit⸗─" + bottomFill2 + "─═╣");
        }
        else{
            writeLine("╠═─ 6 : ─→Next⸗─" + bottomFill2 + "─═╣");
            writeLine("╠═─ 0 : ←─Back⸗─" + bottomFill2 + "─═╣");
        }

        writeLine("╚═══───══"+ bottomFill +"══───══⸗═╝"); //19
    }
    //</editor-fold>

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

class SavedArray{
    public int i;
    public String name;
    public String description = "";

    public double[] input;
    public double[] input2 = new double[0];

    public double[] resultArray = new double[0];
    public double result = 0;

    SavedArray(double[] input, String name, String description){
        this.input = input;
        this.name = name;
        this.description = description;
    }

    SavedArray(double[] input, double[] resultArray, String name){
        this.input = input;
        this.resultArray = resultArray;
        this.name = name;
    }

    SavedArray(double[] input, double[] resultArray, String name, String description){
        this.input = input;
        this.resultArray = resultArray;
        this.name = name;
        this.description = description;
    }

    SavedArray(double[] input, double result, String name){
        this.input = input;
        this.result = result;
        this.name = name;
    }

    SavedArray(double[] input, double result, String name, String description){
        this.input = input;
        this.result = result;
        this.name = name;
        this.description = description;
    }

    SavedArray(double[] input, double[] input2, double result, String name){
        this.input = input;
        this.input2 = input2;
        this.result = result;
        this.name = name;
    }

    SavedArray(double[] input, double[] input2, double result, String name, String description){
        this.input = input;
        this.input2 = input2;
        this.result = result;
        this.name = name;
        this.description = description;
    }

    SavedArray(double[] input, double[] input2, double[] resultArray, String name){
        this.input = input;
        this.input2 = input2;
        this.resultArray = resultArray;
        this.name = name;
    }

    SavedArray(double[] input, double[] input2, double[] resultArray, String name, String description){
        this.input = input;
        this.input2 = input2;
        this.resultArray = resultArray;
        this.name = name;
        this.description = description;
    }

    public SavedArray(double[] input, String name) {
        this.input = input;
        this.name = name;
    }
}

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