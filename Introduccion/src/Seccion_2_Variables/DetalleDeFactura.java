package Seccion_2_Variables;

import java.util.Scanner;
public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double precio1, precio2,calculoTotal;


        System.out.println("Escribe el nombre de la factura: ");
        String nombre = in.nextLine();

        System.out.println("Escribe el primer precio: ");
        precio1 = in.nextDouble();

        System.out.println("Escribe el segundo precio: ");
        precio2 = in.nextDouble();

        calculoTotal = (precio1+precio2)+((precio1+precio2)*0.19);
        System.out.println("El calculo total de la factura de "+ nombre  + "es de  " + calculoTotal);
    }
}
