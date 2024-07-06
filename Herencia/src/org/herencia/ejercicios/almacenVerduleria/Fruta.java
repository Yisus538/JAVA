package org.herencia.ejercicios.almacenVerduleria;

public class Fruta extends Producto{

    private String color;
    private Double peso;

    public Fruta(String nombre,Double precio,String color, Double peso) {
        super(nombre,precio);
        this.color = color;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String toString(){
        return super.toString() + "\nColor: " + color + "\nPeso: " + peso;
    }
}
