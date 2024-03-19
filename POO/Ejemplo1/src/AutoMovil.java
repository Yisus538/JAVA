public class AutoMovil {

    // Atributos
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque = 40;

    // Metodos

    public AutoMovil(){} // Constructor por defecto
    public AutoMovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
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
        return "\nauto.fabricante = " + this.fabricante + "\nauto.modelo = " + this.modelo + "\nauto.color = " + this.color + "\nauto.cilindrada = " + this.cilindrada;
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

    // POLIMORFISMO ----------------------------------------------------------------------------------
    @Override
    public boolean equals(Object obj) {
        AutoMovil a = (AutoMovil)obj;
        return (this.fabricante != null && this.modelo != null &&
                this.fabricante.equals(a.getFabricante()) &&
                this.modelo.equals(a.getModelo())
        );
    }
}
