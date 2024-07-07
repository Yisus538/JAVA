package org.jesus.poointerfaces.imprenta.modelo;

public interface Imprimible {
    default String imprimir(){
        return "Imprimiendo valor por defecto.";
    }

}
