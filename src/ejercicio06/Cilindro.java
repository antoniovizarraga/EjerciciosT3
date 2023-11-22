package ejercicio06;

public class Cilindro {
	/* Creamos la función para imprimir el area y el volumen de un cilindro, dando como parámetro el radio
	 * y la altura. */
	public static void calculo(double radio, double altura) {
		// Creamos las variables que calcularemos e imprimiremos en pantalla
		double area = 0;
		double volumen = 0;
		
		
		area = (2 * Math.PI) * radio * (altura + radio);
		volumen = Math.PI * Math.pow(radio, 2) * altura;
		
		System.out.println("El área es: " + area + "\n" + "El volumen es: " + volumen);
		
	}
}
