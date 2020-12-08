package Statistik;

import oop.IO;

public class GeometrischesMittel {

	public static void main(String[] args) {
		geoabs();
		
		System.out.println("Geben sie die anzahl der Daten an, die sie benutzen für die geometrische Funtkion");
		int n = IO.readInteger();
		
		
		double [] geo = new double [n];
		
		
		for (int i = 0; i < geo.length; i++) {
			geo[i] = IO.readDouble();
		}
		
		double produkt = 1;
		
		for (int i = 0; i < geo.length; i++) {
			produkt = produkt * geo[i];
		}
		
		
		produkt = Math.pow(Math.E, Math.log(produkt)/n);

	
		System.out.println(String.format("%.3f", produkt));
	}
	
	public static void geoabs() {
		int n = IO.readInteger();
		
		
		double [] geo = new double [n];
		double [] abs = new double [n];
		
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

	
		System.out.println(String.format("%.3f", produkt));
	}

}
