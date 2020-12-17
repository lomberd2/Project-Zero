package Statistics;


public class ArithmeticMean {
	/**
	 * This method gets the arithmetic mean
	 * @param numberChain the array with the numbers in it
	 * @return median
	 */
	public static double getArithmeticMean(double[] numberChain) {
		double sum = 0;
		for (int i = 0; i < numberChain.length; i++) {
			sum += numberChain[i];
		}
		return sum / numberChain.length;
	}

}
