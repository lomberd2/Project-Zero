package Statistics;

import oop.IO;

public class GeometricMean {

	/**
	 * Geometric Mean
	 * @param input Data
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
	 * @param input Data
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
	 * Geometric mean with derivation
	 * @param input In %
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

	public static double getGeometricMeanRel(double[][] input){
		double temp = 0;

		for(int i = 0; i < input.length; i++){
			double val1 = input[i][0];
			double val2 = input[i][1];

			temp = temp * Math.pow(val1, val2);
		}

		return temp;
	}
	
	/**
	 * get the geometric medium without the absolute frequency and the relative frequency
	 * @param geo array
	 * @return produkt
	 */
	public static double getSum(double [] geo) {
		double sum = 1;

		for (int i = 0; i < geo.length; i++) {
			sum = sum * geo[i];
		}

		return sum;
	}
	
	private static double getGeo(double[] geo){
		return Math.pow(getSum(geo), 1 / (double)geo.length);
	}

	/**
	 * get the geometric medium with the absolute frequency but without the relative frequency
	 * @param geo array one	
	 * @param abs array two
	 * @return produkt
	 */
	public static double getGeoWithAbs(double[] geo, double[] abs) {

		geo = getGeoWithRe(geo, abs);

		double countAbs = 0;

		for (int i = 0; i < abs.length; i++) {
			countAbs = countAbs + abs[i];
		}

		double sum = getSum(geo);
		sum = Math.pow(Math.E, Math.log(sum)/countAbs);

		return sum;
	}
	
	/**
	 * get the geometric medium without the absolute frequency but with the relative frequency
	 * @param geo array one	
	 * @param rel array two
	 * @return produkt
	 */
	public static double getGeoWithRel(double[] geo, double[] rel) {

		for (int i = 0; i < rel.length; i++) {
			geo[i] = Math.pow(geo[i], rel[i]);
		}

		return getSum(geo);
	}


	public static double[] getGeoWithRe(double[] geo, double[] rel) {

		for (int i = 0; i < rel.length; i++) {
			geo[i] = Math.pow(geo[i], rel[i]);
		}

		return geo;
	}

}
