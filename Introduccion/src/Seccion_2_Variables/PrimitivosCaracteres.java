package Seccion_2_Variables;

public class PrimitivosCaracteres {
    public static void main(String[] args) {

        char caracter = '\u0040';
        char decimal = 64;

        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo==caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("Char corresponde en byte a:" + System.lineSeparator() + Character.BYTES);
        System.out.println("Char corresponde en biyes a = " + Character.SIZE);
        System.out.println("Valor minimo que tiene un char = " + Character.MIN_VALUE);
        System.out.println("Valor maximo que tiene un char = " + Character.MAX_VALUE);
    }
}
