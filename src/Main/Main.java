package Main;

public class Main {
    public static boolean isDebug = true;


    public static void main(String[] args){
        System.out.println("Herzlich Willkommen im Wunderhaus von Andrej, Jan und Joey!");
        loadMenu();
    }

    /**
     * Lädt das Menu (Ist nur hier wegen dem Catch sieht sonst doof aus in der Main
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
