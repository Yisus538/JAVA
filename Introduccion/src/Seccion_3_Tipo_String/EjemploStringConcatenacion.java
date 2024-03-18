package Seccion_3_Tipo_String;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        
        String curso = "Programacion Java";
        String profesor = "Andres Guzman";
        
        String detalle = curso + " con el intructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB);

        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(" ".concat(profesor));
        System.out.println(detalle2);
    }
}
