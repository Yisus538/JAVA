public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        AutoMovil subaru = new AutoMovil("Subaru","Impresa",Color.BLANCO,4.0,55);
        AutoMovil.setCapacidadTanqueEstatico(45);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        AutoMovil mazda = new AutoMovil("Mazda","BT-50",Color.ROJO,3.0,55);
        System.out.println("mazda.fabricante " + mazda.getFabricante());
        mazda.setTipo(TipoAutomovil.PICKUP);

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipoSubaru.getNombre() = " + tipo.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch(tipo){

            case CONVERTIBLE ->
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE ->
                System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
            case FURGON ->
                System.out.println("Es un automovil utilitario de trasnporte, de empresas");
            case HATCHBACK ->
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP ->
                System.out.println("Es una automovil de doble cabina o camioneta");
            case SEDAN ->
                System.out.println("Es un automovil mediano");
            case STATION_WAGON ->
                System.out.println("Es un automovil mas grande, con maleta grande");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for(TipoAutomovil ta : tipos){
            System.out.println(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuertas());
            System.out.println();
        }

    }
}
