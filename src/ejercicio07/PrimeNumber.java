package ejercicio07;

public class PrimeNumber {
	/* Creamos una función boolean ya que eso es lo que devolverá al Main
	Le pasamos como parámetro el número del usuario. */
	public static boolean isPrime(int number) {
		// Creamos el boolean que devolveremos al Main
		boolean isPrime = true;
		
		// Si el valor dado es menor o igual que 0, di que no es primo.
		if(number <= 0)
			isPrime = false;
		else
			/* Haz un bucle for en el que haga operaciones hasta que i valga lo
			 * mismo que dividir el número del usuario entre 2. */
			for(int i = 2; i <= number / 2; i++) {
				/* Comprueba en cada iteración si el resto de dividir el número
				 * dado por el usuario entre la i es igual a 0 (Lo cual significa
				 * que no es primo). De no serlo, pon false y detén el bucle. */
				if((number % i) == 0) {
					isPrime = false;
					break;
				}
			}
		// Retorna el boolean al Main
		return isPrime;
	}
}
