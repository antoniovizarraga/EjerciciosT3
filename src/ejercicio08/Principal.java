package ejercicio08;

import ejercicio07.PrimeNumber;

public class Principal {

	public static void main(String[] args) {
		int value = 12;
		int primeCount = 0;
		boolean isPrime = false;
		
		for(int i = 1; i < value; i++) {
			if((value % i) == 0) {
				isPrime = PrimeNumber.isPrime(i);
				if(isPrime == true) {
					if(value / i == 0)
					primeCount++;
				}
			}
		}
		
		System.out.println("El número de divisores primos que tiene " + value +
		" es: " + primeCount);

	}

}
