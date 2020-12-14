package Statistik;

public class Growth {

	
	
	/**
	 * takes the three variables and Potentiated all to make a potenziell growth
	 * @param tage how often you want to potentiated it
	 * @param startmenge what is your beginning number that is being potentiated
	 * @param faktor the potency
	 * @return ergebnis
	 */
	public static double getGrowth(double tage, double startmenge, double faktor) {
		
		int starttag = 0;
		double ergebnis = 0;

		for (int i = 0; i <= tage; i++) {
			starttag = i;
			ergebnis = startmenge * Math.pow(faktor, i);
			
		}
		return ergebnis;
	}

}
