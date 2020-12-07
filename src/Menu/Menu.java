package Menu;

public class Menu {
    //<editor-fold desc="Header">
    public static Console console;
    private static boolean isRunning = true;

    /** Char Table #QuickLookUp
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

        //Loading
        console.writeWithTag("Main Menu loading");
        Thread.sleep(500);

        console.write(".");
        Thread.sleep(500);

        console.write(".");
        Thread.sleep(500);

        console.write(".");
        Thread.sleep(500);
        console.write("\n");


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
     * @param selection
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
        console.writeLine("╠═─ 1 : STATISTIK (Varianz, Spannweite, Max, etc.) ──═╣");
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
    private static void statistik(){

    }
    //</editor-fold>
}
