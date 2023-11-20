package ejercicio01;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* Variable que será el número introducido por el usuario.
		 * Se usará para imprimir el: "Eco..." n veces que esté
		 * en esta variable. */
		int numUser = 0;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el valor al usuario para usarlo en la clase Echo.
		System.out.print("Escribe un número entero: ");
		numUser = sc.nextInt();
		
		// Invocamos la función Eco de la clase Echo, dándole de parámetro el valor introducido del usuario.
		Echo.eco(numUser);
		
		// Cerramos el Scanner.
		sc.close();
	}

}
