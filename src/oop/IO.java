package oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

	public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Liest einen Text ein
	 * @return den eingelesenen Text
	 */
	public static String readString() throws IOException {
		return bufferedReader.readLine();
	}
	/**
	 * Liest eine Ganze Zahl ein
	 * @return gibt eine ganze zahl aus
	 */
	public static int readInteger() {
		while (true) {
			try {
				return Integer.parseInt(bufferedReader.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("Bitte geben sie nur Zahlen ein");
			}
		}
	}
	/**
	 * Liest eine zahl mit nachkommastellen ein
	 * @return gibt diese aus
	 */
	public static Double readDouble() {
		while (true) {
			try {
				return Double.parseDouble(bufferedReader.readLine().replace(',','.'));
			} catch (NumberFormatException | IOException e) {
				System.out.println("Bitte nur Zahlen ein");
			}
		}
	}
	/**
	 * fragt bedingungen ab
	 * @return gibt true oder false aus
	 */
	public static Boolean readBoolean() {
		while (true) {
			try {
				String eingabe = bufferedReader.readLine();
				if (eingabe.equalsIgnoreCase("ja") || eingabe.equalsIgnoreCase("yes")) {
					return true;

				} else if (eingabe.equalsIgnoreCase("nein") || eingabe.equalsIgnoreCase("no")){
					return false;
				} else {
					System.out.println("Geben sie nur ja,yes,,nein,no ein");
				}
			} catch (Exception e) {
				System.out.println("Geben sie nur ja,yes,,nein,no ein");
			}
		}
	}

	public static int[] createIntArray(int arrLength){
		while(true){
			try{
				int[] intArr = new int[arrLength];
				for(int i = 0; i < intArr.length; i++){
					System.out.println("Bitte geben Sie die " + i + " Ganzzahl im Array jetzt ein: ");
					intArr[i] = readInteger();
				}
				return intArr;
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}

	/**
	 * Creates an Double Array in the desired length.
	 * @param arrLength Length of the Array
	 * @return double[]
	 */
	public static double[] createDoubleArray(int arrLength){
		while(true){
			try{
				double[] doubleArr = new double[arrLength];
				for(int i = 0; i < doubleArr.length; i++){
					System.out.println("Bitte geben Sie die " + i + " Double Zahl im Array jetzt ein: ");
					doubleArr[i] = readDouble();
				}
				return doubleArr;
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}

	/**
	 * Creates an String Array in the desired length.
	 * @param arrLength Length of the Array
	 * @return String[]
	 */
	public static String[] createStringArr(int arrLength){
		while(true){
			try{
				String[] stringArr = new String[arrLength];
				for(int i = 0; i < stringArr.length; i++){
					System.out.println("Bitte geben Sie den " + i + "'ten String im Array jetzt ein: ");
					stringArr[i] = readString();
				}
				return stringArr;
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}

	public static int[] readIntegerArray1DBinaer() throws IOException{

		System.out.print("Wie viele Stellen haben die Binärzahlen maximal? = ");

		int zeilen = readInteger();
		if(zeilen != 1 || zeilen != 0) {
		}
		int[] array = readIntegerArray1D(zeilen);

		return array;

	}

	public static int[] readIntegerArray1DBinaer(int anzahlWerte) throws IOException {

		int[] array = new int[anzahlWerte];

		array = readIntegerArray1D(array);

		return array;

	}

	public static int[] readIntegerArray1DBinaer(int[] array) throws IOException {

		for (int i = 0; i < array.length; i++) {

			System.out.println("Gib die Zahl ziffernweise von Rechts ein: ");
			

			array[i] = readInteger();



		}

		return array;
	}
	
	public static int[] readIntegerArray1D() throws IOException{

		System.out.print("Wie viele Werte? ");

		int zeilen = readInteger();

		int[] array = readIntegerArray1D(zeilen);

		return array;

	}

	public static int[] readIntegerArray1D(int anzahlWerte) throws IOException {

		int[] array = new int[anzahlWerte];

		array = readIntegerArray1D(array);

		return array;

	}

	public static int[] readIntegerArray1D(int[] array) throws IOException {

		for (int i = 0; i < array.length; i++) {

			System.out.println("Wert eingeben für [" + i + "]: ");

			array[i] = readInteger();



		}

		return array;
	}
	//Methode zur Erstellung und Ausgebung eines Zweidimesionlen Arrays
	public static int[][] readzweidiarrInt(String[] args) throws IOException {

		System.out.print("Wie lang soll der Mehrdimensionale Array sein?: ");
		int laenge = IO.readInteger();

		System.out.println(" ");
		System.out.print("Wie breit soll der Array werden?: ");
		int breite = IO.readInteger();

		//Deklarieren des Arrays + längenzuweisung
		int[][] mehrarr = new int [laenge][breite];
		System.out.println("============================");

		//Wert zuweisung des eben Erstellten Arrays
		for (int i = 0; i < mehrarr.length; i++) {
			for (int j = 0; j < mehrarr[i].length; j++) {
				System.out.print("Geben sie für [" + i + "][" + j + "] den Wert ein: ");
				mehrarr[i][j] = IO.readInteger();
			}

		}
		return mehrarr;
		}
		public static void writezweidiarrint(int[][] mehrarr) throws IOException {

			System.out.println("Wollen sie sich alle Werte anzeigen lassen oder nur einen bestimmten?");
			System.out.println("Geben sie für alle :  alle;  Alle  ein und wenn sie nur einen wollen:  einen;  Einen");
			//Liest auf die Frage darüber eine Antwort ein
			String wahl = IO.readString();
					
			
			//If abfrage ob man scih nur einen Wert anzeigen lassen will oder alle
			if (wahl.equalsIgnoreCase("Einen") || wahl.equalsIgnoreCase("einen")) {
				System.out.println("Geben sie der reihe nach ein welche Stelle sie aufrufen wollen: [x1][x2]");
				System.out.print("[x1]");
				int x1 = IO.readInteger();
				System.out.print("[x2]");
				int x2 = IO.readInteger();

				
				System.out.println("Der Array an der Stelle [" + x1 + "][" + x2 + "] hat den Wert ==> " + mehrarr[x1][x2]);
			}else {
				for (int i = 0; i < mehrarr.length; i++) {
					for (int j = 0; j < mehrarr[i].length; j++) {
						System.out.println("Der Array an der Stelle [" + i + "][" + j + "] hat den Wert ==> " + mehrarr[i][j]);

					}
				}
			}
			
			
	}
	//Methode zur Erstellung und Ausgebung eines Zweidimesionlen Arrays
	public static Double[][] readzweidiarrdouble(String[] args) throws IOException {

		System.out.print("Wie lang soll der Mehrdimensionale Array sein?: ");
		int laenge = IO.readInteger();

		System.out.println(" ");
		System.out.print("Wie breit soll der Array werden?: ");
		int breite = IO.readInteger();

		//Deklarieren des Arrays + längenzuweisung
		Double[][] mehrarr = new Double [laenge][breite];
		System.out.println("============================");

		//Wert zuweisung des eben Erstellten Arrays
		for (int i = 0; i < mehrarr.length; i++) {
			for (int j = 0; j < mehrarr[i].length; j++) {
				System.out.print("Geben sie für [" + i + "][" + j + "] den Wert ein: ");
				mehrarr[i][j] = IO.readDouble();
			}
		}
		return mehrarr;
	}

	public static void writezweidiarrdouble(Double[][] mehrarr) throws IOException {
	System.out.println("Wollen sie sich alle Werte anzeigen lassen oder nur einen bestimmten?");
	System.out.println("Geben sie für alle :  alle;  Alle  ein und wenn sie nur einen wollen:  einen;  Einen");
	//Liest auf die Frage darüber eine Antwort ein
	String wahl = IO.readString();
			
	
	//If abfrage ob man scih nur einen Wert anzeigen lassen will oder alle
	if (wahl.equalsIgnoreCase("Einen") || wahl.equalsIgnoreCase("einen")) {
		System.out.println("Geben sie der reihe nach ein welche Stelle sie aufrufen wollen: [x1][x2]");
		System.out.print("[x1]");
		int x1 = IO.readInteger();
		System.out.print("[x2]");
		int x2 = IO.readInteger();

		
		System.out.println("Der Array an der Stelle [" + x1 + "][" + x2 + "] hat den Wert ==> " + mehrarr[x1][x2]);
	}else {
		for (int i = 0; i < mehrarr.length; i++) {
			for (int j = 0; j < mehrarr[i].length; j++) {
				System.out.println("Der Array an der Stelle [" + i + "][" + j + "] hat den Wert ==> " + mehrarr[i][j]);

			}
		}
	}
	
	

}

	//Methode zur Erstellung und Ausgebung eines Zweidimesionlen Arrays
		public static String[][] readzweidiarrString(String[][] text) throws IOException {

			System.out.print("Wie lang soll der Mehrdimensionale Array sein?: ");
			int laenge = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie breit soll der Array werden?: ");
			int breite = IO.readInteger();

			//Deklarieren des Arrays + längenzuweisung
			String[][] mehrarr = new String [laenge][breite];
			System.out.println("============================");

			//Wert zuweisung des eben Erstellten Arrays
			for (int i = 0; i < mehrarr.length; i++) {
				for (int j = 0; j < mehrarr[i].length; j++) {
					System.out.print("Geben sie für [" + i + "][" + j + "] den Wert ein: ");
					mehrarr[i][j] = IO.readString();
				}

			}
			return mehrarr;


			
		}
			public static void writezweidiarrString(String[][] mehrarr) throws IOException {
				System.out.println("Wollen sie sich alle Werte anzeigen lassen oder nur einen bestimmten?");
				System.out.println("Geben sie für alle :  alle;  Alle  ein und wenn sie nur einen wollen:  einen;  Einen");
				//Liest auf die Frage darüber eine Antwort ein
				String wahl = IO.readString();
						
				
				//If abfrage ob man scih nur einen Wert anzeigen lassen will oder alle
				if (wahl.equalsIgnoreCase("Einen") || wahl.equalsIgnoreCase("einen")) {
					System.out.println("Geben sie der reihe nach ein welche Stelle sie aufrufen wollen: [x1][x2]");
					System.out.print("[x1]");
					int x1 = IO.readInteger();
					System.out.print("[x2]");
					int x2 = IO.readInteger();

					
					System.out.println("Der Array an der Stelle [" + x1 + "][" + x2 + "] hat den Wert ==> " + mehrarr[x1][x2]);
				}else {
					for (int i = 0; i < mehrarr.length; i++) {
						for (int j = 0; j < mehrarr[i].length; j++) {
							System.out.println("Der Array an der Stelle [" + i + "][" + j + "] hat den Wert ==> " + mehrarr[i][j]);

						}
					}
				}
		}
		//Methode zur Erstellug uns Ausgebung eines Dreidimensionalen Arrays
		public static void dreidiarrInt(String antwort) throws IOException {

			System.out.print("Wie lang soll der Mehrdimensionale Array sein?: ");
			int laenge = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie breit soll der Array werden?: ");
			int breite = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie tief soll der Array werden?: ");
			int tiefe = IO.readInteger();

			//Deklarieren des Arrays + längenzuweisung
			int[][][] mehrarr = new int[laenge][breite][tiefe];
			System.out.println("");
			System.out.println("============================");
			System.out.println("");
			//Wertzuweisung des Erstellten Arrays
			for (int i = 0; i < mehrarr.length; i++) {
				for (int j = 0; j < mehrarr[i].length; j++) {
					for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
						System.out.print("Geben sie für [" + i + "][" + j + "][" + j2 + "] den Wert ein: ");
						mehrarr[i][j][j2] = IO.readInteger();
					}
				}			
			}
			
			System.out.println("============================");
			
			System.out.println("");		
			System.out.println("Sie hatten gewählt: " + antwort);
			
			System.out.println("Wollen sie sich alle Werte anzeigen lassen oder nur einen bestimmten?");
			System.out.println("Geben sie für alle :  alle;  Alle  ein und wenn sie nur einen wollen:  einen;  Einen");
			String wahl = IO.readString();
			
			//If abfrage ob man scih nur einen Wert anzeigen lassen will oder alle		
			if (wahl.equalsIgnoreCase("Einen") || wahl.equalsIgnoreCase("einen")) {
				System.out.println("Geben sie der reihe nach ein welche Stelle sie aufrufen wollen: [x1][x2][x3]");
				System.out.print("[x1]");
				int x1 = IO.readInteger();
				System.out.print("[x2]");
				int x2 = IO.readInteger();
				System.out.print("[x3]");
				int x3 = IO.readInteger();
				
				System.out.println("Der Array an der Stelle [" + x1 + "][" + x2 + "][" + x3 + "] hat den Wert ==> " + mehrarr[x1][x2][x3]);
			}else if(wahl.equalsIgnoreCase("Alle") || wahl.equalsIgnoreCase("alle")){
				for (int i = 0; i < mehrarr.length; i++) {
					for (int j = 0; j < mehrarr[i].length; j++) {
						for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
							System.out.println("Der Array an der Stelle [" + i + "][" + j + "][" + j2 + "]  hat den Wert ==> " + mehrarr[i][j][j2]);
						}
					}
				}
			}
			
			System.out.println("");
			System.out.println("============================");
			System.out.println("");
			
		}
		//Methode zur Erstellug uns Ausgebung eines Dreidimensionalen Arrays
		public static void dreidiarrDouble(String antwort) throws IOException {

			System.out.print("Wie lang soll der Mehrdimensionale Array sein?: ");
			int laenge = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie breit soll der Array werden?: ");
			int breite = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie tief soll der Array werden?: ");
			int tiefe = IO.readInteger();

			//Deklarieren des Arrays + längenzuweisung
			Double[][][] mehrarr = new Double[laenge][breite][tiefe];
			System.out.println("");
			System.out.println("============================");
			System.out.println("");
			//Wertzuweisung des Erstellten Arrays
			for (int i = 0; i < mehrarr.length; i++) {
				for (int j = 0; j < mehrarr[i].length; j++) {
					for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
						System.out.print("Geben sie für [" + i + "][" + j + "][" + j2 + "] den Wert ein: ");
						mehrarr[i][j][j2] = IO.readDouble();
					}
				}			
			}
			
			System.out.println("============================");
			
			System.out.println("");		
			System.out.println("Sie hatten gewählt: " + antwort);
			
			System.out.println("Wollen sie sich alle Werte anzeigen lassen oder nur einen bestimmten?");
			System.out.println("Geben sie für alle :  alle;  Alle  ein und wenn sie nur einen wollen:  einen;  Einen");
			String wahl = IO.readString();
			
			//If abfrage ob man scih nur einen Wert anzeigen lassen will oder alle		
			if (wahl.equalsIgnoreCase("Einen") || wahl.equalsIgnoreCase("einen")) {
				System.out.println("Geben sie der reihe nach ein welche Stelle sie aufrufen wollen: [x1][x2][x3]");
				System.out.print("[x1]");
				int x1 = IO.readInteger();
				System.out.print("[x2]");
				int x2 = IO.readInteger();
				System.out.print("[x3]");
				int x3 = IO.readInteger();
				
				System.out.println("Der Array an der Stelle [" + x1 + "][" + x2 + "][" + x3 + "] hat den Wert ==> " + mehrarr[x1][x2][x3]);
			}else if(wahl.equalsIgnoreCase("Alle") || wahl.equalsIgnoreCase("alle")){
				for (int i = 0; i < mehrarr.length; i++) {
					for (int j = 0; j < mehrarr[i].length; j++) {
						for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
							System.out.println("Der Array an der Stelle [" + i + "][" + j + "][" + j2 + "]  hat den Wert ==> " + mehrarr[i][j][j2]);
						}
					}
				}
			}
			
			System.out.println("");
			System.out.println("============================");
			System.out.println("");
			
		}//Methode zur Erstellug uns Ausgebung eines Dreidimensionalen Arrays
		public static void dreidiarrString(String antwort) throws IOException {

			System.out.print("Wie lang soll der Mehrdimensionale Array sein?: ");
			int laenge = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie breit soll der Array werden?: ");
			int breite = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie tief soll der Array werden?: ");
			int tiefe = IO.readInteger();

			//Deklarieren des Arrays + längenzuweisung
			String[][][] mehrarr = new String[laenge][breite][tiefe];
			System.out.println("");
			System.out.println("============================");
			System.out.println("");
			//Wertzuweisung des Erstellten Arrays
			for (int i = 0; i < mehrarr.length; i++) {
				for (int j = 0; j < mehrarr[i].length; j++) {
					for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
						System.out.print("Geben sie für [" + i + "][" + j + "][" + j2 + "] den Wert ein: ");
						mehrarr[i][j][j2] = IO.readString();
					}
				}			
			}
			
			System.out.println("============================");
			
			System.out.println("");		
			System.out.println("Sie hatten gewählt: " + antwort);
			
			System.out.println("Wollen sie sich alle Werte anzeigen lassen oder nur einen bestimmten?");
			System.out.println("Geben sie für alle :  alle;  Alle  ein und wenn sie nur einen wollen:  einen;  Einen");
			String wahl = IO.readString();
			
			//If abfrage ob man scih nur einen Wert anzeigen lassen will oder alle		
			if (wahl.equalsIgnoreCase("Einen") || wahl.equalsIgnoreCase("einen")) {
				System.out.println("Geben sie der reihe nach ein welche Stelle sie aufrufen wollen: [x1][x2][x3]");
				System.out.print("[x1]");
				int x1 = IO.readInteger();
				System.out.print("[x2]");
				int x2 = IO.readInteger();
				System.out.print("[x3]");
				int x3 = IO.readInteger();
				
				System.out.println("Der Array an der Stelle [" + x1 + "][" + x2 + "][" + x3 + "] hat den Wert ==> " + mehrarr[x1][x2][x3]);
			}else if(wahl.equalsIgnoreCase("Alle") || wahl.equalsIgnoreCase("alle")){
				for (int i = 0; i < mehrarr.length; i++) {
					for (int j = 0; j < mehrarr[i].length; j++) {
						for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
							System.out.println("Der Array an der Stelle [" + i + "][" + j + "][" + j2 + "]  hat den Wert ==> " + mehrarr[i][j][j2]);
						}
					}
				}
			}
			
			System.out.println("");
			System.out.println("============================");
			System.out.println("");
			
		}

		//Methode zur Erstellug uns Ausgebung eines vierdimensionalen Arrays
		public static void vierdiarrInt(String antwort) throws IOException {

			System.out.print("Wie lang soll der Mehrdimensionale Array sein?: ");
			int laenge = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie breit soll der Array werden?: ");
			int breite = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie tief soll der Array werden?: ");
			int tiefe = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie lang soll die 4te stelle im Array werden?: ");
			int vierte = IO.readInteger();

			//Deklarierung und längenzuweisung ins Arrays
			int[][][][] mehrarr = new int[laenge][breite][tiefe][vierte];
			System.out.println("");
			System.out.println("============================");
			System.out.println("");
			//Wertzuweisung des Erstellten Arrays
			for (int i = 0; i < mehrarr.length; i++) {
				for (int j = 0; j < mehrarr[i].length; j++) {
					for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
						for (int j3 = 0; j3 < mehrarr[i].length; j3++) {
							System.out.print("Geben sie für [" + i + "][" + j + "][" + j2 + "][" + j3 + "]  den Wert ein: ");
							mehrarr[i][j][j2][j3] = IO.readInteger();
						}
					}
				}
				
			}
			System.out.println("");
			System.out.println("============================");
			
			System.out.println("");		
			System.out.println("Sie hatten gewählt: " + antwort);
			
			System.out.println("Wollen sie sich alle Werte anzeigen lassen oder nur einen bestimmten?");
			System.out.println("Geben sie für alle :  alle;  Alle  ein und wenn sie nur einen wollen:  einen;  Einen");
			String wahl = IO.readString();
			
			//If abfrage ob man scih nur einen Wert anzeigen lassen will oder alle	
			if (wahl.equalsIgnoreCase("Einen") || wahl.equalsIgnoreCase("einen")) {
				System.out.println("Geben sie der reihe nach ein welche Stelle sie aufrufen wollen: [x1][x2][x3][x4]");
				System.out.print("[x1]");
				int x1 = IO.readInteger();
				System.out.print("[x2]");
				int x2 = IO.readInteger();
				System.out.print("[x3]");
				int x3 = IO.readInteger();
				System.out.print("[x4]");
				int x4 = IO.readInteger();
				
				System.out.println("Der Array an der Stelle [" + x1 + "][" + x2 + "][" + x3 + "][" + x4 + "]   hat den Wert ==> " + mehrarr[x1][x2][x3][x4]);
				
				
			}else if(wahl.equalsIgnoreCase("Alle") || wahl.equalsIgnoreCase("alle")){
				for (int i = 0; i < mehrarr.length; i++) {
					for (int j = 0; j < mehrarr[i].length; j++) {
						for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
							for (int j3 = 0; j3 < mehrarr[i].length; j3++) {
								System.out.println("Der Array an der Stelle [" + i + "][" + j + "][" + j2 + "][" + j3 + "]   hat den Wert ==> " + mehrarr[i][j][j2][j3]);
							}
						}
					}

				}
			}
			
		}
		
		//Methode zur Erstellug uns Ausgebung eines vierdimensionalen Arrays
		public static void vierdiarrDouble(String[] args) throws IOException {

			System.out.print("Wie lang soll der Mehrdimensionale Array sein?: ");
			int laenge = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie breit soll der Array werden?: ");
			int breite = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie tief soll der Array werden?: ");
			int tiefe = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie lang soll die 4te stelle im Array werden?: ");
			int vierte = IO.readInteger();

			//Deklarierung und längenzuweisung ins Arrays
			Double[][][][] mehrarr = new Double[laenge][breite][tiefe][vierte];
			System.out.println("");
			System.out.println("============================");
			System.out.println("");
			//Wertzuweisung des Erstellten Arrays
			for (int i = 0; i < mehrarr.length; i++) {
				for (int j = 0; j < mehrarr[i].length; j++) {
					for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
						for (int j3 = 0; j3 < mehrarr[i].length; j3++) {
							System.out.print("Geben sie für [" + i + "][" + j + "][" + j2 + "][" + j3 + "]  den Wert ein: ");
							mehrarr[i][j][j2][j3] = IO.readDouble();
						}
					}
				}
				
			}			
			System.out.println("Wollen sie sich alle Werte anzeigen lassen oder nur einen bestimmten?");
			System.out.println("Geben sie für alle :  alle;  Alle  ein und wenn sie nur einen wollen:  einen;  Einen");
			String wahl = IO.readString();
			
			//If abfrage ob man scih nur einen Wert anzeigen lassen will oder alle	
			if (wahl.equalsIgnoreCase("Einen") || wahl.equalsIgnoreCase("einen")) {
				System.out.println("Geben sie der reihe nach ein welche Stelle sie aufrufen wollen: [x1][x2][x3][x4]");
				System.out.print("[x1]");
				int x1 = IO.readInteger();
				System.out.print("[x2]");
				int x2 = IO.readInteger();
				System.out.print("[x3]");
				int x3 = IO.readInteger();
				System.out.print("[x4]");
				int x4 = IO.readInteger();
				
				System.out.println("Der Array an der Stelle [" + x1 + "][" + x2 + "][" + x3 + "][" + x4 + "]   hat den Wert ==> " + mehrarr[x1][x2][x3][x4]);
				
				
			}else if(wahl.equalsIgnoreCase("Alle") || wahl.equalsIgnoreCase("alle")){
				for (int i = 0; i < mehrarr.length; i++) {
					for (int j = 0; j < mehrarr[i].length; j++) {
						for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
							for (int j3 = 0; j3 < mehrarr[i].length; j3++) {
								System.out.println("Der Array an der Stelle [" + i + "][" + j + "][" + j2 + "][" + j3 + "]   hat den Wert ==> " + mehrarr[i][j][j2][j3]);
							}
						}
					}

				}
			}
			
		}
		
		//Methode zur Erstellug uns Ausgebung eines vierdimensionalen Arrays
		public static void vierdiarrString(String[] args) throws IOException {

			System.out.print("Wie lang soll der Mehrdimensionale Array sein?: ");
			int laenge = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie breit soll der Array werden?: ");
			int breite = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie tief soll der Array werden?: ");
			int tiefe = IO.readInteger();

			System.out.println(" ");
			System.out.print("Wie lang soll die 4te stelle im Array werden?: ");
			int vierte = IO.readInteger();

			//Deklarierung und längenzuweisung ins Arrays
			String[][][][] mehrarr = new String[laenge][breite][tiefe][vierte];
			System.out.println("");
			System.out.println("============================");
			System.out.println("");
			//Wertzuweisung des Erstellten Arrays
			for (int i = 0; i < mehrarr.length; i++) {
				for (int j = 0; j < mehrarr[i].length; j++) {
					for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
						for (int j3 = 0; j3 < mehrarr[i].length; j3++) {
							System.out.print("Geben sie für [" + i + "][" + j + "][" + j2 + "][" + j3 + "]  den Wert ein: ");
							mehrarr[i][j][j2][j3] = IO.readString();
						}
					}
				}
				
			}			
			System.out.println("Wollen sie sich alle Werte anzeigen lassen oder nur einen bestimmten?");
			System.out.println("Geben sie für alle :  alle;  Alle  ein und wenn sie nur einen wollen:  einen;  Einen");
			String wahl = IO.readString();
			
			//If abfrage ob man scih nur einen Wert anzeigen lassen will oder alle	
			if (wahl.equalsIgnoreCase("Einen") || wahl.equalsIgnoreCase("einen")) {
				System.out.println("Geben sie der reihe nach ein welche Stelle sie aufrufen wollen: [x1][x2][x3][x4]");
				System.out.print("[x1]");
				int x1 = IO.readInteger();
				System.out.print("[x2]");
				int x2 = IO.readInteger();
				System.out.print("[x3]");
				int x3 = IO.readInteger();
				System.out.print("[x4]");
				int x4 = IO.readInteger();
				
				System.out.println("Der Array an der Stelle [" + x1 + "][" + x2 + "][" + x3 + "][" + x4 + "]   hat den Wert ==> " + mehrarr[x1][x2][x3][x4]);
				
				
			}else if(wahl.equalsIgnoreCase("Alle") || wahl.equalsIgnoreCase("alle")){
				for (int i = 0; i < mehrarr.length; i++) {
					for (int j = 0; j < mehrarr[i].length; j++) {
						for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
							for (int j3 = 0; j3 < mehrarr[i].length; j3++) {
								System.out.println("Der Array an der Stelle [" + i + "][" + j + "][" + j2 + "][" + j3 + "]   hat den Wert ==> " + mehrarr[i][j][j2][j3]);
							}
						}
					}

				}
			}
			
		}
		

}
