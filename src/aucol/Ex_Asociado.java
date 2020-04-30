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
public class Ex_Asociado extends Aucoleano implements Comparable<Ex_Asociado> {
    //Falta fecha de salida 
    boolean gratitud;

    public Ex_Asociado(boolean gratitud, String Id, String nombre, String carrera, String universidad, String lugarOrigen) {
        super(Id, nombre, carrera, universidad, lugarOrigen);
        this.gratitud = gratitud;
    }

    @Override
    public int compareTo(Ex_Asociado t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
