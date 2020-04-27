/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aucol;

/**
 *
 * @author crist
 */
public class Book implements Comparable<Book>{
    String titulo, autor, sección, sinopsis;
    boolean disponibilidad; //0:Prestado, 1:Disponible
    String[] tags;

    public Book(String titulo, String autor, String sección, String sinopsis, boolean disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.sección = sección;
        this.sinopsis = sinopsis;
        this.disponibilidad = disponibilidad;
        
    }

    public Book(String titulo) {
        this.titulo = titulo;
    }
    
    

    public String getAutor() {
        return autor;
    }

    public String getSección() {
        return sección;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean  getDisponibilidad() {
        return disponibilidad;
    }
    
    
    


    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public int compareTo(Book t ) {
        return this.titulo.compareTo(t.titulo);
    }
    
    
}
