package Ejercicios.Ejercicio01;


public class Aplicacion {
    public static void main(String[] args) {

        Auto auto1 = new Auto("blanco", "ABC-123", "BMW", 2018);
        Auto auto2 = new Auto("blanco", "ABC-456", "Volkswagen", 2018);
        Auto auto3 = new Auto("blanco", "ABC-789", "Audi", 2018);

//        System.out.println("Auto1: ");
//        auto1.imprimirValores();
//
//        System.out.println("Auto2: ");
//        auto2.imprimirValores();
//
//        System.out.println("Auto3: ");
//        auto3.imprimirValores();
//
//        String info = auto3.obtenerInfo();
//        System.out.println("Auto1: " + info);

        System.out.println("Auto1: " + auto1);
        String result = auto1.obtenerInfoEvaluada(2015);
        System.out.println(result);

        System.out.println("Auto2: " + auto2);
        result = auto2.obtenerInfoEvaluada(2020);
        System.out.println(result);

        System.out.println("Auto3: " + auto3);
        result = auto3.obtenerInfoEvaluada(1000);
        System.out.println(result);
    }
}

