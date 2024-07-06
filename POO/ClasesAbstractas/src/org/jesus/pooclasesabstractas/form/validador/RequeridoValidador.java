package org.jesus.pooclasesabstractas.form.validador;

public class RequeridoValidador extends Validador{

    protected String mensaje = "el campo es requerido";
    @Override
    public boolean esValido(String valor) {
        return (valor!=null && valor.length()>0);
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
