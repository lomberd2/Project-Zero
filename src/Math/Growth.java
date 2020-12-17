package Math;

public class Growth {
	/**
	 * takes the three variables and Potentiated all to make a Potentially growth
	 * @param startValue what is your beginning number that is being potentiated
	 * @param duration how often you want to potentiated it
	 * @param factor the potency
	 * @return result
	 */
	public static double getGrowth(double startValue, double duration, double factor) {
		double result = 0;
		for (int i = 0; i <= duration; i++) {
			result = startValue * Math.pow(factor, i);
			
		}
		return result;
	}

}
