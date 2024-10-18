package pe.edu.tecsup._10.util.formatos.ejercicio;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentDate {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        // 15/10/2023 09:00
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println(sdf.format(cal.getTime()));

        // 09:00
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
        System.out.println(sdf2.format(cal.getTime()));

        // 15-10-2023 09:00:01
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf3.format(cal.getTime()));

        // Octubre
        SimpleDateFormat sdf4 = new SimpleDateFormat("MMMM");
        System.out.println(sdf4.format(cal.getTime()));
    }
}
