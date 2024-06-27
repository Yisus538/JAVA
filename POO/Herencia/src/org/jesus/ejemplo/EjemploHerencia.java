package org.jesus.ejemplo;

import org.jesus.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("========== Creando Instancia de la clase ALumno ===========");
        Alumno alumno = new Alumno();
        alumno.setNombre("Jesus");
        alumno.setApellido("Martinez");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);


        System.out.println("========== Creando Instancia de la clase  Internacional ===========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();

        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(25);
        alumnoInt.setInstitucion("Institucion Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);


        System.out.println("========== Creando Instancia de la clase Profesor ===========");
        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Lopez");
        profesor.setAsignatura("Matematica");


        System.out.println("=====================");
        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println(alumnoInt.getNombre()
                + " " + alumnoInt.getApellido()
                + " " + alumnoInt.getPais()
                + " " + alumnoInt.getInstitucion()
                + " " + alumnoInt.getNotaIdiomas());
        System.out.println("Profesor " + profesor.getAsignatura() + ": "
                + profesor.getNombre()
                + " " + profesor.getApellido());

        // Bucle creado para comprobar las herencias Padre hijo

        Class claseAlumnoInt = alumnoInt.getClass();

        while(claseAlumnoInt.getSuperclass() != null){
            String hija = claseAlumnoInt.getName();
            String padre = claseAlumnoInt.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            claseAlumnoInt = claseAlumnoInt.getSuperclass();
        }

    }
}
