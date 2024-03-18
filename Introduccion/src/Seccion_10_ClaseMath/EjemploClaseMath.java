package Seccion_10_ClaseMath;

public class EjemploClaseMath {
    public static void main(String[] args) {
        
        int absoluto = Math.abs(-3); // Entrega el valor absoluto de un numero.
        System.out.println("absoluto = " + absoluto);
        
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        
        double max = Math.max(3.5,1.2); // Entrega el valor maximo
        System.out.println("max = " + max);

        double min = Math.min(3.5,1.2); // Entrega el valor minimo
        System.out.println("min = " + min);
        
        double techo = Math.ceil(3.5); //Redondea hacia arriba
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5); // Redondea hacia abajo
        System.out.println("piso = " + piso);

        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero); // Redondea pero en entero
        
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);
        
        double log = Math.log(10); //Logaritmos naturales
        System.out.println("log = " + log);

        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);
        
        double raizCuadrada = Math.sqrt(5);
        System.out.println("raizCuadrada = " + raizCuadrada);
        
        //TRIGONOMETRIA
        
        double grados = Math.toDegrees(1.57);
        System.out.println("Math.ceil(grados) = " + Math.ceil(grados));

        double radianes = Math.toRadians(90.00d);
        System.out.println("convertir de grados a radianes = " + radianes);

        System.out.println("Seno(90): " + Math.sin(radianes));
        System.out.println("Cos(90): " + Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("Cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("Cos(180): " + Math.cos(radianes));
    }
}
