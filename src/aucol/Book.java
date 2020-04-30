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
public class Book implements Comparable<Book> {

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

    public Book() {
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

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    @Override
    public String toString() {
        return "Book{" + "titulo=" + titulo + ", autor=" + autor + ", secci\u00f3n=" + sección + ", sinopsis=" + sinopsis + ", disponibilidad=" + disponibilidad + ", tags=" + tags + '}';
    }

    @Override
    public int compareTo(Book t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int compareTo(Book t, char at) {

        switch (at) {
            case 'T':
                return this.titulo.compareTo(t.titulo);
            case 'A':
                break;
            case 'S':
                break;
            case 'Z':
                break;
        }
        return 0;
    }
}
