package Seccion_4_Operadores;

import java.util.Scanner;

public class OperadoresTernarios {
    public static void main(String[] args) {

        //variable = condicion ? valor1 : valor2;
        String variable = (7 == 7)? "Si es verdadero" : "si es false";


        System.out.println("variable = " + variable);
        
        String estado = "";
        double promedio = 0.0;
        double matematicas = 0.0,ciencias = 0.0,historia = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese nota de matematicas: ");
        matematicas = s.nextDouble();
        System.out.println("Ingrese nota de ciencias: ");
        ciencias = s.nextDouble();
        System.out.println("Ingrese nota de historia: ");
        historia = s.nextDouble();

        promedio = (matematicas+ciencias+historia)/3;

        estado = promedio >= 5.49? "Aprobado" : "Reprobado";

        System.out.println("El alumno esta: " + estado);


    }
}
