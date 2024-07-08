package org.jesus.poointerfaces.imprenta;

import org.jesus.poointerfaces.imprenta.modelo.*;
import static org.jesus.poointerfaces.imprenta.modelo.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("Jesus Manuel"," Martinez"),"Resumen laboral...","Ingenieria Informatica");
        cv.addExperiencia("Java")
                .addExperiencia("Sprint Framework")
                .addExperiencia("Oracle DBA")
                .addExperiencia("SQL Server")
                .addExperiencia("Angular");

        Informe informe = new Informe("Estudiante de microservicios",new Persona("Jesus Manuel"," Martinez"),"James");
        Imprimible.imprimir(cv);
        Imprimible.imprimir(informe);



        System.out.println(TEXTO_DEFECTO);

    }

}
