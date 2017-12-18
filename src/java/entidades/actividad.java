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
public class actividad {
    private Integer idactividad;
    private String descripcionactividad;
    private Integer idsubactividad;

    public actividad() {
    }

    public actividad(Integer idactividad, String descripcionactividad, Integer idsubactividad) {
        this.idactividad = idactividad;
        this.descripcionactividad = descripcionactividad;
        this.idsubactividad = idsubactividad;
    }

    public Integer getIdactividad() {
        return idactividad;
    }

    public void setIdactividad(Integer idactividad) {
        this.idactividad = idactividad;
    }

    public String getDescripcionactividad() {
        return descripcionactividad;
    }

    public void setDescripcionactividad(String descripcionactividad) {
        this.descripcionactividad = descripcionactividad;
    }

    public Integer getIdsubactividad() {
        return idsubactividad;
    }

    public void setIdsubactividad(Integer idsubactividad) {
        this.idsubactividad = idsubactividad;
    }
      
    
}
