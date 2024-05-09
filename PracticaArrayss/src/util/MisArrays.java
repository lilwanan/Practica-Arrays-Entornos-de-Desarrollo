package util;

import java.util.Scanner;

public abstract class MisArrays {
	
	protected int [] numeros = new int [10];
	Scanner sc = new Scanner(System.in);
	
	/**
	 * contructor para mi array
	 * @param numeros
	 */
	
	public MisArrays(int [] numeros) {
		this.numeros=numeros;
	}
	/**
	 *  Con este metodo hace la media de un array de las notas
	 * @param numeros
	 * @return devuelve el total sumado de todos los elementos del array entre la longitud del array
	 */
	
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
	
	/**
	 * Realiza la mediana de una serie de numeros almacenados en un array coge el valor intermedio de dicho array
	 * @param numeros
	 * @return devuelve en el if el valor intermedio de un array si es par realizando la suma de los dos numeros y dividiendo entre 2
	 */
	
	public static float mediana (int [] numeros) {
		
		if(numeros.length%2 ==0) {
			
			return (float) (numeros[numeros.length/2 - 1] + numeros[numeros.length/2] /2);
			
		}
		else {
			return (float) numeros[numeros.length/2];
		}
	}
	
	/**
	 * De un array saca el valor máximo
	 * @param numeros
	 * @return devuelve dicho numero tras compararlo con el resto
	 */
	
	 public static int Maximo(int[] numeros) {
		 for (int i = 0 ; i<numeros.length;i++) {  
	        if (numeros.length == 0 || numeros[i]<0||numeros[i]>10) {
	            throw new IllegalArgumentException("No hay notas o las notas están introducidas incorrectamente");
	        }
		 }

	        
	        int maximo = numeros[0];

	        
	        for (int i = 1; i < numeros.length; i++) {
	           
	            if (numeros[i] > maximo) {
	                maximo = numeros[i];
	            }
	        }

	        
	        return maximo;
	    }
	 
	 /**
	  * Saca el valor minimo de un array
	  * @param numeros
	  * @return Devuelve el valor mínimo tras haberlo comparados
	  */
	 
	 public static int Minimo(int[] numeros) {
		 for (int i = 0 ; i<numeros.length;i++) {  
	        if (numeros.length == 0 || numeros[i]<0||numeros[i]>10) {
	            throw new IllegalArgumentException("No hay notas o las notas están introducidas incorrectamente");
	        }
		 }

	        
	        int minimo = numeros[0];

	        
	        for (int i = 1; i < numeros.length; i++) {
	           
	            if (numeros[i] < minimo) {
	                minimo = numeros[i];
	            }
	        }

	        
	        return minimo;
	    }
	
	
}

