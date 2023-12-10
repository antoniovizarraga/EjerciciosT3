package ejercicio08;

import ejercicio07.PrimeNumber;

public class Principal {
	
/* Script que cuenta la cantidad de divisores primos que tiene un valor dado en el código. */
	public static void main(String[] args) {
		// Creamos la variable del valor que se usará para el código.
		int value = 12;
		
		// Creamos la variable para contar la cantidad de divisores primos que tiene.
		int primeCount = 0;

		/* Creamos un bucle for para que por cada iteración, compruebe si el valor es divisible por
		 * la variable i, y si el valor es primo llamando a la función del ejercicio anterior.
		 * Esto lo hacemos porque si se da la condición, significa que es un divisor primo.
		 * Por lo tanto, súmale 1 al contador de divisores primos. */
		for (int i = 2; i <= value; i++) {
			if (value % i == 0 && PrimeNumber.isPrime(i)) {
				primeCount++;
			}
		}

		// Imprimimos el resultado.
		System.out.println("El número de divisores primos que tiene " + value + " es: " + primeCount);

	}

}
