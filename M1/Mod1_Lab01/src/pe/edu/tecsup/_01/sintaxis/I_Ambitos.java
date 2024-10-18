package pe.edu.tecsup._01.sintaxis;

public class I_Ambitos {

	private static String message;
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		if(a == 10) {
			System.out.println(a);
			b = 5;
			int c = 3;
		}
		
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);   // Variable declarado fuera del ambito
		
		{
			int d = 4;
		}
		
		{
			int e = 10;
		}
		
		int d = 1;
//		int d = 2;
			
		message = "Hola Juan";
		print();

	}
	
	private static void print() {
		System.out.println(message);
	}

}
