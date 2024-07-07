package org.jesus.poointerfaces.imprenta.modelo;

import java.util.List;
public class Libro implements Imprimible{

    private List<Pagina> paginas;
    private final Persona autor;
    private final String titulo;
    private final Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }
    public Libro addPaginas(Pagina paginas) {
        this.paginas.add(paginas);
        return this;
    }
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n");
        sb.append("Autor: ").append(this.autor).append("\n");
        sb.append("Genero: ").append(this.genero).append("\n");
        for(Pagina hoja: this.paginas){
            sb.append(hoja.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
