package Main;

public class Main {
    public static boolean isDebug = false;


    public static void main(String[] args){
        System.out.println("Herzlich Willkommen im Wunderhaus von Andrej, Jan und Joey!");
        loadMenu();
        System.out.println("\n\n\n\nSee you again!");
    }

    /**
     * Loads the main menu
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
