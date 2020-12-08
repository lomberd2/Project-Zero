package Statistik;

import oop.IO;

public class ArithmetischesMittel {

	public static void main(String[] args) {
		System.out.println("Geben sie die anzahl der Daten ein die sie eingeben wollen: ");
		int laenge = IO.readInteger();
		
		double [] zahlenreihe = new double [laenge];
		
		for (int i = 0; i < zahlenreihe.length; i++) {
			System.out.println("geben sie den " + (i + 1) + " Wert ein: ");
			zahlenreihe[i] = IO.readDouble();
		}
		double summe = 0;
		for (int i = 0; i < zahlenreihe.length; i++) {
			summe = summe + zahlenreihe[i];
		}
		double arithmet = summe / laenge;
		
		
		System.out.println(arithmet);

	}

}
