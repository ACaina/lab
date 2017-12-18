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
public class seccion {
    private Integer idseccion;
    private String nombreseccion;
    private Integer estado;
    private Double dimension;

    public seccion() {
    }

    public seccion(Integer idseccion, String nombreseccion, Integer estado, Double dimension) {
        this.idseccion = idseccion;
        this.nombreseccion = nombreseccion;
        this.estado = estado;
        this.dimension = dimension;
    }

    public Integer getIdseccion() {
        return idseccion;
    }

    public void setIdseccion(Integer idseccion) {
        this.idseccion = idseccion;
    }

    public String getNombreseccion() {
        return nombreseccion;
    }

    public void setNombreseccion(String nombreseccion) {
        this.nombreseccion = nombreseccion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Double getDimension() {
        return dimension;
    }

    public void setDimension(Double dimension) {
        this.dimension = dimension;
    }
    
}
