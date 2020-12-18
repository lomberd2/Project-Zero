package Statistics;

public class Maximum {
    /**
     * Find out the Highest number with int
     * @param number1 Variable one
     * @param number2 Variable two
     * @return Highest number
     */
    public static int getMaximum(int number1, int number2) {
        return Math.max(number1,number2);
    }

    /**
     * Find out the Highest number with double
     * @param number1 Variable one
     * @param number2 Variable two
     * @return Highest number
     */
    public static double getMaximum(double number1, double number2){ return Math.max(number1, number2); }

    /**
     * Find out the Highest number with long
     * @param number1 Variable one
     * @param number2 Variable two
     * @return Highest number
     */
    public static long getMaximum(long number1, long number2){
        return Math.max(number1, number2);
    }

    /**
     * Find out the Highest number with float
     * @param number1 Variable one
     * @param number2 Variable two
     * @return Highest number
     */
    public static float getMaximum(float number1, float number2){
        return Math.max(number1, number2);
    }

    /**
     * Find the highest number in an double array
     * @param numbers input
     * @return highest number
     */
    public static double getMaximum(double[] numbers){
        double max = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            max = Math.max(numbers[i-1], numbers[i]);
        }
        return max;
    }
}