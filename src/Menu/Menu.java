package Menu;

import Statistics.*;
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
        //Program LOGO
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
            /*console.clear();
            console.writeLine("╔═════════════════════════════════════════════════════╗");
            console.writeLine("╠═──────────────────{  MAIN MENU  }──────────────────═╣");
            console.writeLine("╠═─ 1 : Functions (Stats,Matrix..) ──────────────────═╣");
            console.writeLine("╠═─ 2 : Saved Arrays ────────────────────────────────═╣");
            console.writeLine("╠═─ 3 : Empty Function ──────────────────────────────═╣");
            console.writeLine("╠═─ 4 : Empty Function ──────────────────────────────═╣");
            console.writeLine("╠═─ 5 : Empty Function ──────────────────────────────═╣");
            console.writeLine("╠═─ 6 : Empty Function ──────────────────────────────═╣");
            console.writeLine("╠═─ 0 : Exit ────────────────────────────────────────═╣");
            console.writeLine("╚═════════════════════════════════════════════════════╝");*/

            SubMenu[] subMenus = new SubMenu[5];
            subMenus[0] = new SubMenu(1, "Functions (Stats,Matrix..)");
            subMenus[1] = new SubMenu(2, "Saved Arrays");
            subMenus[2] = new SubMenu(3, "Empty Function");
            subMenus[3] = new SubMenu(4, "Empty Function");
            subMenus[4] = new SubMenu(5, "Empty Function");

            console.createSubMenu("MAIN MENU", subMenus, 1);

            //Selection
            switch (console.readChoice(new int[]{0,1,2,3,4,5,6})){
                case 1 -> functionsMenu();
                case 2 -> console.printAllSavedArrays();
                default -> console.writeInfo("Function not implemented yet");
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
            /*console.clear();
            console.writeLine("╔═════════════════════════════════════════════════════╗");
            console.writeLine("╠═──────────────────{  Functions  }──────────────────═╣");
            console.writeLine("╠═─ 1 : Statistics (Min, Max, Span, etc.) ───────────═╣");
            console.writeLine("╠═─ 2 : Growth and decay ────────────────────────────═╣");
            console.writeLine("╠═─ 3 : Quadratic equation ──────────────────────────═╣");
            console.writeLine("╠═─ 4 : Vector calculation ──────────────────────────═╣");
            console.writeLine("╠═─ 5 : Matrix calculation ──────────────────────────═╣");
            console.writeLine("╠═─ 0 : Exit ────────────────────────────────────────═╣");
            console.writeLine("╚═════════════════════════════════════════════════════╝");*/
            SubMenu[] subMenus = new SubMenu[5];
            subMenus[0] = new SubMenu(1, "Statistics (Min, Max, Span, etc.)");
            subMenus[1] = new SubMenu(2, "Growth and decay");
            subMenus[2] = new SubMenu(3, "Quadratic equation");
            subMenus[3] = new SubMenu(4, "Vector calculation");
            subMenus[4] = new SubMenu(5, "Matrix calculation");

            console.createSubMenu("Functions", subMenus, 1);

            //Selection
            switch (console.readChoice(new int[]{0,1,2,3,4,5})){
                case 1 -> statistic();
                case 2 -> growthAndDecaySelected();
                case 3 -> quadraticEquationSelected();
                case 4 -> vectorCalculationSelected();
                case 5 -> matrixCalcSelected();
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
            /*console.clear();
            console.writeLine("╔═══════════════════════════════════════════════════════════════════╗");
            console.writeLine("╠═────────────────────────{  Statistics  }─────────────────────────═╣");
            console.writeLine("╠═─ 1 : Minimum (Get the lowest number from two) ──────────────────═╣");
            console.writeLine("╠═─ 2 : Maximum (Get the highest number from two) ─────────────────═╣");
            console.writeLine("╠═─ 3 : Span (Get the range between min and max) ──────────────────═╣");
            console.writeLine("╠═─ 4 : Maximum deviation of two neighboring measured values ──────═╣");
            console.writeLine("╠═─ 5 : Minimal deviation of two neighboring measured values ──────═╣");
            console.writeLine("╠═─ 6 : Next Page ─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─→─═╣");
            console.writeLine("╠═─ 0 : Exit ──────────────────────────────────────────────────────═╣");
            console.writeLine("╚═══════════════════════════════════════════════════════════════════╝");*/

            SubMenu[] subMenus = new SubMenu[5];
            subMenus[0] = new SubMenu(1, "Minimum (Get the lowest number from two)");
            subMenus[1] = new SubMenu(2, "Maximum (Get the highest number from two)");
            subMenus[2] = new SubMenu(3, "Span (Get the range between min and max)");
            subMenus[3] = new SubMenu(4, "Maximum deviation of two neighboring measured values");
            subMenus[4] = new SubMenu(5, "Minimal deviation of two neighboring measured values");

            console.createSubMenu("Statistics - Page [1/2]", subMenus, 0);

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
                case 4 -> {
                    console.writeInfo("Opening: Maximum Deviation");
                    maxDeviSelected();
                }
                case 5 -> {
                    console.writeInfo("Opening: Minimum Deviation");
                    minDeviSelected();
                }
                case 6 -> printStatisticsMenuPage2();
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
            /*console.clear();
            console.writeLine("╔═══════════════════════════════════════════════════════════════════╗");
            console.writeLine("╠═────────────────────────{  Statistics  }─────────────────────────═╣");
            console.writeLine("╠═─ 1 : Median ────────────────────────────────────────────────────═╣");
            console.writeLine("╠═─ 2 : Mode Value ────────────────────────────────────────────────═╣");
            console.writeLine("╠═─ 3 : Variance ──────────────────────────────────────────────────═╣");
            console.writeLine("╠═─ 4 : Standard deviation ────────────────────────────────────────═╣");
            console.writeLine("╠═─ 5 : Arithmetic mean ───────────────────────────────────────────═╣");
            console.writeLine("╠═─ 6 : Geometric mean ────────────────────────────────────────────═╣");
            console.writeLine("╠═─ 0 : ←─Page─Back────────────────────────────────────────────────═╣");
            console.writeLine("╚═══════════════════════════════════════════════════════════════════╝");*/
            SubMenu[] subMenus = new SubMenu[6];
            subMenus[0] = new SubMenu(1, "Median");
            subMenus[1] = new SubMenu(2, "Mode Value");
            subMenus[2] = new SubMenu(3, "Variance");
            subMenus[3] = new SubMenu(4, "Standard Deviation");
            subMenus[4] = new SubMenu(5, "Arithmetic mean");
            subMenus[5] = new SubMenu(6, "Geometric mean");

            console.createSubMenu("Statistics - Page [2/2]", subMenus, 1);


            switch (console.readChoice(new int[]{0, 1, 2, 3, 4, 5, 6})){
                case 1 -> {
                    console.writeInfo("Median Selected", 500);
                    medianSelected();
                }
                case 2 -> {
                    console.writeInfo("Mode Selected", 500);
                    modeSelected();
                }
                case 3 -> {
                    console.writeInfo("Variance Selected", 500);
                    varianceSelected();
                }
                case 4 -> {
                    console.writeInfo("Deviation Selected", 500);
                    standardDeviationSelected();
                }
                case 5 -> arithmeticMeanSelected();
                case 6 -> {
                    console.writeInfo("Geometric Mean Selected", 500);
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
     * Contains the logic for min function
     */
    private static void minStatsSelected(){
        double[] input = console.getInput();
        double result = Statistics.Minimum.getMinimum(input);
        console.printResult("The lowest number is: " + result);
        console.pressEnterToContinue(input, result, "Lowest number of array");
    }
    //</editor-fold>

    //<editor-fold desc="Maximum">
    /**
     * Contains the logic for max function
     */
    private static void maxStatsSelected(){
        double[] input = console.getInput();
        double result = Statistics.Maximum.getMaximum(input);
        console.printResult("The highest number is: " + result);
        console.pressEnterToContinue(input, result, "Highest number of array");
    }
    //</editor-fold>

    //<editor-fold desc="Span">
    /**
     * When the span menu gets selected
     */
    private static void spanMenuSelected(){
        double[] input = console.getInput();
        double result = Span.getSpan(input);
        console.printResult("The span is " + result);
        console.pressEnterToContinue(input, result, "The span of the array");
    }
    //</editor-fold>

    //<editor-fold desc="Maximum Deviation">
    /**
     * User interaction methode for maximal deviation
     */
    private static void maxDeviSelected(){
        double[] input = console.getInput();
        double result = Deviation.getMaxDeviation(input);
        console.printResult("The maximum Deviation is: " + result);
        console.pressEnterToContinue(input, result, "Maximum Deviation");
    }
    //</editor-fold>

    //<editor-fold desc="Minimum Deviation">
    /**
     * User interaction methode for minimal deviation
     */
    private static void minDeviSelected(){
        double[] input = console.getInput();
        double result = Deviation.getMinDeviation(input);
        console.printResult("Min. Deviation: " + result);
        console.pressEnterToContinue(input, result, "Minimum Deviation");
    }
    //</editor-fold>

    //</editor-fold>

    //<editor-fold desc="Second Page Functions">

    //<editor-fold desc="Median">
    /**
     * User interaction methode for median
     */
    private static void medianSelected(){
        double[] input = console.getInput("Data Array");
        double result = Median.getMedian(input);
        console.printResult("The median of the given data array is: " + result);
        console.pressEnterToContinue(input, result, "Median of the Array");
    }
    //</editor-fold>

    //<editor-fold desc="Mode">
    /**
     * User interaction methode for mode
     */
    private static void modeSelected(){
        double[] input = console.getInput("Data Array");
        double result = Mode.getMode(input);
        console.printResult("The mode of the given data array is: " + result);
        console.pressEnterToContinue(input, result, "Mode of the Array");
    }
    //</editor-fold>

    //<editor-fold desc="Variant">
    /**
     * User interaction methode for variant
     */
    private static void varianceSelected(){
        double[] input = console.getInput("Data");
        double result = Variance.getVariance(input);
        console.printResult("The variance is: " + result);
        console.pressEnterToContinue(input, result, "Variance of the Array");
    }
    //</editor-fold>

    //<editor-fold desc="Standard Deviation">
    /**
     * User interaction methode for standard deviation
     */
    private static void standardDeviationSelected(){
        double[] input = console.getInput("Data");
        double result = StandardDeviation.getStandardDeviation(input);
        console.printResult("The standard deviation is: " + result);
        console.pressEnterToContinue(input, result, "Standard deviation of the Array");
    }
    //</editor-fold>

    //<editor-fold desc="Arithmetic Mean">
    /**
     * User interaction methode for arithmetic mean
     */
    private static void arithmeticMeanSelected(){
        console.writeLine("Arithmetic Mean");
        double[] input = console.getInput("Data Array");
        double result = ArithmeticMean.getArithmeticMean(input);
        console.printResult("The average of the given data is: " + result);
        console.pressEnterToContinue(input, result, "Arithmetic Mean");
    }
    //</editor-fold>

    //<editor-fold desc="Geometric Mean">
    /**
     * User interaction methode for geometric mean
     */
    private static void geometricMeanSelected(){
        /*console.clear();
        console.writeLine("╔═⸗═══──{ Geometric Mean }──════╗");
        console.writeLine("╠═─ 1 : Relative ⸗─────────────═╣");
        console.writeLine("╠═─ 2 : Absolute ⸗─────────────═╣");
        console.writeLine("╠═─ 0 : ←─Page⸗Back────────────═╣");
        console.writeLine("╚══════════════════════════⸗════╝");*/

        SubMenu sub = new SubMenu(1,"Unbalanced");
        SubMenu sub2 = new SubMenu(2, "Balanced with 'Relative' given");
        SubMenu sub3 = new SubMenu(3, "Balanced with 'Absolute' given");
        console.createSubMenu("Geometric Mean", new SubMenu[]{sub, sub2, sub3});

        switch (console.readChoice(new int[]{0,1,2,3})){
            case 1 -> geoMeanSelected();
            case 2 -> geoMeanRelSelected();
            case 3 -> geoMeanAbsSelected();
            case 0 -> {}
        }
    }

    /**
     * User interaction for geometric mean
     */
    private static void geoMeanSelected(){
        double[] input = console.getInput("Data");
        double result = GeometricMean.getGeometricMean(input);
        console.printResult("" + result);
        console.pressEnterToContinue(input, result, "Geometric Mean");
    }

    /**
     * User interaction for geometric mean with relative frequency given
     */
    private static void geoMeanRelSelected(){
        double[][] input = console.readDoubleInput("Please enter your data now: ", "Please enter the relative frequency now: ");
        double result = GeometricMean.getGeometricMeanRel(input);
        console.printResult("" + result);
        console.pressEnter();
    }

    /**
     * User interaction for geometric mean with absolute frequency given
     */
    private static void geoMeanAbsSelected(){
        double[][] input = console.readDoubleInput("Please enter your data now: ", "Please enter the absolute frequency now: ");
        console.printResult("" + GeometricMean.getGeometricMeanAbs(input));
        console.pressEnter();
    }

    //</editor-fold>

    //</editor-fold>


    //</editor-fold>

    //<editor-fold desc="Growth and Decay">
    /**
     * Handling the selection
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
        int duration = console.readInt();

        console.write("Please enter the factor of growth: ");
        double factor = console.readDouble();
        console.write("\n");

        console.printResult("The end result after "+ duration+ " days is ");
        console.printResult(Growth.getGrowth(startValue, duration, factor), "Day");

        console.pressEnter();
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
        int duration = console.readInt();

        console.write("Please enter the factor of decay: ");
        double factor = console.readDouble();
        console.write("\n");

        console.printResult("The end result after "+ duration+ " days is ");
        console.printResult(Decay.getDecay(startValue, duration, factor), "Day");

        console.pressEnter();
    }
    //</editor-fold>

    //</editor-fold>

    //<editor-fold desc="Quadratic Equation">
    /**
     * Handles user input for quadratic equation
     */
    private static void quadraticEquationSelected(){
        console.writeInfo("Please enter value a from 'ax²'");
        console.write("\nvalue: ");
        double a = console.readDouble();

        console.writeInfo("Please enter value b from 'bx");
        console.write("\nvalue: ");
        double b = console.readDouble();

        console.writeInfo("Please enter value c");
        console.write("\nvalue: ");
        double c = console.readDouble();

        console.writeInfo("Please enter value x (if you dont got it just write 0)");
        console.write("\nvalue: ");
        double x = console.readDouble();

        console.writeLine("Zero Points Result : ", Colors.GREEN_BACKGROUND);
        console.printResult(QuadraticEquation.getSquareFunctionZeroPoint(a,b,c));

        if(x != 0) {
            console.printResult("f(x) = " + QuadraticEquation.getSquareFunctionToY(a, b, c, x));
        }

        console.pressEnter();
    }
    //</editor-fold>

    //<editor-fold desc="Vector Calculation">
    /**
     * Handling user interaction with vector calc
     */
    private static void vectorCalculationSelected(){
        SubMenu menu1 = new SubMenu(1, "Array[i] * x");
        SubMenu menu2 = new SubMenu(2, "Array[i] + Array[i]");
        SubMenu menu3 = new SubMenu(3, "Array[i] * Array[i]");

        console.createSubMenu("Vector Calculation", new SubMenu[]{menu1, menu2, menu3});

        vec(console.readChoice(new int[]{0,1,2,3}));
    }

    /**
     * More stuff from above just in another class
     * @param choice selected choice
     */
    private static void vec(int choice){
        if(choice == 0){
            return;
        }

        console.writeInfo("Please enter now the first Array.");
        double[] arr = console.getInput("Array");
        console.pressEnterToContinue(arr);

        if(choice == 1){
            console.writeInfo("Please enter now the amount by which to multiply: ");
            console.write("\nvalue: ");

            double num = console.readDouble();
            double[] result = VectorCalculation.getMultiplicationWithOneNumber(arr, num);

            console.printResult(result);
            console.pressEnterToContinue(arr, result, num, "Array multiplication with one Number");
        }
        if(choice == 2){
            console.writeInfo("Please enter now the second Array.");

            double[] arr2 = console.readInput(arr.length);
            double[] result = VectorCalculation.getAdditionTwoVectors(arr, arr2);

            console.printResult(result);
            console.pressEnterToContinue(arr, arr2, result, "Addition of two Arrays");
        }
        if(choice == 3){
            console.writeInfo("Please enter now the second Array.");

            double[] arr2 = console.readInput(arr.length);
            double[] result = VectorCalculation.getMultiplicationTwoVectors(arr, arr2);

            console.printResult(result);
            console.pressEnterToContinue(arr, arr2, result, "Multiplication of two Arrays");
        }
    }
    //</editor-fold>

    //<editor-fold desc="Matrix Calculation">
    /**
     * Handling user interaction with vector calc
     */
    private static void matrixCalcSelected(){
            SubMenu menu1 = new SubMenu(1, "Array[i][j] * x");
            SubMenu menu2 = new SubMenu(2, "Array[i][j] + Array[i][j]");
            SubMenu menu3 = new SubMenu(3, "Array[i][j] * Array[i][j]");

            console.createSubMenu("Matrix Calculations", new SubMenu[]{menu1, menu2, menu3});

            int choice = console.readChoice(new int[]{0,1,2,3});
            matrixCalc(choice);
    }

    /**
     * Matrix Calc stuff
     * @param choice selected choice
     */
    private static void matrixCalc(int choice){
        if(choice == 0){
            return;
        }

        console.writeWithTag("Enter the size of i : ");
        int i = console.readInt();

        console.writeWithTag("Enter the size of j : ");
        int j = console.readInt();

        console.writeInfo("Enter now the first array");
        double[][] matrix1 = console.readDoubleInput(i, j);

        if(choice == 1){
            console.writeWithTag("Enter the value to multiply with : ");
            double multi = console.readInt();

            console.printResult(MatrixCalculation.multiplicationWithOneNumber(matrix1, multi));
            console.pressEnter();
        }else {
            console.writeInfo("Enter now the second array");
            double[][] matrix2 = console.readDoubleInput(i, j);

            if (choice == 2) {
                console.printResult(MatrixCalculation.mergeMatrix(matrix1, matrix2));
                console.pressEnter();
            } else if (choice == 3) {
                console.printResult(MatrixCalculation.multiTwoMatrix(matrix1, matrix2));
                console.pressEnter();
            }
        }
    }
    //</editor-fold>

}
