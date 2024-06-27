package org.jesus.pooherencia;

public class Profesor extends Persona{

    private String asignatura;

    public Profesor(){
        System.out.println("Profesor: inicializaciondo constructor...");
    }
    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }
    public Profesor(String nombre, String apellido, String asignatura){
        this(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Buenas dias soy el profesor de " + this.getAsignatura() + ", mi nombre es: " + this.getNombre();
    }
}
