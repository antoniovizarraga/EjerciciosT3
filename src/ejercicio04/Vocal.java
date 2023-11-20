package ejercicio04;

public class Vocal {
	/* Creamos una función boolean que compruebe que un valor dado en el código del método
	 * main es una vocal o no. Para ello usaremos un char como valor. */
	public static boolean vocalCheck(char userInput) {
		// Crea la variable de referencia que luego devolveremos al método main para saber si es vocal o no.
		final boolean IS_VOCAL;
		
		/* Haz un switch case en el que dependiendo de si tiene vocales, le asignas el valor:
		 * "true" al boolean. Si no, por defecto le asignas el valor: "false". */
		switch(userInput) {
		case 'a':
			IS_VOCAL = true;
			break;
		case 'A':
			IS_VOCAL = true;
			break;
		case 'e':
			IS_VOCAL = true;
			break;
		case 'E':
			IS_VOCAL = true;
			break;
		case 'i':
			IS_VOCAL = true;
			break;
		case 'I':
			IS_VOCAL = true;
			break;
		case 'o':
			IS_VOCAL = true;
			break;
		case 'O':
			IS_VOCAL = true;
			break;
		case 'u':
			IS_VOCAL = true;
			break;
		case 'U':
			IS_VOCAL = true;
			break;
		default:
			IS_VOCAL = false;
		}
		
		// Retorna el valor del boolean.
		return IS_VOCAL;
	}
}
