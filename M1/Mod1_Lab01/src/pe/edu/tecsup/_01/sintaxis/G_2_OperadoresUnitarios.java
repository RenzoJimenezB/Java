package pe.edu.tecsup._01.sintaxis;

public class G_2_OperadoresUnitarios {

	public static void main(String[] args) {
		
		int a = 10;
		
		++a;
		
		++a;
		
		a++;
		
		System.out.println("Resultado a: " + a);
		
		//-------
		
		int b = 10;
		
		int c = b++;
				
		System.out.println("----------------");

		System.out.println("Resultado b: " + b);

		System.out.println("Resultado c: " + c);

		int d = ++b;

		System.out.println("----------------");
		
		System.out.println("Resultado b: " + b);

		System.out.println("Resultado d: " + d);
		
		int f = 12;
		
		f +=5; // f = f + 5 ;
		f -=5;
		
		System.out.println(f);
		

		
	}

}
