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
public class Asociado extends Aucoleano{
    
    int estado; //0: No ratificado, 1: Ratificado
    int rol;//0:Asociado, 1:Presidencia, 2:Tesorería, 3: Mantenimiento, 4:Economato
            //5:Vocalía, 6:Secretaría, 7:Fiscalía
    String password;

    public Asociado(int estado, int rol, int id, String nombre, String carrera, String universidad, String lugarOrigen, String password) {
        super(id, nombre, carrera, universidad, lugarOrigen);
        this.estado = estado;
        this.rol = rol;
        this.password=password;
    }
    
    
    
}
