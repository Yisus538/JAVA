package org.herencia.ejercicios.Compañia;

public class Empleado extends Persona{

    private Double remuneracion;
    private int expleadoId;

    public Empleado(String nombre, String apellido,String numeroFiscal,String direccion, Double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }
    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getExpleadoId() {
        return expleadoId;
    }
    public void setExpleadoId(int expleadoId) {
        this.expleadoId = expleadoId;
    }

    public int aumentarRemuneracion(int porcentaje) {
        return porcentaje;
    }

}
