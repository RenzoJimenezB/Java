package pe.edu.tecsup.poo.constructor.ejercicio;

public class Aplicacion {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Roberto", "Garcia", 20);
        Estudiante estudiante2 = new Estudiante("Marisol", "Quispe", 23);

//        estudiante1.imprimirAtributos();
//        estudiante2.imprimirAtributos();


        System.out.println("Nombre_estudiante1: " + estudiante1.getNombre());
        System.out.println("Apellido_estudiante1: " + estudiante1.getApellidoPaterno());

        System.out.println("Nombre_estudiante: " + estudiante2.getNombre());
        System.out.println("Apellido_estudiante2: " + estudiante2.getApellidoPaterno());


//        System.out.println(estudiante1);
//        System.out.println(estudiante2);
    }
}
