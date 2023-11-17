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
		
		System.out.print("Escribe un número entero: ");
		numUser = sc.nextInt();
		
		Echo.eco(numUser);
		
		sc.close();
	}

}
