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
        double product;
        double varianceValue;

        for (int i = 0; i < variance.length; i++){
            sumArm += variance[i];
        }

        sumArm = sumArm / variance.length;

        for (int i = 0; i < variance.length; i++){
            sumVar = (variance[i] - sumArm);
        }
        product = sumVar * sumVar;
        varianceValue = product / variance.length;

        return varianceValue;
    }
}
