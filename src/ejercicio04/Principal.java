package ejercicio04;

public class Principal {

	/* Vamos a crear una aplicación que diga si una letra (Char) introducida a nivel de código
	 * (Ya que no se ha especificado explícitamente que la letra la tenga que introducir el
	 * usuario), es una vocal o no. Usaremos una clase que devuelva un booleano para ello. */
	public static void main(String[] args) {
		// Creamos el char con el que comprobaremos si la letra introducida es una vocal.
		char character = 'a';
		
		// Creamos el boolean que usaremos para saber si char es una vocal o no.
		final boolean IS_VOCAL;
		
		/* Asignamos a la variable de referencia la comprobación de si el character es una vocal o no 
		 * gracias a la función creada en la clase Vocal. */
		IS_VOCAL = Vocal.vocalCheck(character);
		
		// Si es vocal, imprime que es una vocal. En caso contrario, imprime que no es una vocal.
		if(IS_VOCAL == true)
			System.out.println("Es una vocal.");
		else
			System.out.println("No es una vocal.");
		
	}

}
