package Math;

public class QuadraticEquation {

	/**
	 * Takes Variable a, b, c and x to calculate y / f(x)
	 * @param a Variable one (ax²)
	 * @param b Variable two (bx)
	 * @param c Variable three
	 * @param x Variable four
	 * @return Y / f(x)
	 */
	public static double getSquareFunctionToY(double a, double b, double c, double x) {
		return (((a * x) * (a * x)) + (b * x) + c);
	}

	/**
	 * Takes Variable a, b and c to calculate how many zeroPoints there are and what Value they have
	 * @param a Variable one (ax²)
	 * @param b Variable two (bx)
	 * @param c Variable three
	 * @return zeroPoint
	 */

	public static double[] getSquareFunctionZeroPoint(double a, double b, double c) {
		final double p = b / a;
		final double q = c / a;
		final double sqrt = Math.sqrt(((p / 2) * (p / 2)) - q);

		final double x1 = -(p / 2) + sqrt;
		final double x2 = -(p / 2) - sqrt;

		final double d = ((p / 2) * (p / 2) - q);

		if (d == 0) {
			double[] zeroPoint = new double[1];
			zeroPoint[0] = x1;
			return zeroPoint;
		} else if (d > 0) {
			double[] zeroPoint = new double[2];
			zeroPoint[0] = x1;
			zeroPoint[1] = x2;
			return zeroPoint;
		}

		return new double[]{0};
	}
}
