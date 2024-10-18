package pe.edu.tecsup.poo._07.estatico.caso2;

/**
 *  Usando metodos NO estaticos
 *  
 * @author mbtec22
 *
 */
public class ClaseConMetodosNoEstaticos {

	public static void main(String[] args) {

		int ope1 = 12;
		int ope2 = 14;
		
		ClaseConMetodosNoEstaticos app = new ClaseConMetodosNoEstaticos();
		
		app.imprimirSuma(ope1,ope2);
		
		int suma = app.retornarSuma(ope1,ope2);
		System.out.println("La suma es " + suma);
		
	}

	/**
	 *  Metodo que recibe 2 parametros y no retorna ningun valor
	 * @param a
	 * @param b
	 */
	public void imprimirSuma(int a, int b) {

		int suma = a + b ;
		System.out.println("La suma es " + suma);
		//System.out.format("La suma es %d",suma);
		
	}
	
	/**
	 *  Metodo que recibe 2 parametros y retorna la suma
	 * @param a
	 * @param b
	 */
	public int retornarSuma(int a, int b) {

		int suma = a + b ;
		return suma ;
		
	}

	

}
