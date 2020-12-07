package Menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IO {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Liest den eingegebenen Text des Benutzer ein und Wandelt ihn in eine Ganzzahl um.
     * @return umgewandelteGanzzahl
     */
    public static int readInteger(){
        while (true){
            try{
                String input = reader.readLine();
                int convertedInt = Integer.parseInt(input);
                return convertedInt;
            } catch (Exception e){
                if(Main.Main.isDebug){
                    e.printStackTrace();
                }
                else{
                    System.out.println("Bitte geben Sie eine Ganzzahl ein!");
                }
            }
        }
    }

}
