/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aucol;

/**
 *
 * @author cattwinlow
 */
abstract class Aucoleano {

    int id;
    String nombre, carrera, universidad, lugarOrigen;
    //Falta fecha de ingreso, no se como ponerlo :v

    public Aucoleano(String Id, String nombre, String carrera, String universidad, String lugarOrigen) {
        this.id = Integer.parseInt(Id);
        this.nombre = nombre;
        this.carrera = carrera;
        this.universidad = universidad;
        this.lugarOrigen = lugarOrigen;
    }

}
