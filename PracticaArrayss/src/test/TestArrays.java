package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestArrays {
	 
	 private static int[] valoresValidos;
	 private static int[] valoresInvalidos;
	 

	    @BeforeAll
	    public static void setUp() {
	    	valoresValidos = new int[] {3,6,8,9,10};
	    	valoresInvalidos = new int [] {-1,6,7,8};
	    	
	    	
	   	 	
	    }
	    
	    @Test
	    void pruebaMedia() {
	    	float numeroEsperado = (float) 7.2;
	    	float numeroObtenido = util.MisArrays.MediaNota(valoresValidos);
	    	assertEquals(numeroEsperado,numeroObtenido);
	    }
	    @Test
	    void pruebaMediaException() {
	    	Exception exception = assertThrows(IllegalArgumentException.class,()->MisArrays.MediaNota(valoresInvalidos));
	    	String numeroEsperado = "No hay notas o las notas están introducidas incorrectamente";
	    	String numeroObtenido = exception.getMessage();
	    	assertEquals(numeroEsperado,numeroObtenido);
	    }
	
	    @Test
	    void pruebaMediana() {
	    	float numeroEsperado = (float) 8.0;
	    	float numeroObtenido = util.MisArrays.mediana(valoresValidos);
	    	assertEquals(numeroEsperado,numeroObtenido);
	    }
	    
	    @Test
	    void pruebaMaximo() {
	    	int numeroEsperado = 10;
	    	int numeroObtenido = util.MisArrays.Maximo(valoresValidos);
	    	assertEquals(numeroEsperado,numeroObtenido);
	    }
	    
	    @Test
	    void PruebaMaximoException(){
	    	Exception exception = assertThrows(IllegalArgumentException.class,()->MisArrays.Maximo(valoresInvalidos));
	    	String numeroEsperado = "No hay notas o las notas están introducidas incorrectamente";
	    	String numeroObtenido = exception.getMessage();
	    	assertEquals(numeroEsperado,numeroObtenido);
	    }
	    
	    
	    
	    @Test
	    void pruebaMinimo() {
	    	int numeroEsperado = 3;
	    	int numeroObtenido = util.MisArrays.Minimo(valoresValidos);
	    	assertEquals(numeroEsperado,numeroObtenido);
	    }
	    
	    @Test
	    void PruebaMinimoException(){
	    	Exception exception = assertThrows(IllegalArgumentException.class,()->MisArrays.Minimo(valoresInvalidos));
	    	String numeroEsperado = "No hay notas o las notas están introducidas incorrectamente";
	    	String numeroObtenido = exception.getMessage();
	    	assertEquals(numeroEsperado,numeroObtenido);
	    }

}
