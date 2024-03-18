package Seccion_4_Operadores;

import java.util.Scanner;

public class OrdenNumeros {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = 0 , num2 = 0;
        boolean mayor = false;

        System.out.println("Ingrese el primer numero: ");
        num1 = in.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = in.nextInt();

        mayor = (num1>num2)? true:false;

        if(mayor){
            System.out.println(num1 + " " + num2);
        }else{
            System.out.println(num2 + " " + num1);
        }

    }
}
