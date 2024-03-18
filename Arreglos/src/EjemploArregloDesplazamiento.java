import java.util.Scanner;

public class EjemploArregloDesplazamiento {
    public static void main(String[] args) {

        int[] a = new int[7];
        int numero = 0, posicion = 0;

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < a.length-1; i++){
            System.out.println("Ingrese un numero: ");
            a[i] = in.nextInt();
        }

        System.out.println("\nIngrese un numero a insertar: ");
        numero = in.nextInt();

        while(posicion < 6 && numero > a[posicion]){
            posicion++;
        }

        for(int i = a.length - 2; i >= posicion; i--){
            a[i+1] = a[i];
        }

        a[posicion] = numero;
        System.out.println("el valor a sido ingresado...");
    }
}
