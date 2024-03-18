import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] producto = new String[7];
        int total = producto.length;

        producto[0] = "kingston Pendrive 64gb";
        producto[1] = "Samsung Galaxy";
        producto[2] = "Disco Duro SSD";
        producto[3] = "Asus Notebook";
        producto[4] = "Macbook Air";
        producto[5] = "Chromecast 4ta generacion";
        producto[6] = "Bicicleta Oxford";


        Arrays.sort(producto); //Ordena de forma alfabetica
        for(int i = 0; i < total; i++){
            System.out.println("Para el indice " + i + " : " + producto[i]);
        }

        System.out.println("\n\n=== Usando foreach ===\n\n");
        for(String prod : producto){
            System.out.println("Prod " + prod);
        }

        int i = 0;
        System.out.println("\n\n=== Usando WHILE ===\n\n");
        while(i < total){
            System.out.println("Para el indice " + i + " : " + producto[i]);
            i++;
        }

        int j = 0;
        System.out.println("\n\n=== Usando DOWHILE ===\n\n");
        do{
            System.out.println("Para el indice " + j + " : " + producto[j]);
            j++;
        }while(j < total);

        int[] numeros = new int[10];
        int totalNumero = numeros.length;

        for(int k = 0; k <totalNumero; k++){
            numeros[k] = k * 3;
        }

        for (int numero : numeros) {
            System.out.println("Numeros: " + numero);
        }

    }
}
