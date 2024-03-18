package Seccion_4_Operadores;

public class PrecendeciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (double)(i + j + k)/ 3d;
        System.out.println("El promedio es: " + promedio);

        promedio = ++i + j-- + k / 3d * 10;
        System.out.println("El promedio es: " + promedio);
        System.out.println("j = " + j);
        System.out.println("i = " + i);
    }
}
