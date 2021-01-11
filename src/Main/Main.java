package Main;

public class Main {
    public static boolean isDebug = true;

    /**
     * Main class
     * @param args args
     */
    public static void main(String[] args){
        //System.out.println("Herzlich Willkommen im Wunderhaus von Andrej, Jan und Joey!");
        //Program LOGO
        /*System.out.println("╔═════════════════════════════════════════════════════╗");
        System.out.println("╠  Loading Math Calculator EXTREME aka Project Zero   ╣");
        System.out.println("╠    ░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓    ╣");
        System.out.println("╠ ░▒▓░▒▓░░░░▒▓░▒▓░▒▓░▒░░░░░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓ ╣");
        System.out.println("╠    ░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░░░░░░░▒▓░▒▓░▒▓░▒▓    ╣");
        System.out.println("╠    ░▒▓░░░░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓    ╣");
        System.out.println("╠    ░▒▓░▒▓░▒▓░▒▓░▒▓░░░░░░░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓    ╣");
        System.out.println("╠    ░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓░▒▓    ╣");
        System.out.println("╠     Created by XimBaumY, JanderLP and lomberd2      ╣");
        System.out.println("╚═════════════════════════════════════════════════════╝");*/
        System.out.println("╔═══════════════════════════════════════════════════-");
        System.out.println("╠-  Loading Math Calculator EXTREME aka Project Zero ");
        System.out.println("╠     _____________________   ");
        System.out.println("╠    |  _________________  |  ");
        System.out.println("╠    | | Calc Extreme :3 | |  ");
        System.out.println("╠    | |_________________| |  ");
        System.out.println("╠    |  ___ ___ ___   ___  |  ");
        System.out.println("╠    | | 7 | 8 | 9 | | + | |  ");
        System.out.println("╠    | |___|___|___| |___| |  ");
        System.out.println("╠    | | 4 | 5 | 6 | | - | |  ");
        System.out.println("╠    | |___|___|___| |___| |  ");
        System.out.println("╠    | | 1 | 2 | 3 | | x | |  ");
        System.out.println("╠    | |___|___|___| |___| |  ");
        System.out.println("╠    | | . | 0 | = | | / | |  ");
        System.out.println("╠    | |___|___|___| |___| |  ");
        System.out.println("╠    |_____________________|  ");
        System.out.println("╠");
        System.out.println("╠- Created by XimBaumY, JanderLP and lomberd2     ");
        System.out.println("╚══════════════════════════════════════════════-");

        loadMenu();
        System.out.println("\n\n\n\nSee you again!");
    }

    /**
     * Loads the menu
     */
    private static void loadMenu(){
        try {
            Menu.Menu.start();
        }catch (Exception e){
            if(isDebug){
                e.printStackTrace();
            }else{
                System.out.println("Something went wrong. Please contact costumer support under the following number. +49 1578 3506109.");
            }
        }
    }
}
