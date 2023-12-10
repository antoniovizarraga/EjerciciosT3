package ejercicio09;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Creamos las variables que serán las que pediremos al usuario para luego hacer
		 * su operación correspondiente en la clase Calculadora.
		 */
		double num1 = 0;
		double num2 = 0;
		
		// Creamos la variable para guardar el resultado de la clase Calculadora.
		double result = 0;

		// Creamos la variable en la que el usuario decida qué función ejecutar.
		int userRes = 0;

		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos el bucle do while con try-catch para que detecte si hay errores en el input.
		do {
			try {
				
				System.out.print("Introduce un valor: ");
				num1 = sc.nextDouble();
				
				System.out.print("Introduce otro valor: ");
				num2 = sc.nextDouble();
				
				System.out.println("¿Qué función de la calculadora quieres usar?");
				System.out.println("1 = Sumar. 2 = Resta. 3 = Multiplicación. 4 = División.");

				userRes = sc.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Error. Has introducido un valor no válido. Vuelve a intentarlo.");
				sc.next();
			}
		} while (userRes == 0);

		
		// Con un Switch, sabemos qué función ejecutar dependiendo del caso.
		switch (userRes) {

		/* En cada caso, guardamos en result lo que devuelva la función Calculadora(), para así
		 * poder imprimirlo luego en pantalla. */
		case 1:
			result = Calculadora.Sumar(num1, num2);
			System.out.println("La suma de: " + num1 + " + " + num2 + " es: " + result);
			break;
		
		case 2:
			result = Calculadora.Restar(num1, num2);
			System.out.println("La resta de: " + num1 + " - " + num2 + " es: " + result);
			break;
		
		case 3:
			result = Calculadora.Multiplicar(num1, num2);
			System.out.println("La multiplicación de: " + num1 + " x " + num2 + " es: " + result);
			break;
			
		case 4:
			result = Calculadora.Dividir(num1, num2);
			System.out.println("La división de: " + num1 + " entre " + num2 + " es: " + result);
			break;
		
			/* En el caso de que meta un valor que no sea del 1 al 4, imprimimos un mensaje
			 * en pantalla para informar al usuario. */
		default:
			System.out.println("No has introducido un valor del 1 al 4. Saliendo del programa...");
		}

		sc.close();
	}

}
