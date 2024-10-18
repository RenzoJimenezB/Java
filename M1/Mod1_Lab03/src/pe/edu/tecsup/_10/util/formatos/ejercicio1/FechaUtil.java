package pe.edu.tecsup._10.util.formatos.ejercicio1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FechaUtil {
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public String obtenerFechaActual() {
        Calendar calendar = Calendar.getInstance();
        return sdf.format(calendar.getTime());
    }
}
