package org.jesus.poosobrecarga;

import static org.jesus.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {


        System.out.println("Sumar enteros: " + sumar(10,5));
        System.out.println("Sumar float: " + sumar(10.0f,5f));
        System.out.println("Sumar float-int: " + sumar(10f,5));
        System.out.println("Sumar int-float: " + sumar(10,5.0f));
        System.out.println("Sumar double: " + sumar(10d,5d));
        System.out.println("Sumar Strings: " + sumar("10","5"));
        System.out.println("Sumar tres enteros: " + sumar(10,5,3));
        System.out.println("Sumar tres enteros: " + sumar(10,5,3,6,7,8,9,109));
        System.out.println("Sumar n enteros y float: " + sumar(5f,10,43,2,1,3,54));

        System.out.println("Sumar long " + Calculadora.sumar(10l,5l));
        System.out.println("Sumar enteros: " + Calculadora.sumar(10,'0'));
        System.out.println("Sumar float-int " + Calculadora.sumar(10f,'@'));
    }
}
