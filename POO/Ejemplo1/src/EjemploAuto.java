public class EjemploAuto {
    public static void main(String[] args) {

        AutoMovil auto = new AutoMovil();
        AutoMovil mazda = new AutoMovil();
        AutoMovil auto1 = new AutoMovil("Citroen","c4","verde",4.0,55);

        System.out.println(auto.getFabricante());

        System.out.println(auto.detalle() + mazda.detalle());

        System.out.println(auto.acelerar(3000));
        System.out.println(auto.frenar());
        System.out.println(auto.acelerarFrenar(4000));

        System.out.println("Kilometros por litro " + mazda.calcularConsumo(300,0.6f));
        System.out.println("Kilometros por litro " + mazda.calcularConsumo(300,60));
        System.out.println(auto1.detalle());
    }
}
