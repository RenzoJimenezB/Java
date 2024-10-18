package pe.edu.tecsup._01.sintaxis;

import java.math.BigDecimal;

public class A_Variables3 {

	public static void main(String[] args) {
		
		// -------------------------------
		// Caso 1 :
		// -------------------------------
		
		// Suma de decimales
		
		double x = 0.0000000004; 
		double y = 0.0000000003; 
		double sum = x + y;
		
		System.out.println(String.format("%.40f", sum));
	
		// Solucion
		
		BigDecimal x1 = BigDecimal.valueOf(x);
		BigDecimal y1 = BigDecimal.valueOf(y);
		BigDecimal sum1 = x1.add(y1);
		
		System.out.println(String.format("%.40f", sum1));
		
		
		/*
		
		
		// -------------------------------
		// Caso 2 :
		// -------------------------------

		// Multiplicacion decimal por double
		
		int a = 100000;
		double b = 2.55;  // float b = 2.55F
		
        System.out.println(a*b);
        
		// Solucion
		
		BigDecimal a1 = BigDecimal.valueOf(a);  // a1.setScale(2,BigDecimal.ROUND_DOWN);
		BigDecimal b1 = BigDecimal.valueOf(b);
		BigDecimal mult = a1.multiply(b1);
        
        System.out.println(mult);
        
        */
	}
	
}
