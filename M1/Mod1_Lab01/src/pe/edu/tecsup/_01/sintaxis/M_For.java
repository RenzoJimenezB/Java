package pe.edu.tecsup._01.sintaxis;

public class M_For {

	public static void main(String[] args) {
		
		
		for( int i = 0 ; i < 10 ; i++ ) {
			
			System.out.println("saludos: " + i);
			
		}
		
		for( int i = 0 ; i < 10 ; i += 2 ) {
			
			System.out.println("mensajes: " + i);
			
		}
		
		for(int i = 10; i >= 0; i--) {
			if(i == 7) {
				break;
			}
			System.out.println("Valor: " + i);
			
		}
		
		
		
		for (int counter = 10; counter > 0; counter--) {
			System.out.println("Cuenta abajo: " + counter);
		}	

		int counter = 10;
		for ( ;counter > 0; ) {
			System.out.println("Cuenta abajo: " + counter);
			counter--;
		}
		
		
//		while (true) {
//			
//		}
		
		
		/*
		 Ejercicio : 
		 
		 Usando un for imprimir los siguiente numeros
		    2, 4, 8, 16, 32, 64
		    		 
		 */
		
		for (int i = 2; i <= 64; i*=2) {
            System.out.print(i + " "); // ln = line new
            //System.out.println(i + " "); // ln = line new
        }
		
		
		
	}

}
