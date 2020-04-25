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

/**
 *
 * @author cattwinlow
 */
public class Aucol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader("libros.txt");
        BufferedReader br = new BufferedReader(fr);

        String linea = null;
        String titulo;
        String autor;
        String seccion;
        String sinopsis;
        boolean disponibilidad;

        LinkedLis<Book> Lista = new LinkedLis<Book>(); // Create an ArrayList object

        for (int i = 0; i < 10000; i++) {
            linea = br.readLine();

            String[] parts = linea.split(";");
            autor = parts[1];
            titulo = parts[2];
            seccion = parts[3];
            sinopsis = parts[4];
            disponibilidad = parseBoolean(parts[0]);

            Book b = new Book(titulo, autor, seccion, sinopsis, disponibilidad);

            Lista.PushFront(b);
        }
    }

}
