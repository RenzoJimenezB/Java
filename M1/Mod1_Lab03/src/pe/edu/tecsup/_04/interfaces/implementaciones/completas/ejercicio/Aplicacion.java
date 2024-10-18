package pe.edu.tecsup._04.interfaces.implementaciones.completas.ejercicio;

public class Aplicacion {
    public static void main(String[] args) {
        Habilidad habilidad;
        HabilidadTecnica habilidadTecnica;
        HabilidadGestion habilidadGestion;

        Persona persona1 = new Persona("Renzo", "Jimenez");
        Persona persona2 = new Persona("Adrian", "Bernales");

        habilidad = persona1;
        habilidad.cantar();

        habilidad = persona2;
        habilidad.cantar();

        habilidadTecnica = persona1;
        habilidadTecnica.programar();

        habilidadTecnica = persona2;
        habilidadTecnica.programar();

        habilidadGestion = persona1;
        habilidadGestion.gestionalConflictosHumanos();

        habilidadGestion = persona2;
        habilidadGestion.gestionalConflictosHumanos();
    }
}
