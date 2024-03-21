import java.util.Date;

public class EjemploAuto {
    public static void main(String[] args) {

        AutoMovil subaru = new AutoMovil();
        AutoMovil mazda = new AutoMovil();
        Date fecha = new Date();

        System.out.println(subaru.equals(fecha));

        System.out.println(subaru.getFabricante());
        System.out.println(subaru.detalle() + mazda.detalle());

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(subaru.acelerarFrenar(4000));

        System.out.println("Kilometros por litro " + mazda.calcularConsumo(300,0.6f));
        System.out.println("Kilometros por litro " + mazda.calcularConsumo(300,60));
        System.out.println(subaru.detalle());

        AutoMovil nissan = new AutoMovil("Nissan","Navara",Color.GRIS,3.5,50);
        AutoMovil nissan2 = new AutoMovil("Nissan","Navara",Color.GRIS,3.5,50);

        System.out.println("Son iguales? " + (nissan == nissan2));
        System.out.println("Son iguales con equals? " + nissan.equals(nissan2));

        System.out.println(nissan.toString());
    }
}
