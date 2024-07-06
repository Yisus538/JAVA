package org.jesus.pooclasesabstractas.form.validador;

public class NumeroValidador extends Validador{

    protected String mensaje = "el campo %s debe ser un numero.";

    @Override
    public boolean esValido(String valor) {
        try{
            Integer.parseInt(valor);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
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
