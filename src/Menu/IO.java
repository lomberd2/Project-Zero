package Menu;

import Main.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IO {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Console console = new Console();

    /**
     * Reads the input from the user and returns the given Integer
     * @return Integer
     */
    public static int readInteger(){
        while (true){
            try{
                return Integer.parseInt(reader.readLine());
            } catch (Exception e){
                if(Main.isDebug){
                    e.printStackTrace();
                }
                else{
                    console.writeError("Only Integers are allowed! Try again.");
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
                if(Main.isDebug){
                    e.printStackTrace();
                }
                else{
                    console.writeError("Only double types are allowed! Try again!");
                }
            }
        }
    }

    /**
     * Reads any number Int,double,float...
     * @return received number
     */
    public static Number readNumber(){
        while(true) {
            try {
                String input = reader.readLine();
                if (input.contains(".") || input.contains(",")) {
                    input.replace(",", ".");
                    return Double.parseDouble(input);
                } else {
                    return Integer.parseInt(input);
                }
            } catch (Exception e) {
                if (Main.isDebug) {
                    e.printStackTrace();
                } else {
                    console.writeError("Only numbers and . are allowed!");
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
