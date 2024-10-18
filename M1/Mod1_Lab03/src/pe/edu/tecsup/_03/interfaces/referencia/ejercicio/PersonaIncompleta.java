package pe.edu.tecsup._03.interfaces.referencia.ejercicio;

public abstract class PersonaIncompleta implements HabilidadCantar, HabilidadesDeportivas {
    protected String nombre;
    protected String apellido;

    @Override
    public void habilidadCantar() {
        System.out.println("Habilidad de cantar");
    }
}
