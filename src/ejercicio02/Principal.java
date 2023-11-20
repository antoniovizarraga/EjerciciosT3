package ejercicio02;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

	/* Vamos a crear un ejercicio en el que el usuario introduce dos valores por teclado y luego
	 * el programa a través de una clase creada en Java y una función creada en dicha clase donde
	 * le pasaremos como parámetro los dos valores mencionados anteriormente, el programa imprima
	 * por pantalla todos los números comprendidos entre los dos valores. */
	public static void main(String[] args) {
		// Creamos los valores que le pediremos al usuario para usarlos con el Scanner.
		int numUser1 = 0;
		int numUser2 = 0;

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
		/* Esto se hace para que, si el programa detecta un valor con decimales por ejemplo, salte el error
		 * y repita el bucle. Ya que si el programa detecta un error, no cambia el valor de las variables,
		 * por lo que el bucle se seguiría repitiendo. Si consigue salir del try catch, significa que ha
		 * introducido un valor correcto. Por lo que, no nos interesa que si en un caso metiese un 0 por
		 * ejemplo, se siguiera repitiendo el bucle. Por ese motivo comprobamos si algún valor es 0 y de
		 * ser así, salimos del bucle por completo.*/
		
		/* Ejecutamos la función numbers de la clase number (Sé que no son muy buenos los nombres) para
		 * que dados numUser1 y numUser2, ejecute su función correspondiente encargada de mostrar todos
		 * los números comprendidos entre los dos valores. */
		number.numbers(numUser1, numUser2);
		
		// Finalmente, cerramos el Scanner.
		sc.close();
	}

}
