package Seccion_8_DateCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

       // calendario.set(2020,Calendar.AUGUST,13,19,57,02);
        calendario.set(Calendar.YEAR,2020);
        calendario.set(Calendar.MONTH,Calendar.AUGUST);
        calendario.set(Calendar.DAY_OF_MONTH,13);
        calendario.set(Calendar.HOUR_OF_DAY,21);
        calendario.set(Calendar.MINUTE,14);
        calendario.set(Calendar.SECOND,10);
        Date fecha = calendario.getTime();
        System.out.println("calendario sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd  hh.mm.ss");
        String fecha1 = formato.format(fecha);
        System.out.println("fecha1 = " + fecha1);

    }
}
