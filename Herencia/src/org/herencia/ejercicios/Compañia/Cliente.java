package org.herencia.ejercicios.Compañia;

public class Cliente extends Persona{

    private int clienteId;

    public Cliente(String nombre,String apellido,String numeroFiscal,String direccion){
        super(nombre,apellido,numeroFiscal,direccion);
        this.clienteId = 0;
    }

    public int getClienteId() {
        return clienteId;
    }
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
}
