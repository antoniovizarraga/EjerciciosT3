package ejercicio01;

// Creamos una clase Echo para imprimir en pantalla el mensaje: "Eco...".
public class Echo {
	/* Creamos una función que no devolverá nada, ya que la idea es que haremos una función que sólo
	 *  imprima un mensaje en pantalla x veces, siendo x el input del usuario. Para ello, creamos un
	 *  int que será un parámetro que le pasaremos a la función.*/
	public static void eco(int echo) {
		// Creamos un bucle for para imprimir el mensaje: "Eco..." todas las veces que el usuario solicite.
		for(int i = 0; i < echo; i++) {
			System.out.println("Eco...");
		}
	} 
}
