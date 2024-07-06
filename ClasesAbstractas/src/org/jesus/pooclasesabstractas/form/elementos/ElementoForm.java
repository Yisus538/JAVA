package org.jesus.pooclasesabstractas.form.elementos;

import org.jesus.pooclasesabstractas.form.validador.*;
import org.jesus.pooclasesabstractas.form.validador.mensaje.MensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private final List<Validador> validadores;
    private final List<String> errores;

    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }
    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public boolean esValido() {
        for (Validador validador : validadores) {
            if(!validador.esValido(this.valor)) {
                if(validador instanceof MensajeFormateable){
                    this.errores.add(((MensajeFormateable) validador).getMensajeFormateado(nombre));
                }else{
                    this.errores.add(String.format(validador.getMensaje(),nombre));
                }
            }
        }
        return this.errores.isEmpty();
    }
    abstract public String dibujarHtml();

}
