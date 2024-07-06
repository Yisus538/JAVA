package org.jesus.ejemplo;

import org.jesus.pooherencia.*;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("========== Creando Instancia de la clase ALumno ===========");
        Alumno alumno = new Alumno("Jesus","Martinez",20,"Santo Tomas");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("jesus@jesus.com");

        System.out.println("========== Creando Instancia de la clase  Internacional ===========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter","Gosling","Australia");

        alumnoInt.setEdad(25);
        alumnoInt.setInstitucion("Institucion Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);


        System.out.println("========== Creando Instancia de la clase Profesor ===========");
        Profesor profesor = new Profesor("Luci","Lopez","Matematica");
        profesor.setEdad(37);

        print(alumno);
        print(profesor);
        print(alumnoInt);
        System.out.println("=====================");


    }


    public static void print(Persona persona){
        System.out.println(persona);
    }
}
