package Menu;

public class Menu {
    //<editor-fold desc="Header">
    public static Console console;
    private static boolean isRunning = true;

    /* Char Table #QuickLookUp
     * ### VERSION : START
     * - TOP : ╔══════╗
     * - MID : ╠═    ═╣
     * - BOT : ╚══════╝
     * - SPECIAL CHAR : ░▒▓╠═ ═╣
     */
    //</editor-fold>


    //<editor-fold desc="Startup">
    /**
     * Prints the Logo and runs the Initialisation
     */
    public static void start() throws Exception{
        //Programm LOGO
        System.out.println("╔═════════════════════════════════════════════════════╗");
        System.out.println("╠  Loading Math Calculator EXTREME aka Project Zero   ╣");
        System.out.println("╠    ░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓    ╣");
        System.out.println("╠ ░▒▓░▒▓░░░░▒▓░▒▓░▒▓░▒░░░░░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓ ╣");
        System.out.println("╠    ░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░░░░░░░▒▓░▒▓░▒▓░▒▓    ╣");
        System.out.println("╠    ░▒▓░░░░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓    ╣");
        System.out.println("╠    ░▒▓░▒▓░▒▓░▒▓░▒▓░░░░░░░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓    ╣");
        System.out.println("╠    ░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓    ╣");
        System.out.println("╠     Created by XimBaumY, JanderLP and lomberd2      ╣");
        System.out.println("╚═════════════════════════════════════════════════════╝");

        Thread.sleep(500);

        //Loading Init
        System.out.print("[CalcEXTREME]: Loading");
        init();

        //Loading emulator
        console.write(".");
        Thread.sleep(500);

        console.write(".");
        Thread.sleep(500);

        console.write(".");
        Thread.sleep(500);
        console.write("\n");

        console.writeLine("Done loading \n", Colors.YELLOW);
        Thread.sleep(1500);

        //Loading main menu
        mainMenu();
    }
    //</editor-fold>

    //<editor-fold desc="Main Menu Stuff">
    /**
     * Main Methode for the Menu
     */
    private static void mainMenu() throws Exception{

        loadingEmulator("Main Menu");

        //MainLoop
        while(isRunning){
            //Main Menu Print
            printMainMenu();

            //Selection
            console.write("\nSelect function: ");
            selectionMenu(console.readInt());
        }
    }

    /**
     * The selection switch from the main menu
     * @param selection Selected option
     */
    private static void selectionMenu(int selection) throws Exception{
        switch (selection){
            case 0 -> isRunning = false;
            case 1 -> statistik();
            default -> {
                    console.writeError("Whooops there's an error!");
                    Thread.sleep(1500);
            }
        }
    }

    /**
     * Prints the Main Menu
     */
    private static void printMainMenu(){
        console.writeLine("╔═════════════════════════════════════════════════════╗");
        console.writeLine("╠═──────────────────{  MAIN MENU  }──────────────────═╣");
        console.writeLine("╠═─ 1 : Statistics (Min, Max, Span, etc.) ───────────═╣");
        console.writeLine("╠═─ 2 : Wachstum & Zerfall ──────────────────────────═╣");
        console.writeLine("╠═─ 3 : Quad. Gleichungen ───────────────────────────═╣");
        console.writeLine("╠═─ 4 : Vektorrechnung ──────────────────────────────═╣");
        console.writeLine("╠═─ 5 : Matrizenrechnung ────────────────────────────═╣");
        console.writeLine("╠═─ 0 : Exit ────────────────────────────────────────═╣");
        console.writeLine("╚═════════════════════════════════════════════════════╝");
    }
    //</editor-fold>

    private static void init(){
        console = new Console();
    }

    //<editor-fold desc="Statistik Stuff">

    /**
     * Loading main menu for statistics stuff. Includes the loop and logik for the menu.
     */
    private static void statistik() throws Exception{
        //Emulate Loading
        loadingEmulator("Statistics menu");

        while (true){
            //Print Main Menu
            printStatisticsMenu();

            //Selection
            console.write("\nSelect function: ");

            switch (console.readInt()){
                case 0 -> {
                    console.writeLine("Returning to Main menu");
                    Thread.sleep(1000);
                    return;
                }
                case 1 -> {
                    console.writeLine("Opening selection 1");
                    Thread.sleep(500);
                    minStatsSelected();
                }
                default -> {
                    console.writeLine("Whoops something went wrong!", Colors.RED);
                    Thread.sleep(1000);
                }
            }
        }
    }

    /**
     * Just prints the statistics menu
     */
    private static void printStatisticsMenu(){
        console.writeLine("╔═════════════════════════════════════════════════════╗");
        console.writeLine("╠═─────────────────{  Statistics  }──────────────────═╣");
        console.writeLine("╠═─ 1 : Min (Get the lowest number from two) ────────═╣");
        console.writeLine("╠═─ 2 : Max (Get the highest number from two) ───────═╣");
        console.writeLine("╠═─ 3 : Span (Get the range between min and max) ────═╣");
        console.writeLine("╠═─ 4 : Vektorrechnung ──────────────────────────────═╣");
        console.writeLine("╠═─ 5 : Matrizenrechnung ────────────────────────────═╣");
        console.writeLine("╠═─ 0 : Exit ────────────────────────────────────────═╣");
        console.writeLine("╚═════════════════════════════════════════════════════╝");
    }

    //<editor-fold desc="Minimum">
    /**
     * Contains the logik for min function
     */
    private static void minStatsSelected(){
        console.writeWithTag("Please type the first number: ");
        double number1 = console.readNumber();

        console.writeWithTag("Please input the second number: ");
        double number2 = console.readNumber();

        double min = Statistik.Minimum.getMinimum(number1, number2);

        console.writeInfo("The lowest number is: " + min);

        console.pressEnterToContinue();
    }

    /**
     * Method for Max Integer
     */
    private static void getMax(){
        console.writeWithTag("Please type the first number: ");
        double number1 = console.readDouble();

        console.writeWithTag("Please input the second number: ");
        double number2 = console.readDouble();

        double min = Statistik.Maximum.getMaximum(number1, number2);

        console.writeInfo("The lowest number is: " + min);

        console.pressEnterToContinue();
    }
    //</editor-fold>

    /**
     * Contains the logic for max function
     */
    private static void maxStatsSelected(){

    }
    //</editor-fold>

    /**
     * Just a handy emulator for loading stuff
     * @param loadingText Text to display
     * @throws Exception Just an exception because of "Thread.sleep"
     */
    private static void loadingEmulator(String loadingText) throws Exception{
        //Loading
        console.writeWithTag(loadingText + " loading");
        Thread.sleep(500);

        console.write(".");
        Thread.sleep(500);

        console.write(".");
        Thread.sleep(500);

        console.write(".");
        Thread.sleep(500);
        console.write("\n");
    }
}
