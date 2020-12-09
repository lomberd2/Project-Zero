package Menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IO {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Reads the input from the user and returns the given Integer
     * @return Integer
     */
    public static int readInteger(){
        while (true){
            try{
                return Integer.parseInt(reader.readLine());
            } catch (Exception e){
                if(Main.Main.isDebug){
                    e.printStackTrace();
                }
                else{
                    System.out.println("Only Integers are allowed! Try again.");
                }
            }
        }
    }

    /**
     * Reads the user input and returns it as a double
     * @return double
     */
    public static double readDouble(){
        while (true){
            try{
                return Integer.parseInt(reader.readLine());
            }
            catch (Exception e)
            {
                if(Main.Main.isDebug){
                    e.printStackTrace();
                }
                else{
                    System.out.println("Only double types are allowed! Try again!");
                }
            }
        }
    }

    public static void readAnything(){
        try {
            reader.readLine();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
