package pe.edu.tecsup._02.interfaces.ejercicio2;

public class FaseProyectoWeb implements FaseProyecto {

    @Override
    public void iniciar() {
        System.out.println("Iniciando Proyecto Web");
    }

    @Override
    public void analizar() {
        System.out.println("Analizando Proyecto Web");
    }

    @Override
    public void disenhar() {
        System.out.println("Disehando el Proyecto Web");
    }

    @Override
    public void construir() {
    }

    @Override
    public void probar() {
    }

    @Override
    public void implantar() {
    }

    @Override
    public String obtenerEstado() {
        return "Pruebas";
    }
}