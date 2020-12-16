package Menu;

import Statistics.Span;
import Math.*;

public class Menu {
    //<editor-fold desc="Header">
    public static Console console = new Console();

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

        //Loading main menu
        mainMenu();
    }
    //</editor-fold>

    //<editor-fold desc="Main Menu">
    /**
     * Main Methode for the Menu
     */
    private static void mainMenu(){
        console.loadingEmulator("Main Menu", 3000);
        while(true){
            //Main Menu Print
            console.clear();
            console.writeLine("╔═════════════════════════════════════════════════════╗");
            console.writeLine("╠═──────────────────{  MAIN MENU  }──────────────────═╣");
            console.writeLine("╠═─ 1 : Functions (Stats,Matrix..) ──────────────────═╣");
            console.writeLine("╠═─ 2 : Saved Arrays ────────────────────────────────═╣");
            console.writeLine("╠═─ 3 : Empty Function ──────────────────────────────═╣");
            console.writeLine("╠═─ 4 : Empty Function ──────────────────────────────═╣");
            console.writeLine("╠═─ 5 : Empty Function ──────────────────────────────═╣");
            console.writeLine("╠═─ 6 : Empty Function ──────────────────────────────═╣");
            console.writeLine("╠═─ 0 : Exit ────────────────────────────────────────═╣");
            console.writeLine("╚═════════════════════════════════════════════════════╝");

            //Selection
            switch (console.readChoice(new int[]{0,1,2,3,4,5,6})){
                case 1 -> functionsMenu();
                case 2, 3, 4, 5, 6 ->{
                    console.writeInfo("Function not implemented yet");
                }
                case 0 -> {
                    return;
                }
            }
        }
    }
    //</editor-fold>

    //<editor-fold desc="Functions Menu">
    /**
     * The menu that contains the functions
     */
    private static void functionsMenu(){
        while(true){
            //Main Menu Print
            console.clear();
            console.writeLine("╔═════════════════════════════════════════════════════╗");
            console.writeLine("╠═──────────────────{  Functions  }──────────────────═╣");
            console.writeLine("╠═─ 1 : Statistics (Min, Max, Span, etc.) ───────────═╣");
            console.writeLine("╠═─ 2 : Growth and decay ────────────────────────────═╣");
            console.writeLine("╠═─ 3 : Quadratic equation ──────────────────────────═╣");
            console.writeLine("╠═─ 4 : Vector calculation ──────────────────────────═╣");
            console.writeLine("╠═─ 5 : Matrix calculation ──────────────────────────═╣");
            console.writeLine("╠═─ 0 : Exit ────────────────────────────────────────═╣");
            console.writeLine("╚═════════════════════════════════════════════════════╝");

            //Selection
            switch (console.readChoice(new int[]{0,1,2,3,4,5})){
                case 1 -> statistic();
                case 2 -> growthAndDecaySelected();
                case 3, 4, 5 ->{
                    console.writeInfo("Function not implemented yet");
                }
                case 0 -> {
                    return;
                }
            }
        }
    }
    //</editor-fold>

    //<editor-fold desc="Statistics Stuff">

    //<editor-fold desc="Statistics Startup">
    /**
     * Loading main menu for statistics stuff. Includes the loop and logic for the menu.
     */
    private static void statistic(){
        //Emulate Loading
        console.loadingEmulator("Statistics", 3000);
        printStatisticsMenu();
    }
    //</editor-fold>

    //<editor-fold desc="Statistics Menus">

    //<editor-fold desc="First Menu">
    /**
     * Handles the First Page of the Statistics menu
     */
    private static void printStatisticsMenu(){
        while (true){
            console.clear();
            console.writeLine("╔═══════════════════════════════════════════════════════════════════╗");
            console.writeLine("╠═────────────────────────{  Statistics  }─────────────────────────═╣");
            console.writeLine("╠═─ 1 : Minimum (Get the lowest number from two) ──────────────────═╣");
            console.writeLine("╠═─ 2 : Maximum (Get the highest number from two) ─────────────────═╣");
            console.writeLine("╠═─ 3 : Span (Get the range between min and max) ──────────────────═╣");
            console.writeLine("╠═─ 4 : Maximum deviation between two neighboring measured values ─═╣");
            console.writeLine("╠═─ 5 : Minimal deviation of two neighboring measured values ──────═╣");
            console.writeLine("╠═─ 6 : Next Page ─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─═╣");
            console.writeLine("╠═─ 0 : Exit ──────────────────────────────────────────────────────═╣");
            console.writeLine("╚═══════════════════════════════════════════════════════════════════╝");

            switch (console.readChoice(new int[]{0,1,2,3,4,5,6})){
                case 0 -> {
                    console.writeInfo("Returning to Main menu");
                    return;
                }
                case 1 -> {
                    console.writeInfo("Opening: Minimum");
                    minStatsSelected();
                }
                case 2 -> {
                    console.writeInfo("Opening: Maximum");
                    maxStatsSelected();
                }
                case 3 -> {
                    console.writeInfo("Opening: Span");
                    spanMenuSelected();
                }
                case 4, 5 ->{
                    console.writeInfo("Not implemented yet");
                }
                case 6 ->{
                    printStatisticsMenuPage2();
                }
            }
        }
    }
    //</editor-fold>

    //<editor-fold desc="Second Menu">
    /**
     * Handles the second page from the statistics menu
     */
    private static void printStatisticsMenuPage2(){
        while(true){
            console.clear();
            console.writeLine("╔═══════════════════════════════════════════════════════════════════╗");
            console.writeLine("╠═────────────────────────{  Statistics  }─────────────────────────═╣");
            console.writeLine("╠═─ 1 : Median ────────────────────────────────────────────────────═╣");
            console.writeLine("╠═─ 2 : Mode Value ────────────────────────────────────────────────═╣");
            console.writeLine("╠═─ 3 : Variance ──────────────────────────────────────────────────═╣");
            console.writeLine("╠═─ 4 : Standard deviation ────────────────────────────────────────═╣");
            console.writeLine("╠═─ 5 : Arithmetic mean ───────────────────────────────────────────═╣");
            console.writeLine("╠═─ 6 : Geometric mean ────────────────────────────────────────────═╣");
            console.writeLine("╠═─ 0 : ←─Page─Back────────────────────────────────────────────────═╣");
            console.writeLine("╚═══════════════════════════════════════════════════════════════════╝");

            switch (console.readChoice(new int[]{1, 0, 2, 3, 4, 5, 6})){
                case 1, 2, 3, 4 -> {
                    console.writeInfo("Function not implemented yet");
                }
                case 5 -> arithmeticMeanSelected();
                case 6 -> {
                    console.writeInfo("Geometric Mean Selected");
                    geometricMeanSelected();
                }
                case 0 ->{
                    return;
                }
            }
        }
    }
    //</editor-fold>

    //</editor-fold>

    //<editor-fold desc="First Page Functions">

    //<editor-fold desc="Minimum">
    /**
     * Contains the logik for min function
     */
    private static void minStatsSelected(){
        double[] input = console.getInput();
        console.printResult("The lowest number is: " + Statistics.Minimum.getMinimum(input));
        console.pressEnterToContinue();
    }
    //</editor-fold>

    //<editor-fold desc="Maximum">
    /**
     * Contains the logic for max function
     */
    private static void maxStatsSelected(){
        double[] input = console.getInput();
        console.printResult("The highest number is: " + Statistics.Maximum.getMaximum(input));
        console.pressEnterToContinue();
    }
    //</editor-fold>

    //<editor-fold desc="Span">
    /**
     * When the span menu gets selected
     */
    private static void spanMenuSelected(){
        double[] input = console.getInput();
        console.printResult("The span is " + Span.getSpan(input));
        console.pressEnterToContinue();
    }
    //</editor-fold>

    //</editor-fold>

    //<editor-fold desc="Second Page Functions">

    //<editor-fold desc="Standard Deviation">
    private static void standardDeviationSelected(){

    }
    //</editor-fold>

    //<editor-fold desc="Arithmetic Mean">
    private static void arithmeticMeanSelected(){
        /*SubMenu sub = new SubMenu(1,"Something really long");
        SubMenu sub2 = new SubMenu(2, "Options");
        SubMenu sub3 = new SubMenu(3, "Op Ist sehr s");

        console.createSubMenu("Arithmetic Menu", new SubMenu[]{sub, sub2, sub3});*/
        console.writeLine("Arithmetic Mean");

        double[] input = console.getInput();

        console.pressEnterToContinue();
    }
    //</editor-fold>

    //<editor-fold desc="Geometric Mean">
    private static void geometricMeanSelected(){
        console.clear();
        console.writeLine("╔═⸗═══──{ Geometric Mean }──════╗");
        console.writeLine("╠═─ 1 : Relative ⸗─────────────═╣");
        console.writeLine("╠═─ 2 : Absolute ⸗─────────────═╣");
        console.writeLine("╠═─ 3 : Without both ⸗─────────═╣");
        console.writeLine("╠═─ 0 : ←─Page⸗Back────────────═╣");
        console.writeLine("╚══════════════════════════⸗════╝");
        switch (console.readChoice(new int[]{0,1,2,3})){
            case 1 -> relGeoMean();
            case 2 -> absGeoMean();
            case 3 -> withoutGeo();
            case 0 -> {}
        }
    }

    private static void relGeoMean(){
        double[] input1 = console.getInput("Test");

        double[] input2 = console.getInput("Test 2");
    }

    private static void absGeoMean(){

    }

    private static void withoutGeo(){

    }
    //</editor-fold>

    //</editor-fold>


    //</editor-fold>

    //<editor-fold desc="Growth and Decay">
    /**
     * Handelling the selection
     */
    private static void growthAndDecaySelected(){
        console.clear();
        console.writeLine("╔═══──{ Growth and Decay }──═══╗");
        console.writeLine("╠═─ 1 : Growth ←──────────────═╣");
        console.writeLine("╠═─ 2 : Decay ←───────────────═╣");
        console.writeLine("╠═─ 0 : ←─Back────────────────═╣");
        console.writeLine("╚══════════════════════════════╝");
        switch (console.readChoice(new int[]{0,1,2})){
            case 1 -> growth();
            case 2 -> decay();
            case 0 -> {}
        }
    }

    //<editor-fold desc="Growth">
    /**
     * Handles the growth calculation
     */
    private static void growth(){
        console.clear();

        console.writeLine("-Growth-\n");

        console.write("Please enter the starting value: ");
        double startValue = console.readDouble();

        console.write("Please enter the duration in days: ");
        double duration = console.readDouble();

        console.write("Please enter the factor of growth: ");
        double factor = console.readDouble();
        console.write("\n");

        console.printResult("The end result after "+ duration+ " days is " + Growth.getGrowth(startValue, duration, factor) );

        console.pressEnterToContinue();
    }
    //</editor-fold>

    //<editor-fold desc="Decay">
    /**
     * Handles the decay calculation
     */
    private static void decay(){
        console.clear();

        console.writeLine("-Decay-\n");

        console.write("Please enter the starting value: ");
        double startValue = console.readDouble();

        console.write("Please enter the duration in days: ");
        double duration = console.readDouble();

        console.write("Please enter the factor of decay: ");
        double factor = console.readDouble();
        console.write("\n");

        console.printResult("The end result after "+ duration+ " days is " + Decay.getDecay(startValue, duration, factor) );

        console.pressEnterToContinue();
    }
    //</editor-fold>

    //</editor-fold>
}
