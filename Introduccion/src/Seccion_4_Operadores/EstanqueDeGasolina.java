package Seccion_4_Operadores;

import java.util.Scanner;

public class EstanqueDeGasolina {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double estanque = 0.00;

        System.out.println("Ingrese la cantidad de litros del estanque: ");
        estanque = in.nextDouble();

        if(estanque==70){
            System.out.println("Estanque lleno");
        }else if(estanque>=60 && estanque<70){
            System.out.println("Estanque casi lleno");
        }else if(estanque>=40 && estanque<60){
            System.out.println("Estanque 3/4");
        }else if(estanque>=35 && estanque<40){
            System.out.println("Medio tanque");
        }else if(estanque>=20 && estanque<35){
            System.out.println("Suficiente");
        }else{
            System.out.println("Insuficiente");
        }
    }
}
