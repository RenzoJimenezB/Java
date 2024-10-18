package pe.edu.tecsup._01.sintaxis;

public class A_Variables2 {

	public static void main(String[] args) {
		
		// ---------  Enteros ----------
		
		byte edad = 12;                      // 1 byte  [ -2^(8) , 2^(8)-1  ]
		
		short altura = 164;                  // 2 bytes [ -2^(16), 2^(16)-1 ]
		 
		int posicion = 20000;                // 4 bytes [ -2^(32), 2^(32)-1 ]
		
		long latitud = 9223372036854775807L; // 8 bytes [ -2^(64), 2^(64)-1 ]
		
		
		// ---------  Decimales ----------

		float sueldo = 2000.90F;             // 8 bytes , Exactitud = 7 decimales
		
		double longitud = 1909282012.500;    //16 bytes , Exactitud = 16 decimales

		
		// ---------  Boleano ----------
				
		boolean registrado = false;
		
		boolean ausente = true;
		
		// ---------  Caracter ----------
		//  2 bytes, use UNICODE 
					
		char letraA = 'a';

		char letraB = '\u0062';
		
		char letraC = 99;
		
		System.out.println(letraC);
		
		
		// ---------  String ----------
		
		String nombre = "Juan Salazar";	          // No es primitivo
		
		// syso --->  Ctrl + Space
		System.out.println(nombre);
		

	}
	
	
}
