package pe.edu.tecsup._06.interfaces.herencias.ejercicio8;

public class Aplicacion {
    public static void main(String[] args) {
        Profesional profesional = new Profesional("Isabel", "Mendoza", 32, "Ingenieria Electronica", 6);
        profesional.hablarIngles();
        profesional.programarJava();
        System.out.println(profesional);
    }
}
