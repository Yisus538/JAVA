import java.util.Arrays;

public class EjemploArreglosForInversor {
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
        System.out.println("====For====");
        for(int i = 0; i < total; i++){
            System.out.println("Para el indice " + i + " : " + producto[i]);
        }

        System.out.println("====For inverso====");
        for(int i = 0; i <total; i++){
            System.out.println("i  = " + (total-1-i) + " valor: " + producto[total-1-i]);
        }

        System.out.println("====Usando For inverso 2====");
        for(int i = total-1; i >= 0; i--){
            System.out.println("i  = " + i + " valor: " + producto[i]);
        }


      
    }
}
