package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestArrays {
	 
	 private static int[] valoresValidos;
	 private static int[] valoresInvalidos;
	 

	    @BeforeAll
	    public static void setUp() {
	    	valoresValidos = new int[] {3,6,8,9,10};
	    	valoresInvalidos = new int [] {};
	    	
	   	 	
	    }
	    
	    @Test
	    void pruebaMedia() {
	    	float numeroEsperado = (float) 7.2;
	    	float numeroObtenido = util.MisArrays.MediaNota(valoresValidos);
	    	assertEquals(numeroEsperado,numeroObtenido);
	    }
	

}
