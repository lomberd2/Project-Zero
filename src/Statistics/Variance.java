package Statistics;

public class Variance {

    /**
     * Takes the Array variance to calculate the Variance
     * @param variance array
     * @return varianceValue
     */
    public static double getVariance(double[] variance){
        double sumVar = 0;
        double sumAtm = 0;
        double product;
        double varianceValue;

        for (int i = 0; i < variance.length; i++){
            sumAtm += variance[i];
        }

        for (int i = 0; i < variance.length; i++){
            sumVar = (variance[i] - sumAtm);
        }
        product = sumVar * sumVar;
        varianceValue = product / variance.length;

        return varianceValue;
    }
}
