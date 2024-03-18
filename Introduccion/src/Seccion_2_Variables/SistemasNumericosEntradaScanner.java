package Seccion_2_Variables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
       // String numeroStr = in.nextLine();
        int numeroDecimal = 0;

        try{
            numeroDecimal = in.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " es  = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);


        String resultadoOctal = "numero octal de  " + numeroDecimal + " es = " + Integer.toOctalString(numeroDecimal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " es = " + Integer.toHexString(numeroDecimal);


        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        System.out.println(mensaje);
    }
}
