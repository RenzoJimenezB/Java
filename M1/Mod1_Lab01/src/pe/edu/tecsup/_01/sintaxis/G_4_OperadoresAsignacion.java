package pe.edu.tecsup._01.sintaxis;

public class G_4_OperadoresAsignacion {

	public static void main(String[] args) {
		
		int a = 10;
		a++;
		a--;
		
		a += 5;  // a = a + 5  ----> NOT a =- 5
		System.out.println(a);	// 15
		
		a -= 7;    // a = a-7
		System.out.println(a);	// 8
		
		a *= 2;    // a = a*2
		System.out.println(a);	// 16
		
		a /= 4;   // a = a/4
		System.out.println(a);	// 4

		int b = 32;
		b %= 3;  // a = a % 3
		System.out.println(b);	// 1

		//32 / 3  = 10 * 3 + 2

	}

}
