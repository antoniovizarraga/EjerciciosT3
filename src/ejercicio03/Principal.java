package ejercicio03;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

	/* Vamos a crear una aplicación por consola que nos permita saber si al introducir dos valores
	 * escritos por el usuario, cuál es el valor mayor, para luego devolver el valor máximo a al
	 * método main e imprimir por pantalla el resultado. */
	public static void main(String[] args) {
		// Creamos los valores que le pediremos al usuario para el Scanner.
		int numUser1 = 0;
		int numUser2 = 0;
		
		/* Y creamos la variable de referencia que será el resultado de saber cuál de los dos valores es
		 * el máximo. */
		final int RESULT;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		/* Hacemos un bucle do while con un try catch en su interior para
		 * repetir el bucle del código si el programa detecta un valor no
		 * válido. */
		do {
			try {
				System.out.print("Introduzca un valor entero positivo: ");
				numUser1 = sc.nextInt();

				System.out.println("Introduzca otro valor: ");
				numUser2 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Has introducido un valor inesperado. Vuelve a introducir el valor.");
				sc.nextLine();
			}
			
			// Comprueba si uno de los dos valores es 0. Si lo es...
			if(numUser1 == 0 || numUser2 == 0)
				break; // Detén el bucle y sigue con el código.
		} while (numUser1 == 0 || numUser2 == 0);
		
		/* Guardamos en una variable el resultado de saber cuál de los dos valores es el máximo, 
		 * ya que la función devuelve el valor máximo. */
		RESULT = MaxNumber.maxFunction(numUser1, numUser2);
		
		// Imprimimos el resultado.
		System.out.println("El máximo de " + numUser1 + " y " + numUser2 + " es: " + RESULT);
		
		// Cerramos el Scanner.
		sc.close();
	}

}
