package Statistics;

public class Minimum {
    /**
     * Find out the Lowest number with int
     * @param number1 Variable one
     * @param number2 Variable two
     * @return Lowest number
     */
    public static int getMinimum(int number1, int number2){
        return Math.min(number1,number2);
    }

    /**
     * Find out the Lowest number with double
     * @param number1 Variable one
     * @param number2 Variable two
     * @return Lowest number
     */
    public static double getMinimum(double number1, double number2){
        return Math.min(number1, number2);
    }

    /**
     * Find out the Lowest number with long
     * @param number1 Variable one
     * @param number2 Variable two
     * @return Lowest number
     */
    public static long getMinimum(long number1, long number2){
        return Math.min(number1, number2);
    }

    /**
     * Find out the Lowest number with float
     * @param number1 Variable one
     * @param number2 Variable two
     * @return Lowest number
     */
    public static float getMinimum(float number1, float number2){
        return Math.min(number1, number2);
    }

    /**
     * Find the lowest number in an double array
     * @param numbers input
     * @return lowest number
     */
    public static double getMinimum(double[] numbers){
        double min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            min = Math.min(min, numbers[i]);
        }
        return min;
    }
}
