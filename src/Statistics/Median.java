package Statistics;

public class Median {

    /**
     * Takes the array 'numberChain' to calculate the median
     * @param numberChain Array
     * @return Median
     */
    public static double getMedian(double [] numberChain) {

        if (numberChain.length % 2 == 0) {
            return (numberChain[(numberChain.length/2 - 1)] + numberChain[(numberChain.length/2)]) / 2;
        } else {
            return numberChain[(((numberChain.length + 1) / 2) - 1)];
        }
    }
}
