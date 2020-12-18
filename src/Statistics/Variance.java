package Statistics;

public class Variance {

    /**
     * Takes the Array variance to calculate the Variance
     * @param variance Array
     * @return VarianceValue
     */
    public static double getVariance(double[] variance){
        double sumVar = 0;
        double sumArm = 0;
        double varianceValue;

        for (double value : variance) {
            sumArm += value;
        }

        sumArm = sumArm / variance.length;

        for (double v : variance) {
            sumVar += (v - sumArm) * (v - sumArm);
        }
        varianceValue = sumVar / variance.length;

        return varianceValue;
    }
}
