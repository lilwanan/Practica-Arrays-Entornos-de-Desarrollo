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
			if(numeros[i]<0 || numeros[i]>10 || numeros.length==0) {
				throw new IllegalArgumentException("No hay notas o las notas están introducidas incorrectamente");
			} else {
			total=total+numeros[i];
			}
		}
		return (float) total/numeros.length;
	}
	
	public static float mediana (int [] numeros) {
		
		if(numeros.length%2 ==0) {
			
			return (float) (numeros[numeros.length/2 - 1] + numeros[numeros.length/2] /2);
			
		}
		else {
			return (float) numeros[numeros.length/2];
		}
	}
	
	
}

