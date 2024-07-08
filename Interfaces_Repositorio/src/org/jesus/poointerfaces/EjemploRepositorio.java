package org.jesus.poointerfaces;

import org.jesus.poointerfaces.modelo.Cliente;
import org.jesus.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano","Peres"));
        repo.crear(new Cliente("Bea","Martinez"));
        repo.crear(new Cliente("Andrez","Martinez"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("===== Paginable =====");

        List<Cliente> paginable = repo.listar(0,2);
        paginable.forEach(System.out::println);

        System.out.println("===== Ordenable =====");
        List<Cliente> clientesOrdenAsc = repo.listar("nombre",Direccion.ASC);
        clientesOrdenAsc.forEach(System.out::println);


        System.out.println("===== editar =====");
        Cliente beaActualizar = new Cliente("Manuel","Martinez");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);
        System.out.println("===== total =====");
        System.out.println("Total registro: " + repo.count());

    }
}
