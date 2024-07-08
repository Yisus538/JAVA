package org.jesus.poointerfaces.repositorio;

import org.jesus.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements OrdenablePaginableCrudRepositorio{

    private final List<Cliente> dataSource;
    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }
    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listOrdenada = new ArrayList<>(this.dataSource);// Para evitar que modifique la lista original

        listOrdenada.sort((a, b) -> {
            int resultado = 0;

            if(dir == Direccion.ASC){
                resultado = OrdenableRepositorio.ordenar(campo,a,b);
            }else if(dir == Direccion.DESC){
               resultado = OrdenableRepositorio.ordenar(campo,b,a);
            }

            return resultado;
        });

        return listOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }
    @Override
    public List<Cliente> listar() {
        return dataSource;
    }
    @Override
    public Cliente porId(Integer id) {
        Cliente source = null;
        for (Cliente cliente : dataSource) {
            if (cliente.getId() != null && cliente.getId().equals(id)) {
                source = cliente;
                break;
            }
        }
        return source;
    }
    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }
    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());

    }
    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    public int count(){
        return this.dataSource.size();
    }
}
