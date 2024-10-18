package pe.edu.tecsup._01.paquetes.modelo.ejercicio;

import pe.edu.tecsup._01.paquetes.modelo.ejercicio.controlador.ProcesoControlador;
import pe.edu.tecsup._01.paquetes.modelo.ejercicio.modelo.Proceso;

public class Aplicacion {
    public static void main(String[] args) {
//        ProcesoControlador procesoControlador = new ProcesoControlador();
//        System.out.println(procesoControlador.verificarEstado());
        System.out.println(ProcesoControlador.verificarEstado());

        Proceso proceso = new Proceso();
        proceso.setNombre("Proceso1");
        proceso.setCodigo("P-001");
        System.out.println(proceso);
    }
}
