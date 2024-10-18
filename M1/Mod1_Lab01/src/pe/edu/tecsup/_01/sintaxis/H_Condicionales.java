package pe.edu.tecsup._01.sintaxis;

public class H_Condicionales {

	public static void main(String[] args) {
		
		/*
		 * 
		 *     if ( CONDICION BOOLEANA) {
		 * 
		 *     }
		 * 
		 * 
		 * 
		 */
		
		
		float salario = 1000f;

		if ( salario < 1500) {
			System.out.println("IF : No paga impuestos");
		}
		

		
		/*
		 * 
		 *     if ( CONDICION BOOLEANA) {
		 * 
		 *     } else {
		 * 
		 *     }
		 * 
		 */
		
		
		float salario2 = 2000f;

		if ( salario2 < 1500) {
			System.out.println("IF ELSE : No paga impuestos");
		} else {
			System.out.println("IF ELSE : Paga impuestos y es S/" + salario2*0.2);
				
		}

		
		/*
		 * 
		 *     if ( CONDICION BOOLEANA 2) {
		 * 
		 *     } else if ( CONDICION BOOLEANA 2 ){
		 * 
		 *     } else {
		 * 
		 *     }
		 *   
		 *    NUEVA CAUSISTICA : Si gana mas de 10000 soles
		 *                       el impuesto de de 50%
		 *    
		 */
		
		
		
		float salario3 = 20000f;

		if ( salario3 < 1500) {
			System.out.println("IF ELSE IF : No paga impuestos");

		} else if ( salario3 < 10000 ){
			System.out.println("IF ELSE IF : Paga impuestos y es S/" + salario3*0.2);

		} else { // mayor a 10,000 soles
			System.out.println("IF ELSE IF : Paga impuestos y es S/" + salario3*0.5);
				
		}
		
		
		
		
//		int dia = 7, turno = 1;
//		
//		if( dia == 7 && turno == 1) {
//			System.out.println("Vamos al parque");
//		}
//		
//		if( dia == 7 && turno == 1) {
//			System.out.println("Vamos al parque");
//		} else {  // otros casos
//			System.out.println("Vamos a casa");
//		}
//		
//		
//		if( dia == 7 && turno == 1) {
//			System.out.println("Vamos al parque");
//		}else if( dia == 6 && turno == 2 ) {
//			System.out.println("Vamos a la fiesta");
//		}else if( dia == 6 && turno == 1) {
//			System.out.println("Vamos a la playa");
//		}else {
//			System.out.println("Seguir programando");
//		}


		
	/*	
		String diaS = "Lunes";
		
		if(diaS == "Lunes") {
			System.out.println("Ir al  trabajo");
		} else {
			System.out.println("Trabajo en casa");
		}
*/
	}

}
