package org.jesus.generics;

import org.jesus.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> cliente = new ArrayList<>();
        cliente.add(new Cliente("Jesus","Martinez"));

        Cliente jesus = cliente.getFirst();
        Cliente[] clientesArreglo = {new Cliente("Belen","Martinez")
                ,new Cliente("Gaston","Martinez")
                ,new Cliente("Natalia","Garcia")};
        Integer[] enteros = {1,2,3};

        List<Cliente> clienteLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enteros);

        clienteLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);


        List<String> nombre = fromArrayToList(new String[]{"Andres","bea","John"},enteros);
        nombre.forEach(System.out::println);

    }

    public static <T> List<T> fromArrayToList(T[] arr){
        return Arrays.asList(arr); // Recibe un arreglo y lo convierte en una lista
    }
    public static <T,G> List<T> fromArrayToList(T[] arr,G[] arr2){
        for(G elemento : arr2){
            System.out.println(elemento);
        }
        return Arrays.asList(arr); // Recibe un arreglo y lo convierte en una lista
    }


}
