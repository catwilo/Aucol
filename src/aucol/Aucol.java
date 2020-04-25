/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aucol;
import java.util.*;
import java.io.*;
import Structure.*;

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
        
        ListaSimple<Book> ListaSimple = new ListaSimple<Book>(); // Create an ArrayList object
        
       for(int i=0;i<10000;i++){
            linea=br.readLine();

            String[] parts = linea.split(";");
            autor = parts[1];
            titulo = parts[2];
            seccion = parts[3];
            sinopsis = parts[4];
            disponibilidad = Integer.parseInt(parts[0]);
           
           
            Book b=new Book(titulo, autor, seccion, sinopsis, disponibilidad);
            
            //libros.add(b);
       }

        
        //System.out.println(linea);
        
       /* for(int i=0;i<libros.size();i++){
            Book n=libros.get(i);
            if(n.getDisponibilidad()==80 && n.getAutor().equals("Concepcion"))
                System.out.println("Ingreso correcto");
        }*/
    }
    
}
