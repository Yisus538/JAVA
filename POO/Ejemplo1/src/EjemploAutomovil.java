import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        AutoMovil subaru = new AutoMovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        AutoMovil mazda = new AutoMovil("Mazda", "BT-50", Color.ROJO, motorMazda);
        mazda.setEstanque(new Estanque(45));
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        AutoMovil nissan = new AutoMovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));

        AutoMovil nissan2 = new AutoMovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));

        AutoMovil auto = new AutoMovil();
        Date fecha = new Date();
        System.out.println("son iguales? " + (nissan == nissan2));
        System.out.println("son iguales con equals? " + (nissan.equals(nissan2)));
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(auto.equals(fecha));
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilómetros por litro: " + subaru.calcularConsumo(300, 0.6f));

        System.out.println("Kilómetros por litro: " + subaru.calcularConsumo(300, 60));
        System.out.println("Kilómetros por litro: " + nissan.calcularConsumo(300, 60));
    }
}
