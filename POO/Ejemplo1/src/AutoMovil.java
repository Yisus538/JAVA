public class AutoMovil {

    // Atributos
    String fabricante;
    String modelo;
    String color;
    double cilindrada;

    // Metodos
    public String detalle() {
        return "\nauto.fabricante = " + this.fabricante + "\nauto.modelo = " + this.modelo + "\nauto.color = " + this.color + "\nauto.cilindrada = " + this.cilindrada;
    }
    public String acelerar(int rpm){
        return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }
    public String frenar(){return this.fabricante + " " + this.modelo + "frenando!";}

}
