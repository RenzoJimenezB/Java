package pe.edu.tecsup._05.interfaces.implementaciones.parciales;

public class Aplicacion {
    public static void main(String[] args) {

        PersonaIncompleta persona = new Persona("Elizabeth", "Garcia");

        persona.cantar();
        persona.correr();
        persona.nadar();
    }
}
