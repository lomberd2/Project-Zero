package Statistics;

public class StandardDeviation {

    /**
     * Takes the Array variance and uses the methode getVariance
     * to calculate the StandardDeviation
     *
     * @param variance Array
     * @return StandardDeviation
     */
    public static double getStandardDeviation(double[] variance) {

        double standardDeviation = Math.sqrt(Variance.getVariance(variance));

        return standardDeviation;
    }
}
