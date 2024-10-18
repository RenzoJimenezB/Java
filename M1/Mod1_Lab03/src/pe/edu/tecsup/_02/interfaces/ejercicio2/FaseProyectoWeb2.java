package pe.edu.tecsup._02.interfaces.ejercicio2;

public class FaseProyectoWeb2 implements FaseProyecto {

    @Override
    public void iniciar() {
        System.out.println("INICIANDO PROYECTO");
    }

    @Override
    public void analizar() {
        System.out.println("ANALIZANDO PROYECTO");
    }

    @Override
    public void disenhar() {
        System.out.println("DISENHANDO PROYECTO");
    }

    @Override
    public void construir() {
        System.out.println("CONSTRUYENDO PROYECTO");
    }

    @Override
    public void probar() {
        System.out.println("PROBANDO PROYECTO");
    }

    @Override
    public void implantar() {
        System.out.println("IMPLANTANDO PROYECTO");
    }

    @Override
    public String obtenerEstado() {
        return "ESTADO";
    }
}
