package org.jesus.pooclasesabstractas.form.validador;

public class NoNuloValidador extends Validador{

    protected String mensaje = "El campo %s no puede ser nulo...";


    @Override
    public boolean esValido(String valor) {
        return (valor!=null && valor.trim().length()>0);
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
