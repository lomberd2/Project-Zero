package Math;

public class Decay {
	
	/**
	 * takes the three variables and takes the percent to make a Decay
	 * @param startValue starting value
	 * @param factor factor
	 * @param duration duration
	 * @return result[]
	 */
	public static double[] getDecay(double startValue, int duration, double factor) {
		double[] result = new double[duration];
		factor = 1 - (factor/100);
		for (int i = 0; i < result.length; i++) {
			result[i] = startValue * Math.pow(factor, i);
		}
		return result;
	}

}
