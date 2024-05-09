package util;

import java.util.Scanner;

public abstract class MisArrays {
	
	protected int [] numeros = new int [10];
	Scanner sc = new Scanner(System.in);
	
	
	public MisArrays(int [] numeros) {
		this.numeros=numeros;
	}
	
	public static float MediaNota(int [] numeros) {
		
		int total=0;
		for (int i = 0 ; i<numeros.length;i++) {
			total=total+numeros[i];
		}
		return (float) total/numeros.length;
	}
	
	public static float mediana (int [] numeros) {
		
		return (float) (numeros[numeros.length/2 - 1] + numeros[numeros.length/2] /2);
	}
	
	
}
