package oop;

import java.io.IOException;

public class TestIO {
	
	public static void main(String[] args) throws IOException {
		
	String[][] text = IO.readzweidiarrString(null);
	System.out.println();
	IO.writezweidiarrString(text);
	
	Double[][] text1 = IO.readzweidiarrdouble(null);
	System.out.println();
	IO.writezweidiarrdouble(text1);
	
	int[][] tex3 = IO.readzweidiarrInt(null);
	System.out.println();
	IO.writezweidiarrint(tex3);
	
	
	}
	
}
