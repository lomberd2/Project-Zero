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
	// Eig fällt mir auf ist nicht unbedingt benötigt
	public static double getSquareFunctionToY(double a, double b, double c, double x) {

		// funktion im moment a x² + bx +c

		double y = (((a * x) * (a * x)) + (b * x) + c);
		return y;
		// ein wert rückgabe für Lösung mit der Variable x
	}

	/**
	 * Takes Variable a, b and c to calculate how many zeroPoints there are and what Value they have
	 * @param a Variable one (ax²)
	 * @param b Variable two (bx)
	 * @param c Variable three
	 * @return zeroPoint
	 */

	public static double[] getSquareFunctionZeroPoint(double a, double b, double c){

		double p = b / a;
		double q = c / a;

		// funktion im moment x² + px + q(PQ-Formel)

		double x1 = -(p/2) + Math.sqrt(((p/2) * (p/2)) - q);
		double x2 = -(p/2) - Math.sqrt(((p/2) * (p/2)) - q);

		double d = ((p/2) * (p/2) - q);
		double[] zeroPoint = new double[2];
		if (d < 0) {

			//System.out.println("es gibt keine Nullstellen");
		} else if (d == 0){
			zeroPoint[0] = x1;
			//System.out.println("es gibt eine Nullstelle = x1: " + x1);
		} else if (d > 0) {
			zeroPoint[0] = x1;
			zeroPoint[1] = x2;
			//System.out.println("es gibt 2 Nullstellen = x1: " + x1 + " x2: " + x2);
		}

		return zeroPoint;
		// Rückgabe wieviele Nullstellen es sind und Welche werte die jeweils haben
	}
}
