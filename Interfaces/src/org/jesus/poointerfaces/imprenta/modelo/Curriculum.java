package org.jesus.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;
public class Curriculum extends Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(Persona persona,String contenido, String carrera){
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<String>();
    }
    public Curriculum addExperiencia(String experiencia){
        this.experiencias.add(experiencia);
        return this;
    }
    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ").append(this.carrera)
                .append("Experiencia: ");
                for(String experiencia : this.experiencias){
                    sb.append(experiencia).append(", \n");
                }
        return sb.toString();
    }
}
