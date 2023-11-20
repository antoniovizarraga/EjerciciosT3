package ejercicio03;

public class MaxNumber {
	/* Creamos una función de tipo int ya que la función debe retornar el valor máximo
	 * de los dos valores que introducirá el usuario. Esto lo haremos poniendo dos
	 * valores como parámetros. */
	public static int maxFunction(int number1, int number2) {
		// Creamos la variable que devolveremos al método main que contendrá el máximo de los dos valores.
		final int MAX;
		
		// Calculamos el máximo.
		MAX = Math.max(number1, number2);
		
		// Y devolvemos el valor.
		return MAX;
	}
}
