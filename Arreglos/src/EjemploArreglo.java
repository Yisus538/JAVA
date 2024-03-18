import java.util.Arrays;

public class EjemploArreglo {
    public static void main(String[] args) {


        String[] producto = new String[7];

        producto[0] = "kingston Pendrive 64gb";
        producto[1] = "Samsung Galaxy";
        producto[2] = "Disco Duro SSD";
        producto[3] = "Asus Notebook";
        producto[4] = "Macbook Air";
        producto[5] = "Chromecast 4ta generacion";
        producto[6] = "Bicicleta Oxford";

        Arrays.sort(producto); //Ordena de forma alfabetica

        String prod1 = producto[0];
        String prod2 = producto[1];
        String prod3 = producto[2];
        String prod4 = producto[3];
        String prod5 = producto[4];
        String prod6 = producto[5];
        String prod7 = producto[6];

        System.out.println("producto[0] = " + prod1);
        System.out.println("producto[1] = " + prod2);
        System.out.println("producto[2] = " + prod3);
        System.out.println("producto[3] = " + prod4);
        System.out.println("producto[4] = " + prod5);
        System.out.println("producto[5] = " + prod6);
        System.out.println("producto[6] = " + prod7);

        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = 25;
        numeros[2] = 35;
        numeros[3] = -1;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
