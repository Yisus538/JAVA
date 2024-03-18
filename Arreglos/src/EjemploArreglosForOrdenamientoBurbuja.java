public class EjemploArreglosForOrdenamientoBurbuja {

    public static void arregloInverso(String[]producto){
        int total = producto.length;
        int total2 = producto.length;

        for(int i = 0; i < total2; i++){
            String actual = producto[i];
            String inverso = producto[total-1-i];

            producto[i] = inverso;
            producto[total-1-i] = actual;
            total2--;

        }
    }
    public static void main(String[] args) {

        String[] producto = {"kingston Pendrive 64gb","Samsung Galaxy",
                             "Disco Duro SSD Samsung Externo","Asus Notebook","Macbook Air",
                             "Chromecast 4ta generacion","Bicicleta Oxford"};

        int total = producto.length;
        int contador = 0;

        //arregloInverso(producto);

        for(int i = 0; i < total; i++){ // Metodo Burbuja
            for(int j = 0; j < total; j++){
                if(producto[i].compareTo(producto[j])<0){
                    String aux = producto[i];
                    producto[i] = producto[j];
                    producto[j] = aux;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

        System.out.println("====For====");
        for(int i = 0; i < total; i++){
            System.out.println("Para el indice " + i + " : " + producto[i]);
        }

    }
}
