package ejercicio04;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

	/* Vamos a crear una aplicación que diga si una letra (Char) introducida a nivel de código
	 * (Ya que no se ha especificado explícitamente que la letra la tenga que introducir el
	 * usuario), es una vocal o no. Usaremos una clase que devuelva un booleano para ello. */
	public static void main(String[] args) {
		// Creamos el char con el que comprobaremos si la letra introducida es una vocal.
		String character = "";
		
		// Creamos el boolean que usaremos para saber si char es una vocal o no.
		final boolean IS_VOCAL;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				System.out.print("Introduce una letra: ");
				character = sc.next();
			} catch(InputMismatchException e) {
				System.err.println("Error. Se ha introducido un valor no válido. Vuelve a intentarlo.");
				sc.next();
			}
		} while(character.equals(""));
		/* Asignamos a la variable de referencia la comprobación de si el character es una vocal o no 
		 * gracias a la función creada en la clase Vocal. */
		IS_VOCAL = Vocal.vocalCheck(character);
		
		// Si es vocal, imprime que es una vocal. En caso contrario, imprime que no es una vocal.
		if(IS_VOCAL == true)
			System.out.println("Es una vocal.");
		else
			System.out.println("No es una vocal.");
		
		sc.close();
		
	}

}
