package pe.edu.tecsup._09.object.ejercicio;

public class Aplicacion {
    public static void main(String[] args) {
        Persona person1 = new Persona("Renzo", "Jimenez", 25, 1);
        Persona person2 = new Persona("Renzo", "Jimenez", 25, 1);

        System.out.println(person1);
        System.out.println(person2);
        
        boolean areEqual = person1.equals(person2);
        System.out.println("Are they equal?: " + areEqual);
    }
}
