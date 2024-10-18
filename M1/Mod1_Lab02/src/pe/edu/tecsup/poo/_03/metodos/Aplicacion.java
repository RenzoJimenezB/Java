package pe.edu.tecsup.poo._03.metodos;


/**
 *  Uso de metodos de clases
 * @author jgomez
 *
 */
public class Aplicacion {

	public static void main(String[] args) {

	    // Instancia de una clase
		Matematica mat = new Matematica();
		
		// Acceso a los atributos
		mat.a = 10;
		mat.b = 3;		

        // Llamada al metodos que no retoran valores
		mat.imprimirValores();

		// Llamada al metodos que retornan valores
		int suma = mat.sumar();		
		System.out.println("La suma es " + suma);
		
		System.out.println("La resta es " + mat.resta());
		System.out.println("La multilicacion es " + mat.mult());
		System.out.println("La division es " + mat.div());

		// Llamada al metodo que reciben parametros
		int c = 12;
		System.out.println("Nro "+ c + " al cuadrado es " + mat.cuadrado(c));

	}

}
