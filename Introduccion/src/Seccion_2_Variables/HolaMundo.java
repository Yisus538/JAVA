package Seccion_2_Variables;

public class HolaMundo {
    public static void main(String[] args) {

        String saludo = "Hola Mundo desde Java.";
        System.out.println(saludo);
        System.out.println("saludo.toUpperCase() = " + saludo.toUpperCase());

        int numero = 10;
        System.out.println("numero = " + numero);

        boolean valor = true;
        int numero2 = 5;

        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15";

        String nombre = "Jesus";

        boolean valor2 = numero>10;
        if(numero>10){
            nombre = "Manuel";
        }
        System.out.println("nombre = " + nombre);

        int edadPersona = 5;
    }
}