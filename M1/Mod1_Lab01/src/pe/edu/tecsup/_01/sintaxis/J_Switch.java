package pe.edu.tecsup._01.sintaxis;

public class J_Switch {

	public static void main(String[] args) {

		int dia = 4;

//		if(dia == 1) {
//			System.out.println("es Lunes");
//		}else if(dia == 2) {
//			System.out.println("es Martes");
//		}else if(dia == 3) {
//			System.out.println("es Miercoles");
//		}else if(dia == 4) {
//			System.out.println("es Jueves");
//		}

		
		
		
		dia = 1;
		
		switch (dia) {
		case 1:
		case 3:
		case 5:
			System.out.println("Estoy estudiando");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("Estoy trabajando");
			break;
		default:
			System.out.println("es Domingo");
			break;
		}
		
		/*
		String msg = "hi";
		
		switch (msg) {
		case "hola":
			System.out.println("Es castellano");
			break;
		case "hi":
		case "hello":
			System.out.println("Es ingles");
			break;
		default:
			break;
		}
		*/

	}

}
