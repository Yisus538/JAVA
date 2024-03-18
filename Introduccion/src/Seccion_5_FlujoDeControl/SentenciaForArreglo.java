package Seccion_5_FlujoDeControl;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombre = {"Jesus","Maria","Rocio","Paco","Bea","Pepa"};
        int count = nombre.length;

        for (int i = 0; i < count; i++){
            if(nombre[i].equalsIgnoreCase("jesus") ||
                    nombre[i].equalsIgnoreCase("rocio")) {
                continue;
            }
            System.out.println(i + ".-" + nombre[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre: ");
        boolean encontrado = false;

        for (int i = 0; i < count; i++){
            if(nombre[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombre = " + nombre[i]);
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null,"Fue encontrado!");
        }else {
            JOptionPane.showMessageDialog(null,"No existe en el sistema!");
        }
    }
}
