package ejercicio05;

public class MultiplyTable {
	/* Creamos la función que se encargará de imprimir en pantalla la tabla de multiplicar
	 * del valor escrito por el usuario. Usaremos un int como parámetro que será el valor
	 * del usuario. */
	public static void numberTable(int numUser) {
		/* Hacemos un for que vaya imprimiendo 10 veces un mensaje con su correspondiente cifra,
		 * haciendo así la tabla de multiplicar de dicho número. */
		for(int i = 1; i <= 10; i++) {
			System.out.println(numUser + " x " + i + " = " + (numUser * i));
		}
	}
}
