package pe.edu.tecsup._01.sintaxis;

public class G_6_OperadorCondicion {

	public static void main(String[] args) {
		
		int a = 150;
		
		
		// EXPRESION BOOLEANA ?  
		//  RETORNO DE VALOR SI ES V : 
		// RETORNO DE VALOR SI ES F ;
		
		
		// C = a siempre y cuando "a" no se mayor a 100, 
		int c = (a >= 100) ? 100 : a;
		System.out.println(c);
		
		/*
		 Ejercicio 01  
		 Si una variable x , es menor que 10, el valor a 
		 asignar es 10, caso contrario asignar a la variable x
		 su propio valor
		*/
		
				
		int x = 1;	    
        x = (x < 10) ? 10 : x;
        System.out.println("ejercicio: " + x);
		
		

//		if(a <= 100) {
//			c = a;
//		} else {
//			c = 100;
//		}
		
	}

}
