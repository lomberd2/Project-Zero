package Statistics;

public class Median {

    /**
     * Takes the array 'numberChain' to calculate the median
     * @param numberChain Array
     * @return Median
     */
    public static double getMedian(double [] numberChain) {

        for (int j = 0; j < numberChain.length - 1; j++) {
            for (int i = 0; i < numberChain.length - 1; i++) {
                if (numberChain[i] > numberChain[i + 1]) {
                    double c = numberChain[i];
                    numberChain[i] = numberChain[i + 1];
                    numberChain[i + 1] = c;
                }
            }
        }

        if (numberChain.length % 2 == 0) {
            return (numberChain[(numberChain.length/2 - 1)] + numberChain[(numberChain.length/2)]) / 2;
        } else {
            return numberChain[(((numberChain.length + 1) / 2) - 1)];
        }
    }
}
