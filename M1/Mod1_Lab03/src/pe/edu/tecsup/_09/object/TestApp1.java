package pe.edu.tecsup._09.object;

public class TestApp1 {

    public static void main(String[] args) {

        Persona persona1 = new Persona(100, "Miguel");
        System.out.println(persona1);

        Persona persona2 = new Persona(100, "Miguel");
        System.out.println(persona2);

        boolean res1 = persona1.equals(persona2);
        System.out.println("Es igual? " + res1);
    }

}
