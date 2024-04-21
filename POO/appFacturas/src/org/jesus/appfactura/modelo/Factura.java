package org.jesus.appfactura.modelo;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Factura {

    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    private int folio;
    private Date fecha;
    private String descripcion;


    private  static int ultimoFolio;
    public static final int MAX_ITEMS = 12;

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

    public float calcularTotal(){
        float total = 0.0f;

        for(ItemFactura item : this.items){
            if(item == null) {
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }
    public String veDetalle(){
        StringBuilder sb = new StringBuilder("Factura N: ");
        sb.append(this.folio)
                .append("\nCliente: ").append(this.cliente.getNombre())
                .append("\nNIF: ").append(this.cliente.getNif())
                .append("\nDescripcion: ").append(this.descripcion)
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emision: ")
                .append(df.format(this.fecha))
                .append("\n");
        for(ItemFactura item : this.items){
            if(item == null) {
                continue;
            }
            sb.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.calcularImporte())
                    .append("\n");
        }
        sb.append("\nGran Total: ")
                .append(this.calcularTotal());

        return sb.toString();
    }
}
