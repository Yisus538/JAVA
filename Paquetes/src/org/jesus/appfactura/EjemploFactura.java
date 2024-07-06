package org.jesus.appfactura;

import org.jesus.appfactura.modelo.*;
import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Jesus","555-5");

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura: ");
        Factura factura = new Factura(cliente,in.nextLine());
        Producto producto;

        System.out.println("\n");

        for(int i = 0; i < 2; i++){
            producto = new Producto();

            System.out.print("Ingrese el producto N" + producto.getCodigo() + ": ");
            producto.setNombre(in.nextLine());

            System.out.print("Ingrese el precio del producto: ");
            producto.setPrecio(in.nextFloat());

            System.out.print("Ingrese la cantidad de productos: ");
            factura.addItemFactura(new ItemFactura(producto,in.nextInt()));
            System.out.println();

        }
        System.out.println(factura.verDetalle());
    }
}
