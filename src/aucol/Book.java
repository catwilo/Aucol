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
public class Book {
    String titulo, autor, sección, sinopsis;
    int disponibilidad; //0:Prestado, 1:Disponible
    String[] tags;

    public Book(String titulo, String autor, String sección, String sinopsis, int disponibilidad, String[] tags) {
        this.titulo = titulo;
        this.autor = autor;
        this.sección = sección;
        this.sinopsis = sinopsis;
        this.disponibilidad = disponibilidad;
        this.tags = tags;
    }
    
    
}
