package Statistics;

import java.util.Arrays;

public class Deviation {
    /*
     * Get the average of the numbers to calculate the Variance
     * @param numbers Variable one
     * @param average Variable two
     * @param number The number it will get divided t get the average
     * @return Gives you the Average

    public static int[] getAverage(int[] numbers, int[] average, int number){
        for (int i = 0; i < numbers.length; i++){
            average = numbers ;
        }
        return numbers;
    }

    public static double[] getVariance(double[] sum){
        for (int i = 0; i < sum.length; i++){
        }

        return sum;
    }

    public static int getMaxDeviation(int number1, int number2){


        return getMaxDeviation(number1, number2);
    }
     */

    /**
     * Takes the Array numberChain to get the MaxDeviation
     * @param numberChain Array
     * @return max
     */
    public static double getMaxDeviation(double [] numberChain){

        double [] deviation = new double[numberChain.length - 1];


        for (int j = 0; j < numberChain.length + 1; j++) {
            for (int i = 0; i < numberChain.length - 1; i++) {
                if (numberChain[i] > numberChain[i + 1]) {
                    double c = numberChain[i];
                    numberChain[i] = numberChain[i + 1];
                    numberChain[i + 1] = c;
                }
            }
        }

        for (int i = 0; i < deviation.length; i++){
            deviation[i] = numberChain[i + 1] - numberChain[i];
        }

        double max = deviation[0];

        for (int i = 1; i < deviation.length; i++){
            if (deviation[i] > max){
                max = deviation[i];
            }
        }

        return max;
    }

    /**
     * Takes the Array numberChain to get the MinDeviation
     * @param numberChain Array
     * @return min
     */
    public static double getMinDeviation(double [] numberChain){

        double [] deviation = new double[numberChain.length - 1];


        for (int j = 0; j < numberChain.length + 1; j++) {
            for (int i = 0; i < numberChain.length - 1; i++) {
                if (numberChain[i] > numberChain[i + 1]) {
                    double c = numberChain[i];
                    numberChain[i] = numberChain[i + 1];
                    numberChain[i + 1] = c;
                }
            }
        }

        for (int i = 0; i < deviation.length; i++){
            deviation[i] = numberChain[i + 1] - numberChain[i];
        }

        double min = deviation[0];

        for (int i = 1; i < deviation.length; i++){
            if (deviation[i] < min){
                min = deviation[i];
            }
        }

        return min;
    }
}
