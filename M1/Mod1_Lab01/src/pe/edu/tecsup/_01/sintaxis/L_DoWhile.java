package pe.edu.tecsup._01.sintaxis;

public class L_DoWhile {

	public static void main(String[] args) {
		
		int counter = 10;
		
		do {
			
			/*
			if(counter == 5) {
				break;	// Sale del bloque de flujo
			}
			//*/
			
			counter--;
			
			/*
			if(counter == 6 || counter == 5 || counter == 4) {
				continue;	// Salta a la siguiente iteracion
			}
			//*/
			
			System.out.println("Cuenta abajo: " + counter);
			
		} while(counter > 0);
		
		System.out.println("Final del programa");

	}

}
