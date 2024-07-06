package org.jesus.pooclasesabstractas.form;

import org.jesus.pooclasesabstractas.form.elementos.*;
import org.jesus.pooclasesabstractas.form.elementos.select.Opcion;
import org.jesus.pooclasesabstractas.form.validador.*;

import java.util.*;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());
        InputForm password = new InputForm("password","password");
        password.addValidador(new RequeridoValidador()).addValidador(new LargoValidador(6,12));
        InputForm email = new InputForm("email","email");
        email.addValidador(new RequeridoValidador()).addValidador(new EmailValidador());
        InputForm edad = new InputForm("edad","number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("experiencia",5,9);

        SelectForm lenguaje = new SelectForm("Lenguaje");
        lenguaje.addValidador(new NumeroValidador());

        lenguaje.addOpcion(new Opcion("Java","1"))
        .addOpcion(new Opcion("Python","2"))
        .addOpcion(new Opcion("PHP","3"))
        .addOpcion(new Opcion("JavaScript","4").setSelected())
        .addOpcion(new Opcion("Ruby","5"));

        // Metodos Anonimos en clases abstractas
        ElementoForm saludar = new ElementoForm("Saludar") {
            @Override
            public String dibujarHtml() {
                return "<input name=\""+this.nombre+"\" value=\""+ this.valor +"\"/>";
            }
        };

        saludar.setValor("Hola que tal este campo esta deshabilitado");
        username.setValor("yisus538");
        password.setValor("a1b2c3");
        email.setValor("yisus538@gmail.com");
        edad.setValor("20");
        experiencia.setValor("... mas de 10 anios de experiencia...");
        //java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,password,email,edad,experiencia,lenguaje,saludar);

        for(ElementoForm e : elementos){
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        }
        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
        });

        elementos.forEach(e -> {
           if(!e.esValido())
               e.getErrores().forEach(System.out::println);
        });

    }

}
