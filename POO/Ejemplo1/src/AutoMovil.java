public class AutoMovil {

    // Atributos
    String fabricante;
    String modelo;
    String color;
    double cilindrada;

    // Metodos
    public String detalle() {

        String sb = "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada;

        return sb;
    }
}
