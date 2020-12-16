package Statistics;


public class ArithmeticMean {
	/**
	 * This method gets the arithmetic mean
	 * @param zahlenreihe the array with the numbers in it
	 * @return median
	 */
	public static double getArithmeticMean(double[] zahlenreihe) {
		double summe = 0;
		for (int i = 0; i < zahlenreihe.length; i++) {
			summe += zahlenreihe[i];
		}
		return summe / zahlenreihe.length;
	}

}
