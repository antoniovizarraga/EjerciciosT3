package ejercicio07;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

	/* Programa que comprobará usando una clase con funciones si un valor
	 * dado como parámetro es un valor primo o no. */
	public static void main(String[] args) {
		// Creamos el valor que le pediremos al usuario para pasarlo a la función.
		int numUser = 0;
		
		// Creamos el boolean que contendrá lo que retorne la función.
		boolean result = false;

		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		/* Creamos un bloque do-while con un try-catch para que si el usuario mete 
		 * un valor que no debe, le vuelva a pedir el valor. */
		do {
			try {
				System.out.print("Introduce un valor para comprobar si es primo: ");
				numUser = sc.nextInt();

			} catch (InputMismatchException e) {
				System.err.println("Error. Has introducido un valor no válido. Vuelva a intentarlo.");
				sc.nextLine();
			}
		} while (numUser == 0);
		
		// Guardamos lo que retorne la función en result.
		result = PrimeNumber.isPrime(numUser);
		
		// Y dependiendo de si result es true o false, imprimimos un mensaje u otro.
		if(result == true)
			System.out.println(numUser + " es un número primo.");
		else
			System.out.println(numUser + " no es un número primo.");
		
		// Cerramos el Scanner.
		sc.close();
	}

}
