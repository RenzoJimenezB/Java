package pe.edu.tecsup._01.sintaxis;

public class G_1_OperadoreAritmeticos {

	public static void main(String[] args) {
		
		int a = 10, b = 3;
		
		// Suma
		int c = a + b;
		System.out.println("Resultado de suma: " + c);
		
		// Resta
		int d = a - b;
		System.out.println("Resultado de resta: " + d);
		
		// Multiplicacion
		int e = a * b;
		System.out.println("Resultado de mult: " + e);
		
		// Division
		int f1 =  a / b;
		System.out.println("Resultado de div[int]: " + f1);

		float f2 = (float) a / b;
		System.out.println("Resultado de div[float]: " + f2);

		double f3 = (double) a / b;
		System.out.println("Resultado de div[double]: " + f3);

		// double f4 = Math.round(f3); , cantidad de decimales
		
		
		//System.out.println("Resultado : " +f4);
	
		
		
		// Residuo
		int g = a % b;
		System.out.println("Resultado de residuo : " + g);
		
		
		/*
		// Mostrar el tipo de dato
		String type = ((Object)f2).getClass().getName(); 
		System.out.println(type); 
		*/
	}

}
