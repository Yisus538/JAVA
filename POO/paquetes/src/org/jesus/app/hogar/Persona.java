package org.jesus.app.hogar;

public class Persona {

    private String nombre;
    private String apellido;

    private static ColorPelo colorPelo;

    public static final String GENERO_MASCULINO = "Masculino";
    public static final String GENERO_FEMENINO = "Femenino";

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String lanzarPelota(){
        return " lanza la pelota al perro!";
    }
    public static String saludar(){
        return "hola que tal!";
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }
    public void setColorPelo(ColorPelo colorPelo) {
        Persona.colorPelo = colorPelo;
    }
}
