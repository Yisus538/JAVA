public class EjemploAutomovilStatico {
    public static void main(String[] args) {

        AutoMovil subaru = new AutoMovil("Subaru","Impresa","Blanco",4.0,55);


        AutoMovil mazda = new AutoMovil("Mazda","BT-50","Rojo",3.0,55);
        System.out.println("mazda.fabricante " + mazda.getFabricante());


        AutoMovil nissan = new AutoMovil("Nissan","Navara","Gris Oscuro",3.5,50);
        AutoMovil nissan2 = new AutoMovil("Nissan","Navara","Gris oscuro",3.5,50);

        AutoMovil.setColorPatente("Verde");
        AutoMovil auto = new AutoMovil();

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());


    }
}
