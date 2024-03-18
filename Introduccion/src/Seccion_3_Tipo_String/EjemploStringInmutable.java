package Seccion_3_Tipo_String;

public class EjemploStringInmutable {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor = "Andres Guzman";

        String resultado = curso.concat(" ".concat(profesor));
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = "...";

        System.out.println(curso);
        System.out.println("resultado2 = " + resultado2);
        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado = " + resultado3);


    }

}
