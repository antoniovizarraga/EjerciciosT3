package ejercicio01;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int numUser = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un número entero: ");
		numUser = sc.nextInt();
		
		Echo.eco(numUser);
		
		sc.close();
	}

}
