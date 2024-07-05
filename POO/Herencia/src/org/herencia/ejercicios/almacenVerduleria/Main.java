package org.herencia.ejercicios.almacenVerduleria;

public class Main {
    public static void main(String[] args) {

        Producto[] productos = new Producto[8];

        productos[0] = new Fruta("Manzana",10.4,"Rojo",0.5);
        productos[1] = new Fruta("Banana",14.1,"Amarillo",2.5);
        productos[2] = new Lacteo("Serenicima",5.4,10,14);
        productos[3] = new Lacteo("Windy",5.8,20,40);
        productos[4] = new Limpieza("",12.3,"",32.2);
        productos[5] = new Limpieza("",12.0,"",22.2);
        productos[6] = new NoPerecible("",4.2,10,200);
        productos[7] = new NoPerecible("",6.5,20,300);

        for(Producto producto: productos){
            System.out.println(producto);
        }


    }
}
