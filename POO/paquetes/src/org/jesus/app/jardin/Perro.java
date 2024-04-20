package org.jesus.app.jardin;

import org.jesus.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    protected String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
