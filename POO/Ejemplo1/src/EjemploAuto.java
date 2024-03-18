public class EjemploAuto {
    public static void main(String[] args) {

        AutoMovil auto = new AutoMovil();

        auto.fabricante = "Subaru";
        auto.modelo = "Impresa";
        auto.cilindrada = 2.0;
        auto.color = "Blanco";


        AutoMovil mazda = new AutoMovil();

        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "Rojo";

        System.out.println(auto.detalle() + mazda.detalle());
    }
}
