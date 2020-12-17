package Statistics;

public class GeometricMean {

	/**
	 * Geometric Mean
	 * @param input user input
	 * @return Geometric Mean
	 */
	public static double getGeometricMean(double[] input){
		double x = 1;

		for(int i = 0; i < input.length; i++){
			x = x * input[i];
		}

		return Math.pow(Math.E, Math.log(x) / input.length);
	}

	/**
	 * Geometric Mean with abs
	 * @param input user input
	 * @param abs absolute frequency
	 * @return Geometric Mean
	 */
	public static double getGeometricMean(double[] input, int abs){
		double x = 1;

		for(int i = 0; i < input.length; i++){
			x = x * input[i];
		}

		return Math.pow(Math.E, Math.log(x) / abs);
	}

	/**
	 * Geometric mean with Absolute frequency
	 * @param input user input
	 * @return Geometric Mean
	 */
	public static double getGeometricMeanAbs(double[][] input){
		double[] temp = new double[input.length];
		int abs = 0;

		for(int i = 0; i < input.length; i++){
			double val1 = input[i][0];
			double val2 = input[i][1];

			abs += val2;
			temp[i] = Math.pow(val1, val2);
		}

		return getGeometricMean(temp, abs);
	}

	/**
	 * Geometric mean with Relative frequency
	 * @param input user input
	 * @return Geometric Mean
	 */
	public static double getGeometricMeanRel(double[][] input){
		double temp = 1;

		for(int i = 0; i < input.length; i++){
			double val1 = input[i][0];
			double val2 = input[i][1];

			temp = temp * Math.pow(val1, val2);
		}

		return temp;
	}

}
