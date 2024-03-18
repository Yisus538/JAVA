package Seccion_4_Operadores;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        
        int max = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = in.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = in.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = in.nextInt();
        
        max = (num1>num2)? num1:num2;
        max = (max>num3)? max:num3;

        System.out.println("El mayor numero es: " + max);
    }
}
