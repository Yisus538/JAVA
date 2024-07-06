package org.herencia.ejercicios.Compañia;

public class Gerente extends Empleado{

    private Double presupuesto;

    public Gerente(String nombre,String apellido,String numeroFiscal,String direccion,Double remuneracion, Double presupuesto){
        super(nombre,apellido,numeroFiscal,direccion,remuneracion);
        this.presupuesto=presupuesto;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }
}
