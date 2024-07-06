package org.jesus.pooclasesabstractas.form.elementos.select;

public class Opcion {

    private String nombre;
    private String valor;
    private boolean selected;

    public Opcion(){
    }
    public Opcion(String nombre,String valor){
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isSelected() {
        return selected;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    public Opcion setSelected(){this.selected = true;return this;}

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
