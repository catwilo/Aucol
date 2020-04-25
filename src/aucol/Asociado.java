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
public class Asociado extends Aucoleano {
    
    boolean rat; //0: No ratificado, 1: Ratificado
    int rol;//0:Asociado, 1:Presidencia, 2:Tesorería, 3: Mantenimiento, 4:Economato
            //5:Vocalía, 6:Secretaría, 7:Fiscalía
    String password;

    public Asociado(boolean rat, int rol, int id, String nombre, String carrera, String universidad, String lugarOrigen, String password) {
        super(id, nombre, carrera, universidad, lugarOrigen);
        this.rat = rat;
        this.rol = rol;
        this.password=password;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getEstado() {
        return rat;
    }

    public int getRol() {
        return rol;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }
    
    
    
}
