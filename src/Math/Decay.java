package Math;

public class Decay {
	
	/**
	 * takes the three variables and takes the percent to make a Decay
	 * @param startmenge what is your start population
	 * @param prozent the percent you want do decay with
	 * @param tage how often you want to decay
	 * @return ergebnis[]
	 */
	
	public static double[] getDecay(double startmenge, double prozent, int tage) {


		double [] ergebnis = new double[tage + 1]; 
		prozent = 1 - (prozent/100);
		int starttag = 0;
		
		for (int i = 0; i <= tage; i++) {
			starttag = i;
			ergebnis[i] = startmenge * Math.pow(prozent, starttag);
		}
		
	return ergebnis;
	}

}
