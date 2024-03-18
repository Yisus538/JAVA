package Seccion_4_Operadores;

import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5,j = 4,suma = i + j;

        System.out.println("suma = " + suma);

        System.out.println("i = " + (i+j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));
        
        int multi = i * j;
        System.out.println("multi = " + multi);
        
        float div = (float)i / j;
        System.out.println("(float)div = " + div);
        
        int resto = i % j;
        System.out.println("resto = " + resto);
        
        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if(numero%2==0){
            JOptionPane.showMessageDialog(null,"Es par");
        }else{
            JOptionPane.showMessageDialog(null,"Es impar");
        }
    }
}
