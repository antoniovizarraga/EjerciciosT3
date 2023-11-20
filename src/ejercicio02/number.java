package ejercicio02;

public class number {
	/* Creamos una función vacía que no devolverá respuesta alguna, ya que sólo nos interesa
	 * imprimir mensajes por pantalla. Recibiremos dos valores que serán los que introduzca
	 * el usuario. */
	public static void numbers(int number1, int number2) {
		// Creamos las variables mínimas y máximas que usaremos de referencia para el bucle for.
		final int MIN;
		final int MAX;
		
		// Calculamos el mínimo y el máximo de los dos valores introducidos por el usuario.
		MIN = Math.min(number1, number2);
		MAX = Math.max(number1, number2);
		
		// Haz un bucle for en el que muestres todos los números del mínimo al máximo en pantalla.
		for(int i = MIN; i < MAX; i++)
			System.out.println(i);
	}
}
