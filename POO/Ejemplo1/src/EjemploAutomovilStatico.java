public class EjemploAutomovilStatico {
    public static void main(String[] args) {

        AutoMovil subaru = new AutoMovil("Subaru","Impresa",Color.BLANCO,4.0,55);
        AutoMovil.setCapacidadTanqueEstatico(45);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        AutoMovil mazda = new AutoMovil("Mazda","BT-50",Color.ROJO,3.0,55);
        System.out.println("mazda.fabricante " + mazda.getFabricante());
        mazda.setTipo(TipoAutomovil.PICKUP);

        AutoMovil nissan = new AutoMovil("Nissan","Navara",Color.GRIS,3.5,50);
        AutoMovil nissan2 = new AutoMovil("Nissan","Navara",Color.GRIS,3.5,50);
        nissan2.setTipo(TipoAutomovil.CONVERTIBLE);

        AutoMovil.setColorPatente(Color.ROJO);

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());

        System.out.println("AutoMovil.getColorPatente().getColor() = " + AutoMovil.getColorPatente());
        System.out.println("Kilometro por litros = " + AutoMovil.calcularConsumoEstatico(300,60));
        System.out.println("Velocidad maxima en carretera: " + AutoMovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad maxima en ciudad: " + AutoMovil.VELOCIDAD_MAXIMA_CIUDAD);

    }
}
