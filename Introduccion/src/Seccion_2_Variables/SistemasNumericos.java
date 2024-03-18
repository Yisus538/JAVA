package Seccion_2_Variables;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero: "); //Siempre se guarda en variables enteras.
        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);//El metodo parseInt() se usa para convertir un string en entero.
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " es  = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b11110; // Java entiende que al poner 0b se refieren a numeros binarios.
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de  " + numeroBinario + " es = " + Integer.toOctalString(numeroBinario);
        System.out.println(resultadoOctal);

        int numeroOctal = 036; // Java entiende que al poner 0 se refieren a numeros octal.
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero hexadecimal de " + numeroOctal + " es = " + Integer.toHexString(numeroOctal);
        int numeroHex = 0x1e; // Java entiende que al poner 0x se refieren a numeros hexadecimal.

        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null,mensaje);
    }
}
