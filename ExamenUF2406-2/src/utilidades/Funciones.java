package utilidades;
/**
 * Clase Funciones que modela en este caso las funciones devuelveCentral y esBisiesto. 
 * @author Esther Robleda
 *
 */
public class Funciones {
	/**
	 * Función que devuelve el número por el que según su valor se queda en el centro. 
	 * @param num1 valor del número 1
	 * @param num2 valor del número 2
	 * @param num3 valor del número 3
	 * @return el número que esta en el centro.
	 */
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ( ((num1>num2) && (num1<num3)) || ((num1>num3) && (num1<num2))) {
			enMedio=num1;
		}  else if  ( ((num2>num1) && (num2<num3)) || ((num2>num3) && (num2<num1)) ){
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	
/**
 * Función que nos devuelve si el año es bisiesto o no. 
 * @param anyo indica el año introducido
 * @return nos devuelve true si el año es bisiesto y false si no lo es.
 */
	public boolean esBisiesto(int anyo) {
		boolean bisiesto = false;
		if (anyo <1700 || anyo >2500) {
			throw new ArithmeticException("El a�o debe estar entre 1700 y 2500");
		}
		if (anyo %4 == 0 ) {
			if (anyo%100==0 && anyo%400!=0) {
				bisiesto=false;
			} else {
				bisiesto=true;
			}
		} else  {
			bisiesto=false;
		}
		return bisiesto;
	}
	

	
	
}
