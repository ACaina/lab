/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author HP ENVY
 */
public class subactividad {
    private Integer idsubactividad;
    private String descripcionsubactividad;

    public subactividad() {
    }

    public subactividad(Integer idsubactividad, String descripcionsubactividad) {
        this.idsubactividad = idsubactividad;
        this.descripcionsubactividad = descripcionsubactividad;
    }

    public Integer getIdsubactividad() {
        return idsubactividad;
    }

    public void setIdsubactividad(Integer idsubactividad) {
        this.idsubactividad = idsubactividad;
    }

    public String getDescripcionsubactividad() {
        return descripcionsubactividad;
    }

    public void setDescripcionsubactividad(String descripcionsubactividad) {
        this.descripcionsubactividad = descripcionsubactividad;
    }
    
}
