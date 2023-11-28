package ejercicio06;

public class Cilindro {
	/* Creamos la función para imprimir el area y el volumen de un cilindro, dando como parámetro el radio
	 * y la altura. */
	public static double area(double radio, double altura) {
		// Creamos las variables que calcularemos e imprimiremos en pantalla
		double area = 0;
		
		
		area = (2 * Math.PI) * radio * (altura + radio);
		
		return area;
		
	}
	
	public static double volumen(double radio, double altura) {
		double volumen = 0;
		
		volumen = Math.PI * Math.pow(radio, 2) * altura;
		
		return volumen;
	}
}
