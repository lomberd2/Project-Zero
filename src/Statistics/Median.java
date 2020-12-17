package Statistics;

public class Median {
    /*
	  "test"
	 public static void main(double median) {
		double [] numberchain = new double [8];

		for (int i = 0; i < numberchain.length; i++) {
			numberchain[i] = IO.readDouble();
		}
		getmedian(numberchain);
		System.out.println(median);
	}

				Zahlenreihe muss im vorhinein eingelesen werden
	 */

    /**
     * Takes the array 'numberChain' to calculate the median
     *
     * @param numberChain Array
     * @return Median
     */
    public static double getMedian(double[] numberChain) {

        if (numberChain.length % 2 == 0) {
            return (numberChain[(numberChain.length / 2 - 1)] + numberChain[(numberChain.length / 2)]) / 2;
        } else {
            return numberChain[(((numberChain.length + 1) / 2) - 1)];
        }
    }
}
