package Menu;

import Menu.IO;

public class Console {

    /**
     * Modified Print
     * @param input Consolen Input
     */
    public void write(String input){
        System.out.print(input);
    }

    /**
     * Same as above but with ~fancy~ color
     * @param input Console Input
     * @param color
     */
    public void write(String input, String color){
        System.out.print(color + input + Colors.RESET);
    }

    /**
     * Same as write but with the Tag (Useful for loading stuff)
     * @param input Console Input
     */
    public void writeWithTag(String input){
        System.out.print("[CalcEXTREME]: " + input);
    }

    /**
     * Modified Println for program tag
     * @param input Console Input
     */
    public void writeLine(String input){
        System.out.println("[CalcEXTREME]: " + input);
    }

    /**
     * Same as above but with ~fancy~ color
     * @param input Console Input
     * @param color
     */
    public void writeLine(String input, String color){
        System.out.println(color + "[CalcEXTREME]: " + input + Colors.RESET);
    }

    /**
     * Writes the output with an info tag and in yellow color
     * @param input Console Input
     */
    public void writeInfo(String input){
        System.out.println(Colors.YELLOW + "[CalcEXTREME][INFO]: " + input + Colors.RESET);
    }

    /**
     * Writes the output with an error tag and in red color
     * @param input Console Input
     */
    public void writeError(String input){
        System.out.println(Colors.RED + "[CalcEXTREME][ERR]: " + input + Colors.RESET);
    }

    /**
     * Just a handy methode to use the IO class in console
     * @return
     */
    public int readInt(){
        return IO.readInteger();
    }

    /**
     * Same as above. Just outsourced it here.
     * @return
     */
    public double readDouble() {
        return IO.readDouble();
    }

    /**
     * Same again. Just outsourced it here... Again.
     * @return
     */
    public double readNumber() {
        return IO.readNumber();
    }

    /**
     * What the methode name already explains
     */
    public void pressEnterToContinue(){
        writeLine("Press enter to continue");
        IO.readAnything();
    }
}

/**
 * SOURCE: https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
 */
class Colors{
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE
}