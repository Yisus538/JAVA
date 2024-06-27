package org.jesus.ejemplo;

import org.jesus.pooherencia.Alumno;
import org.jesus.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.setNombre("Jesus");
        alumno.setApellido("Martinez");



        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Lopez");
        profesor.setAsignatura("Matematica");


        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor " + profesor.getAsignatura() + ": "
                + profesor.getNombre()
                + " " + profesor.getApellido());

    }
}
