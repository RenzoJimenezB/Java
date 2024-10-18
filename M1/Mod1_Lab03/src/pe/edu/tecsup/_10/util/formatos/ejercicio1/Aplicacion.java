package pe.edu.tecsup._10.util.formatos.ejercicio1;

public class Aplicacion {
    public static void main(String[] args) {
        FechaUtil fechaUtil = new FechaUtil();
        String currentDate = fechaUtil.obtenerFechaActual();
        System.out.println("Current date: " + currentDate);
    }
}
