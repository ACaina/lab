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
public class tarifa {
    private Integer idtarifa;
    private Double valortarifa;
    private Integer idseccion;
    private Integer idtipopuesto;

    public tarifa() {
    }

    public tarifa(Integer idtarifa, Double valortarifa, Integer idseccion, Integer idtipopuesto) {
        this.idtarifa = idtarifa;
        this.valortarifa = valortarifa;
        this.idseccion = idseccion;
        this.idtipopuesto = idtipopuesto;
    }
     
    public Integer getIdtarifa() {
        return idtarifa;
    }

    public void setIdtarifa(Integer idtarifa) {
        this.idtarifa = idtarifa;
    }

    public Double getValortarifa() {
        return valortarifa;
    }

    public void setValortarifa(Double valortarifa) {
        this.valortarifa = valortarifa;
    }

    public Integer getIdseccion() {
        return idseccion;
    }

    public void setIdseccion(Integer idseccion) {
        this.idseccion = idseccion;
    }

    public Integer getIdtipopuesto() {
        return idtipopuesto;
    }

    public void setIdtipopuesto(Integer idtipopuesto) {
        this.idtipopuesto = idtipopuesto;
    }
    
}
