package ejercicio05;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
	/* Vamos a crear una aplicación que le pida al usuario un valor, para luego mostrar en pantalla
	 * usando una clase la tabla de multiplicar de dicho valor ya mencionado. */
	public static void main(String[] args) {
		// Creamos el valor que le pediremos al usuario para el Scanner.
		int numUser = 0;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		/* Hacemos un bucle do while con un try catch en su interior para
		 * repetir el bucle del código si el programa detecta un valor no
		 * válido. */
		do {
			try {
				System.out.print("Introduzca el valor del que desee saber su tabla de multiplicar: ");
				numUser = sc.nextInt();
				
			} catch (InputMismatchException e) {
				System.err.println("Has introducido un valor inesperado. Vuelve a introducir el valor.");
				sc.nextLine();
			}
			
		} while (numUser == 0);
		
		/* Imprime la tabla de multiplicar del número introducido por el usuario gracias a la función
		 * definida en la clase MultiplyTable. */
		MultiplyTable.numberTable(numUser);
		
		// Cerramos el Scanner.
		sc.close();
	}

}
