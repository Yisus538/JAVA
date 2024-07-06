package org.jesus.ejemplo;

import org.jesus.pooherencia.*;

public class EjemploHerenciaConstructores {
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
        System.out.println("nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad:  " + persona.getEdad()
                + ", email: " + persona.getEmail());
        if(persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno: ");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println(" Nota matematica: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota castellano: " + ((Alumno) persona).getNotaCastellano());
            System.out.println("Imprimiendo los datois del tipo AlumnoInternacional");
            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional: ");
                System.out.println("Nota idiona: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
                System.out.println("========== Promedio Extranjero ===========");
                System.out.println("Promedio: " + ((AlumnoInternacional) persona).calcularPromedio());
                System.out.println("=====================");
            }
            System.out.println("========== Promedio Alumno ===========");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("=====================");
        }
        if(persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del profesor: ");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("========== sobre escritura saludar ===========");

        System.out.println(persona.saludar());

        System.out.println("=====================");

    }
}
