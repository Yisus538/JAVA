package org.jesus.app.jardin;

import org.jesus.app.hogar.*;
import static org.jesus.app.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();

        p.setNombre("Jesus");
        p.setApellido("Martinez");
        p.setColorPelo(ColorPelo.CAFE);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println(p.getNombre() + jugando);
        String saludo = Persona.saludar();
        System.out.println(saludo);

        String generoMujer = Persona.GENERO_FEMENINO;
        String generoMasculino = Persona.GENERO_MASCULINO;
    }
}
