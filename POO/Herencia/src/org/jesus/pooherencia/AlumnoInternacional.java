package org.jesus.pooherencia;

public class AlumnoInternacional extends Alumno{

    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional(){
        System.out.println("Inicializando AlumnoInternacional...");
    }
    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }
    public AlumnoInternacional(String nombre, String apellido, double notaIdiomas){
        this(nombre, apellido);
        this.notaIdiomas = notaIdiomas;
    }
    public AlumnoInternacional(String nombre, String apellido,String pais){
        this(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }


    public double getNotaIdiomas() {
        return notaIdiomas;
    }
    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return "Hola soy un alumno extranjero del pais " + this.getPais() + " mi nombre es: " + this.getNombre();
    }

    @Override
    public double calcularPromedio(){
        return ((super.calcularPromedio()*3) + notaIdiomas)/4;
    }
}
