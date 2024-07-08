package org.jesus.poointerfaces.imprenta.modelo;

public interface Imprimible {

    String TEXTO_DEFECTO = "Imprimiendo valor por defecto.";
    default String imprimir(){ // en este caso deberia ser obligatorio hacer polimorfismo pero lo dejamos como ejemplo
        return TEXTO_DEFECTO;
    }
    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
