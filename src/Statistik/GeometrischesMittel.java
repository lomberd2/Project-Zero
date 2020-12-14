package Statistik;

import oop.IO;

public class GeometrischesMittel {

	
	/**
	 * get the geometric medium without the absolute frequency and the relative frequency 
	 * @param n length of the array
	 * @param geo array
	 * @return produkt
	 */
	public static double geoohne(int n, double [] geo) {


		for (int i = 0; i < geo.length; i++) {
			geo[i] = IO.readDouble();
		}

		double produkt = 1;

		for (int i = 0; i < geo.length; i++) {
			produkt = produkt * geo[i];
		}


		produkt = Math.pow(Math.E, Math.log(produkt)/n);


		return produkt;
	}
	
	
	/**
	 * get the geometric medium with the absolute frequency but without the relative frequency
	 * @param n length of the arrays
	 * @param geo array one	
	 * @param abs array two
	 * @return produkt
	 */
	public static double geoabs(int n, double[] geo, double [] abs) {

		for (int i = 0; i < geo.length; i++) {
			geo[i] = IO.readDouble();
		}

		for (int i = 0; i < abs.length; i++) {
			abs[i] = IO.readDouble();
		}

		for (int i = 0; i < abs.length; i++) {
			geo[i] = Math.pow(geo[i], abs[i]);
		}

		double anzahlabs = 0;

		for (int i = 0; i < abs.length; i++) {
			anzahlabs = anzahlabs + abs[i];
		}



		double produkt = 1;

		for (int i = 0; i < geo.length; i++) {
			produkt = produkt * geo[i];
		}


		produkt = Math.pow(Math.E, Math.log(produkt)/anzahlabs);


		return produkt;
	}
	
	/**
	 * get the geometric medium without the absolute frequency but with the relative frequency
	 * @param n length of the arrays
	 * @param geo array one	
	 * @param abs array two
	 * @return produkt
	 */
	public static double georel(int n, double [] geo, double [] rel) {
		for (int i = 0; i < geo.length; i++) {
			geo[i] = IO.readDouble();
		}

		for (int i = 0; i < rel.length; i++) {
			rel[i] = IO.readDouble();
		}

		for (int i = 0; i < rel.length; i++) {
			geo[i] = Math.pow(geo[i], rel[i]);
		}

		double produkt = 1;

		for (int i = 0; i < geo.length; i++) {
			produkt = produkt * geo[i];
		}

		return produkt;	
	}

}
