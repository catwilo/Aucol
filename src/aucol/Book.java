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
public class Book implements Comparable{
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
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
