package utilidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



public class FuncionesTest{

	 private static Funciones f;
	 
	 @BeforeAll
		static void inicializarFunciones() {
			f = new Funciones();
		}
	 
	 @Test
	 
	 void devuelveCentralTest () {
		 assertEquals(5,f.devuelveCentral(1, 5, 9), "Correcto el número central es el 5");
		 assertEquals(5,f.devuelveCentral(5, 9, 1), "Correcto el número central es el 5");
		 assertEquals(5,f.devuelveCentral(9, 1, 5), "Correcto el número central es el 5");
		 
		 
		 
	 
} 

	 @Test
	 
	 void   esBisiestoTest (int anyo) {
		 
	
		 
}
}
