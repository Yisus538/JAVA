import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversorMutable {

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
                             "Disco Duro SSD","Asus Notebook","Macbook Air",
                             "Chromecast 4ta generacion","Bicicleta Oxford"};

        int total = producto.length;

        Arrays.sort(producto);
        Collections.reverse(Arrays.asList(producto)); // Ordenar de forma inversa usando listas.
        arregloInverso(producto);

        System.out.println("====For====");
        for(int i = 0; i < total; i++){
            System.out.println("Para el indice " + i + " : " + producto[i]);
        }

    }
}
