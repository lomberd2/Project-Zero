package Menu;

import Main.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IO {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Console console = new Console();

    /**
     * Reads the input from the user and returns the given Integer
     *
     * @return Integer
     */
    public static int readInteger() {
        while (true) {
            try {
                return Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                if (Main.isDebug) {
                    e.printStackTrace();
                } else {
                    console.writeError("Only Integers are allowed! Try again.");
                }
            }
        }
    }

    /**
     * Reads the user input and returns it as a double
     *
     * @return double
     */
    public static double readDouble() {
        while (true) {
            try {
                return Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                if (Main.isDebug) {
                    e.printStackTrace();
                } else {
                    console.writeError("Only double types are allowed! Try again!");
                }
            }
        }
    }

    /**
     * Reads any number Int,double,float...
     *
     * @return received number
     */
    public static double readNumber() {
        while (true) {
            try {
                String input = reader.readLine();
                if (input.contains(",")) {
                    input.replace(",", ".");
                }
                return Double.parseDouble(input);
            } catch (Exception e) {
                if (Main.isDebug) {
                    e.printStackTrace();
                } else {
                    console.writeError("Only numbers are allowed!");
                }
            }
        }
    }

    /**
     * Reads anything and returns it
     * @return readLine
     */
    public static String readAnything() {
        while (true) {
            try {
                return reader.readLine();
            } catch (Exception e) {
                console.writeError("Something went wrong. Idk what. But its not good. Please... Stop.");
                e.printStackTrace();
            }
        }
    }
}
