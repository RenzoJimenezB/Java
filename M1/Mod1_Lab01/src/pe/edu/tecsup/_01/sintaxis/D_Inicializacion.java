package pe.edu.tecsup._01.sintaxis;

public class D_Inicializacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long latitud; // Declaracion de la variable

		latitud = 20393920912L; // Inicializacion

		System.out.println(latitud);

		// Inicializacion dinamica

		double a = 3.0, b = 4.0;

		double c = Math.sqrt(a * a + b * b);

		System.out.println("hipotenusa es =" + c);

	}

}
