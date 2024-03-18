package Seccion_8_DateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtillDateParse {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

        System.out.println("Ingrese un fecha con formato yyyy/MM/dd");
        try {
            Date fecha = format.parse(in.next());
            System.out.println("fecha = " + fecha);
            System.out.printf("fecha.f = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues que fecha2 ");
            }else if(fecha.before(fecha2)){
                System.out.println("Fecha es anterior que fecha2");
            }else if(fecha.equals(fecha2)){
                System.out.println("Las fechas son iguales");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);

        }

    }
}
