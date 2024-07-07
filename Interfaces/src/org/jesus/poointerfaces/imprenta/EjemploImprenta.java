package org.jesus.poointerfaces.imprenta;

import org.jesus.poointerfaces.imprenta.modelo.*;
import static org.jesus.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("Jesus Manuel"," Martinez"),"Resumen laboral...","Ingenieria Informatica");
        cv.addExperiencia("Java")
                .addExperiencia("Sprint Framework")
                .addExperiencia("Oracle DBA")
                .addExperiencia("SQL Server")
                .addExperiencia("Angular");

        Informe informe = new Informe("Estudiante de microservicios",new Persona("Jesus Manuel"," Martinez"),"James");
        imprimir(cv);
        imprimir(informe);


        Libro libro = new Libro(new Persona("Jesus Manuel"," Martinez"),"Patron de Diseños: Elem, Reusables POO", PROGRAMACION);
        libro.addPaginas(new Pagina("Patron Singleton"))
                .addPaginas(new Pagina("Patron Observador"))
                .addPaginas(new Pagina("Patron Factory"))
                .addPaginas(new Pagina("Patron Composite"))
                .addPaginas(new Pagina("Patron Fascade"));

    }
    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
