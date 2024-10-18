package pe.edu.tecsup.poo._07.estatico.caso1;

/**
 *  Usando metodos estaticos
 *  
 * @author mbtec22
 *
 */
public class ClaseConMetodosEstaticos {

	public static void main(String[] args) {

		int ope1 = 12;
		int ope2 = 14;
		
		imprimirSuma(ope1,ope2);
		
		int suma = retornarSuma(ope1,ope2);
		System.out.println("La suma es " + suma);
		
	}

	/**
	 *  Metodo que recibe 2 parametros y no retorna ningun valor
	 * @param a
	 * @param b
	 */
	//  AMBITO  FORMA  TIPO_DATO_RETORNO NOMBRE ( LISTADO DE ARG ) {}
	public static void imprimirSuma(int a, int b) {

		int suma = a + b ;
		System.out.println("La suma es " + suma);
		//System.out.format("La suma es %d",suma);
		
	}
	
	/**
	 *  Metodo que recibe 2 parametros y retorna la suma
	 * @param a
	 * @param b
	 */
    //  AMBITO  FORMA  TIPO_DATO_RETORNO NOMBRE ( LISTADO DE ARG ) {}
	public static int retornarSuma(int a, int b) {

		int suma = a + b ;
		
		// Retorna un valor.
		return suma ;
		
	}

	

}
