package Statistics;

public class MaxDeviation {
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
     * @return maxDeviation
     */
    public static double getMaxDeviation(double [] numberChain){

        double min = numberChain[0];
        double max = numberChain[0];

        for(int i = 1; i < numberChain.length; i++) {
            if(numberChain[i] < min){
                min = numberChain[i];
            } else if(numberChain[i] > max){
                max = numberChain[i];
            }
        }
        double maxDeviation = max - min;
        return maxDeviation;
    }
}
