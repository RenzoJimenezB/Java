package pe.edu.tecsup._10.util.formatos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateFormatTes {

    final static String FORMAT_DATE = "dd/MM/YYYY";

    public static void main(String[] args) {

//        Calendar calendar = new GregorianCalendar();
        Calendar calendar = GregorianCalendar.getInstance();


//        System.out.println(calendar);


        // Documentacion oficial de la clase SimpleDateFormat
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html

//        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd/MM/YYYY hh:mm:ss");

        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_DATE);
        System.out.println(sdf.format(calendar.getTime()));

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(calendar.getTime()));

    }

}
