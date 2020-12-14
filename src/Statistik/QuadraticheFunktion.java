package Statistik;

public class QuadraticheFunktion {

	
	
	/**
	 * input of a square function to get the roots of the function
	 * @param a variable one
	 * @param b variable two
	 * @param c variable three
	 * @return d
	 */
	public static double getSquareFunction(double a, double b, double c) {

		double p = b / a;
		double q = c / a;


		double x1 = -(p/2) + Math.sqrt(((p/2) * (p/2)) - q);

		double x2 = -(p/2) - Math.sqrt(((p/2) * (p/2)) - q);


		double d = ((p/2) * (p/2) - q);

		return d;
	}

}
