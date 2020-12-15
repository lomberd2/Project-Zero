package Statistics;


public class ArithmeticMean {
	
	
	/**
	 * to get the aritmetic agent out of multiple numbers
	 * @param laenge the length of the array
	 * @param zahlenreihe the array
	 * @return arithmet
	 */

	public static double getArithmeticAgents(int laenge, double [] zahlenreihe) {
	
		
		double summe = 0;
		for (int i = 0; i < zahlenreihe.length; i++) {
			summe = summe + zahlenreihe[i];
		}
		double arithmet = summe / laenge;
		
		
		return arithmet;

	}

}
