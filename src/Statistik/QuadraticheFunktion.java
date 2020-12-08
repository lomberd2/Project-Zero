package Statistik;

import oop.IO;

public class QuadraticheFunktion {

	public static void main(String[] args) {
		System.out.println("sie haben im Moment die gleichung = ax² + bx + c");
		System.out.println("geben sie für a,b und c ihre werte ein");

		System.out.print("a = ");
		double a = IO.readDouble();

		System.out.print("b = ");
		double b = IO.readDouble();

		System.out.print("c = ");
		double c = IO.readDouble();

		System.out.println("Ihre aktuelle Formel ist = " + a + "x²" + b + "x" + c);

		double p = b / a;
		double q = c / a;

		System.out.println("Ihre PQ_Funktion Lautet = x² " + p + " x + " + q);

		double x1 = -(p/2) + Math.sqrt(((p/2) * (p/2)) - q);

		double x2 = -(p/2) - Math.sqrt(((p/2) * (p/2)) - q);


		double d = ((p/2) * (p/2) - q);

		if (d < 0) {
			System.out.println("es gibt keine Nullstellen");
		} else if (d == 0){
			System.out.println("es gibt eine Nullstelle = x1: " + x1);
		} else if (d > 0) {
			System.out.println("es gibt 2 Nullstellen = x1: " + x1 + " x2: " + x2);
		}

	}

}
