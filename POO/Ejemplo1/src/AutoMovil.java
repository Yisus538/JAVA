public class AutoMovil {

    // Atributos
    private int id;
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque = 40;

   private static String colorPatente = "Naranja";
   private static int capacidadTanqueEstatico = 30;
   private static int ultimoId;

    // Metodos

    // Sobrecarga de Constructores --------------------------------------------------------------------------
    public AutoMovil(){this.id = ++AutoMovil.ultimoId;} // Constructor por defecto
    public AutoMovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadTanque = capacidadTanque;
    }
    //------------------------------------------------------------------------------------------------------
    public void setFabricante(String fabricante){this.fabricante = fabricante;}
    public void setModelo(String modelo){this.modelo = modelo;}
    public void setColor(String color){this.color = color;}
    public void setCilindrada(double cilindrada){this.cilindrada = cilindrada;}
    public void setCapacidadTanque(int capacidadTanque){this.capacidadTanque = capacidadTanque;}
    //------------------------------------------------------------------------------------------------------
    public String getFabricante(){return this.fabricante;}
    public String getModelo(){return this.modelo;}
    public String getColor(){return this.color;}
    public double getCilindrada(){return  this.cilindrada;}
    public int getCapacidadTanque(){return this.capacidadTanque;}

    //-------------------------------------------------------------------------------------------------------
    public String detalle() {
        return "\nauto.id = " + this.id +
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo + "\nauto.color = " +
                this.color + "\nauto.patentecolor " + AutoMovil.getColorPatente() +
                "\nauto.cilindrada = " + this.cilindrada;
    }
    public String acelerar(int rpm){
        return "\nel auto " + this.fabricante + " acelerando a " + rpm + "rpm\n";
    }
    public String frenar(){return this.fabricante + " " + this.modelo + " frenando!";}
    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }
    public float calcularConsumo(int km,float porcentaje){
        return km/(capacidadTanque*porcentaje);
    }
    public float calcularConsumo(int km,int porcentaje){
        return km/(capacidadTanque*(porcentaje/100f));
    }
    public static float calcularConsumoEstatico(int km,int porcentaje){
        return km/(AutoMovil.capacidadTanqueEstatico*(porcentaje/100f));
    }

    // POLIMORFISMO ----------------------------------------------------------------------------------
    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }

        if(!(obj instanceof AutoMovil)){
            return false;
        }

        AutoMovil a = (AutoMovil)obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo())
        );


    }
    @Override
    public String toString() {
        return this.id + ": " + this.fabricante + " " + this.modelo;
    }

    // STATICO -----------------------------------------------------------------------------------------
    public static void setColorPatente(String colorPatente) {AutoMovil.colorPatente = colorPatente;}
    public static String getColorPatente() {return colorPatente;}
    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        AutoMovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }
    public static int getCapacidadTanqueEstatico() {return capacidadTanqueEstatico;}
}
