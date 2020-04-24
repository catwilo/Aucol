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
public class Ex_Asociado extends Aucoleano {
    //Falta fecha de salida 
    boolean gratitud;

    public Ex_Asociado(boolean gratitud, int Id, String nombre, String carrera, String universidad, String lugarOrigen) {
        super(Id, nombre, carrera, universidad, lugarOrigen);
        this.gratitud = gratitud;
    }
    
    
}
