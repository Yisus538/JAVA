package Seccion_3_Tipo_String;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Jesus";

        System.out.println("nombre.length() = " + nombre.length()); //Nos muestra el alcance de un String
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); //Nos muestra el String en Mayuscula
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); //Nos muestra el String en Minuscula

        System.out.println("nombre.equals() = " + nombre.equals("Jesus")); // Compara un String con otro teniendo en cuenta el valor
        System.out.println("nombre.equalsIgnoreCase() = " + nombre.equalsIgnoreCase("JeSus")); //Compara los valores sin tener en cuenta la mayuscula y minuscula
        System.out.println("nombre.compareTo() = " + nombre.compareTo("Jesus")); //Compara teniendo en cuenta la tabla uniCode

        System.out.println("nombre.charAt(3) = " + nombre.charAt(3)); //Convierte el String en un arreglo de char y devuelve la posicion mandada
        System.out.println("nombre.substring(1) = " + nombre.substring(1));//Toma de 0 a la posicion que le pidas

        String trabaLengua = "trabalenguas";
        System.out.println("trabaLengua.replace(\"a\",\"A\") = " + trabaLengua.replace("a",".")); //Reemplaza la letra que le pidas por la que vos le des
        System.out.println("trabaLengua.indexOf() = " + trabaLengua.indexOf('a')); //Nos permite encontrar la primera incidencia y nos devuelve la posicion
        System.out.println("trabaLengua.lastIndexOf() = " + trabaLengua.lastIndexOf('a'));// Nos permite enconmtrar la ultima incidencia
        System.out.println("trabaLengua.contains(\"t\") = " + trabaLengua.contains("t")); //Nos permite encontrar palabras y me retorna true o false.
        System.out.println("trabaLengua.startsWith(\"lenguas\") = " + trabaLengua.startsWith("lenguas")); //Nos devuelve true o false si empieza con el argumento puesto
        System.out.println("trabaLengua.endsWith(\"lenguas\") = " + trabaLengua.endsWith("lenguas")); //Nos devuelve true o false si termina con el argumento
        System.out.println(" trabaLengua ");
        System.out.println(" trabaLengua ".trim()); // Quita espacios en blanco.

    }
}
