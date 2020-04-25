/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aucol;

import Structure.LinkedLis;
import java.util.*;
import java.io.*;
import static java.lang.Boolean.parseBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cattwinlow
 */
public class Aucol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*
        FileReader fr = new FileReader("asociados.txt");
        BufferedReader br = new BufferedReader(fr);

        String linea = null;
        String titulo;
        String autor;
        String seccion;
        String sinopsis;
        boolean disponibilidad;

        LinkedLis<Book> Lbooks = new LinkedLis<Book>(); // Create an ArrayList object

        for (int i = 0; i < 10000; i++) {
            linea = br.readLine();

            String[] parts = linea.split(";");
            autor = parts[1];
            titulo = parts[2];
            seccion = parts[3];
            sinopsis = parts[4];
            disponibilidad = parseBoolean(parts[0]);

            Book b = new Book(titulo, autor, seccion, sinopsis, disponibilidad);

            Lbooks.PushFront(b);

        }
         */
    }

    private void loadbooks() throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader("libros.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Aucol.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(fr);

        String linea = null;
        String titulo;
        String autor;
        String seccion;
        String sinopsis;
        boolean disponibilidad;

        LinkedLis<Book> Lbooks = new LinkedLis<Book>(); // Create an ArrayList object

        for (int i = 0; i < 10000; i++) {
            linea = br.readLine();

            String[] parts = linea.split(";");
            autor = parts[1];
            titulo = parts[2];
            seccion = parts[3];
            sinopsis = parts[4];
            disponibilidad = parseBoolean(parts[0]);

            Book b = new Book(titulo, autor, seccion, sinopsis, disponibilidad);

            Lbooks.PushFront(b);

        }
    }
}
