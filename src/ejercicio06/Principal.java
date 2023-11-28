package ejercicio06;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

	/* Vamos a crear un script que calcule la altura y volumen de un cilindro según el input
	 * que introduzca el usuario. Si introduce un 1, introducirá primero el área, o si
	 * introduce un 2, introducirá el volumen. Después crearemos una clase con una función
	 * que calcule el cilindro y devuelva el resultado al método main. */
	public static void main(String[] args) {
		
		// Crearemos las variables que luego el usuario introducirá por teclado para mandarlo a su clase.
		double radio = 0;
		double altura = 0;
		double result = 0;
		
		// Crearemos la variable que será el input del usuario para decidir qué introducir primero.
		int userInput = 0;
		
		// Crearemos el Scanner.
		Scanner sc = new Scanner(System.in);

		// Bucle do while con try catch para repetir el bucle en caso de que se introduzca un valor no válido.
		do {
			try {
				System.out.println("¿Qué quieres saber del cilindro?");
				System.out.println("1 = Área. 2 = Volumen." + "\n" + "Escriba el número correspondiente.");
				userInput = sc.nextInt();
				
				System.out.print("Introduzca el radio: ");
				radio = sc.nextDouble();
				
				System.out.print("Introduzca la altura: ");
				altura = sc.nextDouble();
				
				if(userInput != 1 && userInput != 2) {
					System.out.println("Has introducido un valor que no es ni 1 ni 2. Vuelve a intentarlo.");
				} 
			} catch(InputMismatchException e) {
				System.err.println("Has introducido un valor no válido. Vuelve a introducir el valor.");
				sc.nextLine();
			}
		} while(radio == 0 || altura == 0);
		
		if(userInput == 1) {
			result = Cilindro.area(radio, altura);
			System.out.println("El área es: " + result);
		}
		else if(userInput == 2) {
			result = Cilindro.volumen(radio, altura);
			System.out.println("El volumen es: " + result);
		}
		
		
		sc.close();
	}

}
