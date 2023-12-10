package ejercicio09;

/* Creamos la clase calculadora con sus difrentes funciones de suma, resta, multiplicación
 * y división. */
public class Calculadora {
	
	/* Creamos una variable estática que estará presente en todas las funciones, ya que al final
	 * todas van a devolver la misma variable. Lo hacemos así para ahorrarnos tener que ir
	 * creando una variable result por cada función. Y dependiendo de cuál función se use,
	 * result tendrá un valor u otro. */
	static double result = 0;

	// Creamos las funciones sumar, restar, multiplicar y dividir, para devolver el resultado al Main.
	public static double Sumar(double num1, double num2) {

		result = num1 + num2;
		
		return result;
	}

	public static double Restar(double num1, double num2) {

		result = num1 - num2;
		
		return result;
	}

	public static double Multiplicar(double num1, double num2) {

		result = num1 * num2;
		
		return result;
	}

	public static double Dividir(double num1, double num2) {

		result = num1 / num2;
		
		return result;
	}
}
