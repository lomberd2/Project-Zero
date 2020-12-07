package Menu;

public class Menu {
    public static Console console;

    /** Char Table #QuickLookUp
     * ### VERSION : START
     * - TOP : ╔══════╗
     * - MID : ╠═    ═╣
     * - BOT : ╚══════╝
     * - SPECIAL CHAR : ░▒▓╠═ ═╣
     */


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

        console.writeLine("Done loading", Colors.YELLOW);
        Thread.sleep(1500);

        //Loading main menu
        mainMenu();
    }

    /**
     * Main Methode for the Menu
     */
    private static void mainMenu(){
        boolean isRunning = true;

        while(isRunning){

            printMainMenu();

            console.write("\nSelect function: ");
            int selection = console.readInt();

            switch (selection){
                case 0 -> isRunning = false;
                default -> console.writeError("Whooops there's an error!");
            }
        }
    }



    /**
     * Prints the Main Menu
     */
    private static void printMainMenu(){
        console.writeLine("╔═════════════════════════════════════════════════════╗");
        console.writeLine("╠═──────────────────{  MAIN MENU  }──────────────────═╣");
        console.writeLine("╠═─ 0 : STATISTIK (Varianz, Spannweite, Max, etc.) ──═╣");
        console.writeLine("╠═─ 1 : Wachstum & Zerfall ──────────────────────────═╣");
        console.writeLine("╠═─ 2 : Quad. Gleichungen ───────────────────────────═╣");
        console.writeLine("╠═─ 3 : Vektorrechnung ──────────────────────────────═╣");
        console.writeLine("╠═─ 4 : Matrizenrechnung ────────────────────────────═╣");
        console.writeLine("╚═════════════════════════════════════════════════════╝");
    }


    private static void init(){
        console = new Console();
    }

    private static void statistik(){

    }
}
