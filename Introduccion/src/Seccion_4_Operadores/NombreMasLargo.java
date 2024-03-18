package Seccion_4_Operadores;

import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("1. Ingrese su nombre completo: ");
        String nombre1 = JOptionPane.showInputDialog("2. Ingrese su nombre completo: ");
        String nombre2 = JOptionPane.showInputDialog("3. Ingrese su nombre completo: ");


        String[] nombreApellido = nombre.split(" ");
        String[] nombreApellido1 = nombre1.split(" ");
        String[] nombreApellido2 = nombre2.split(" ");

        if(nombreApellido.length > nombreApellido1.length && nombreApellido.length > nombreApellido2.length){
            JOptionPane.showMessageDialog(null,"El nombre mas largo es: " + nombre);
        }else if(nombreApellido1.length > nombreApellido.length && nombreApellido1.length > nombreApellido2.length){
            JOptionPane.showMessageDialog(null,"El nombre mas largo es: " + nombre1);
        }else{
            JOptionPane.showMessageDialog(null,"El nombre mas largo es: " + nombre2);
        }


    }
}
