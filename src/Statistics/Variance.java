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

        for (int i = 0; i < variance.length; i++){
            sumArm += variance[i];
        }

        sumArm = sumArm / variance.length;

        for (int i = 0; i < variance.length; i++) {
            sumVar += (variance[i] - sumArm) * (variance[i] - sumArm);
        }
        varianceValue = sumVar / variance.length;

        return varianceValue;
    }
}
