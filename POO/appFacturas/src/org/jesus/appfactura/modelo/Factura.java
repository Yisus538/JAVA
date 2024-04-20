package org.jesus.appfactura.modelo;

import java.util.Date;

public class Factura {

    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    private int folio;
    private Date fecha;
    private String descripcion;


    private  static int ultimoFolio;
    public static final int MAX_ITEMS = 10;

    public Factura(Cliente cliente, String descripcion) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }
    public void setItems(ItemFactura[] items) {
        this.items = items;
    }

    public int getFolio() {
        return folio;
    }

    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void addItemFactura(ItemFactura items){
        if(indiceItems < MAX_ITEMS){
            this.items[this.indiceItems++] = items;
        }
    }
}
