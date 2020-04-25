/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aucol;
import java.util.*;
import java.io.*;

/**
 *
 * @author cattwinlow
 */
public class Aucol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // TODO code application logic here
        
        //ArrayList<Asociado> hey = new ArrayList<Asociado>();
        
        FileReader fr = new FileReader("libros.txt");
        BufferedReader br = new BufferedReader(fr);
 
        String linea;
        String titulo;
        String autor;
        String seccion;
        String sinopsis;
        int disponibilidad;
        
        ArrayList<Book> libros = new ArrayList<Book>(); // Create an ArrayList object
        
       for(int i=0;i<10000;i++){
            linea=br.readLine();

            String[] parts = linea.split(";");
            autor = parts[0];
            titulo = parts[1];
            seccion = parts[2];
            sinopsis = parts[3];
            disponibilidad = Integer.parseInt(parts[4]);
           
           
            Book b=new Book(titulo, autor, seccion, sinopsis, disponibilidad);
            
            libros.add(b);
       }

        
        //System.out.println(linea);
        
        for(int i=0;i<libros.size();i++){
            Book n=libros.get(i);
            System.out.println("Titulo: " +n.getTitulo() + "\tAutor: " +n.getAutor());
        }
    }
    
}
