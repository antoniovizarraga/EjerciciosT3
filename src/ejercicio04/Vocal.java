package ejercicio04;

public class Vocal {
	/* Creamos una función boolean que compruebe que un valor dado en el código del método
	 * main es una vocal o no. Para ello usaremos un char como valor. */
	public static boolean vocalCheck(String userInput) {
		// Crea la variable de referencia que luego devolveremos al método main para saber si es vocal o no.
		final boolean IS_VOCAL;
		
		/* Haz un switch case en el que dependiendo de si tiene vocales, le asignas el valor:
		 * "true" al boolean. Si no, por defecto le asignas el valor: "false". */
		switch(userInput) {
		case "a", "A", "e", "E", "i", "I", "o", "O", "u", "U":
			IS_VOCAL = true;
			break;
		default:
			IS_VOCAL = false;
		}
		
		// Retorna el valor del boolean.
		return IS_VOCAL;
	}
}
