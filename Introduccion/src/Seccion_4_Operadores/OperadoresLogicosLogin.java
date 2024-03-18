package Seccion_4_Operadores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "Jesus";
        String password = "12345";
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el username: ");
        String u = in.next();

        System.out.println("Ingrese la password: ");
        String p = in.next();

        boolean esAuntenticado = false;

        if(username.equals(u) && password.equals(p)){
            esAuntenticado = true;
        }else{
            System.out.println("Username o password incorrecta!");
        }

        if(esAuntenticado){
            System.out.println("Bienvenido usuario ".concat(username).concat("!"));
        }else{
            System.out.println("Acceso denegado");
        }


    }
}
