package pe.edu.tecsup._01.sintaxis;

public class G_3_OperadorComparacion {

	public static void main(String[] args) {
		
		int edadMaria = 18, edadLucia = 24;
		boolean resultado;
		
		// La edad de Maria es menor que la edad de Lucia
		resultado = edadMaria < edadLucia;
		System.out.println(resultado);
		
		// La edad de Maria es menor o igual  que la edad de Lucia
		resultado = edadMaria <= edadLucia;
		System.out.println(resultado);
		
		// La edad de Maria es igual a la edad de Lucia
		resultado = edadMaria == edadLucia;
		System.out.println(resultado);
		
		// La edad de Maria es mayor o igual que la edad de Lucia
		resultado = edadMaria >= edadLucia;
		System.out.println(resultado);

		// La edad de Maria es mayor que la edad de Lucia
		resultado = edadMaria > edadLucia;
		System.out.println(resultado);
		
		// La edad de Maria es diferente a la edad de Lucia
		resultado = edadMaria != edadLucia;
		System.out.println(resultado);
		
		/*
		if(edadLucia == edadMaria) {
			System.out.println("Tienen la misma edad");
		} else {
			System.out.println("Tienen edades distintas");
		}
		*/
	}

}
