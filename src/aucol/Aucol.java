/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aucol;

import Structure.*;
import java.io.*;
import static java.lang.Boolean.parseBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cattwinlow
 */
public class Aucol {

    private static LinkedLis loadbooks() throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader("libros.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Aucol.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(fr);

        LinkedLis<Book> Lbooks = new LinkedLis<>(); // Create an ArrayList object

        long inicio = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            String linea = br.readLine();
            String[] parts = linea.split(";");
            Book b = new Book(parts[1], parts[0], parts[2], parts[3], parseBoolean(parts[4]));
            Lbooks.pushFront(b);
        }

        long fin = System.nanoTime();
        System.out.println(((fin - inicio) * 1.0e-9));

        return Lbooks;
    }

    private static LinkedLis loadusers() throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader("asociados.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Aucol.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(fr);

        LinkedLis<Asociado> Lusers = new LinkedLis<>(); // Create an ArrayList object

        long inicio = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            String linea = br.readLine();
            String[] parts = linea.split(";");
            Asociado a = new Asociado(parts[4],/* int rol,*/ parts[0], parts[1], parts[2], parts[5], parts[3], parts[6]);
            Lusers.pushFront(a);
        }

        long fin = System.nanoTime();
        System.out.println(((fin - inicio) * 1.0e-9));

        return Lusers;
    }

    private static boolean findBook(LinkedLis Lis, String tx, char at) {
        boolean found = false;
        int j = 0;
        ChainNode ptr = Lis.getHead();
        Book book;
        switch (at) {
            case 'T':
                book = new Book(tx, null, null, null, false);
                while (ptr != null) {
                    if (ptr.getData().compareTo(book, at) == 0) {
                        found = true;
                        j++;
                        System.out.println(j + "  " + ptr.getData().toString());
                        //return found;  
                    }
                    ptr = ptr.getNext();
                    //System.out.print("intento ");
                }
            case 'A':
                book = new Book(null, tx, null, null, false);
                while (ptr != null) {
                    if (ptr.getData().compareTo(book) == 0) {
                        found = true;
                        j++;
                        System.out.println(j + "  " + ptr.getData().toString());
                        //return found;  
                    }
                    ptr = ptr.getNext();
                    //System.out.print("intento ");
                }
                break;
            case 'S':
                book = new Book(null, null, tx, null, false);
                while (ptr != null) {
                    if (ptr.getData().compareTo(book) == 0) {
                        found = true;
                        j++;
                        System.out.println(j + "  " + ptr.getData().toString());
                        //return found;  
                    }
                    ptr = ptr.getNext();
                    //System.out.print("intento ");
                }
                break;
            case 'Z':
                book = new Book(null, null, null, tx, false);
                while (ptr != null) {
                    if (ptr.getData().compareTo(book) == 0) {
                        found = true;
                        j++;
                        System.out.println(j + "  " + ptr.getData().toString());
                        //return found;  
                    }
                    ptr = ptr.getNext();
                    //System.out.print("intento ");
                }
                break;
            default:
                ptr = null;
                book = new Book(tx, null, null, null, false);
                while (ptr != null) {
                    if (ptr.getData().compareTo(book) == 0) {
                        found = true;
                        j++;
                        System.out.println(j + "  " + ptr.getData().toString());
                        //return found;  
                    }
                    ptr = ptr.getNext();
                    //System.out.print("intento ");
                }
        }

        return found;
    }

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        long inicio = System.nanoTime();
        LinkedLis LBooks = loadbooks();
        long fin = System.nanoTime();
        System.out.println(((fin - inicio) * 1.0e-9));

        inicio = System.nanoTime();
        boolean x = findBook(LBooks, "BABABABBAABBAAAB", 'T');
        fin = System.nanoTime();
        System.out.println("\n" + x + " " + ((fin - inicio) * 1.0e-9));
    }
}
