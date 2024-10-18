package pe.edu.tecsup._01.sintaxis;


/**
 * 
 *    Exp1       Exp2         AND     &&
 *     F          F            F
 *     F          V            F  
 *     V          F            F
 *     V          V            V
 * 
 *    Exp1       Exp2         OR       ||
 *     F          F            F
 *     F          V            V  
 *     V          F            V
 *     V          V            V
 * 
 */
public class G_5_OperadoresBooleanos {

	public static void main(String[] args) {
		/*
		boolean exp1 = true;
		boolean exp2 = false;
		
		// AND logico
		boolean res = exp1 && exp2 ;
		
		System.out.println(res);
		
		// AND logico
		res = exp1 || exp2 ;
		
		System.out.println(res);
		*/
		
		
		boolean esDomingo = true, esManhana = true;
		
		// AND logico
		boolean resultado = esDomingo && esManhana;
		System.out.println(resultado);
		
		// OR logico
		boolean usasTransportePublico = true, usasTransportePrivado = false;
		boolean resultado2 = usasTransportePublico || usasTransportePrivado;
		System.out.println(resultado2);

		
		boolean eresProgramador = true;
		System.out.println(!eresProgramador);


		int edadMarta = 19, edadJuan = 21;
		boolean condicion =  edadMarta >= 18 && edadJuan == 21;
		System.out.println(condicion); 
		
		boolean tieneWindows = true;
		boolean tieneJDKinstalado =  true;
		boolean tienesUnIDEInstalado = true;
		
		/*
		boolean esDomingo = false, esDia = true;
		
		boolean resultado = esDomingo && esDia;
		System.out.println(resultado);
		
		if(esDomingo || esDia) {
			System.out.println("Vamos al parque");
		} else {
			System.out.println("Seguir programando");
		}

		int dia = 6, horario = 1;
		
		if(dia == 7 && horario == 1) {
			System.out.println("Vamos al parque");
		}else {
			System.out.println("Seguir programando");
		}
		*/
	}

}
