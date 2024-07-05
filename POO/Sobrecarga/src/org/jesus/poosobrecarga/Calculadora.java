package org.jesus.poosobrecarga;

public class Calculadora {

    public static int sumar(int a,int b){
        return a + b;
    }
    public static int sumar(int... argumentos){
        int total = 0;
        for(int arg : argumentos){
            total += arg;
        }
        return total;
    }
    public static float sumar(float a,int... argumentos){
        float total = 0;
        for(int arg : argumentos){
            total += arg;
        }
        return a + total;
    }
    public static float sumar(float x,float y){
        return x + y;
    }
    public static float sumar(int i,float j){
        return i + j;
    }
    public static float sumar(float x,int y){
        return x + y;
    }
    public static double sumar(double x,double y){
        return x + y;
    }
    public static int sumar(String a,String b){
        int resultado = 0;
        try{
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        }catch(NumberFormatException e){
            resultado = 0;
        }
        return resultado;
    }
    public static int sumar(int a ,int b, int c) {
        return a + b + c;
    }

}
