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
public class tipo_puesto {
    private Integer idtipopuesto;
    private String tipoDescripcion;
    
    public tipo_puesto(){
    }
    
    public tipo_puesto(Integer idtipopuesto,String tipoDescripcion){
        this.idtipopuesto=idtipopuesto;
        this.tipoDescripcion=tipoDescripcion;
    }

    public Integer getIdtipopuesto() {
        return idtipopuesto;
    }

    public void setIdtipopuesto(Integer idtipopuesto) {
        this.idtipopuesto = idtipopuesto;
    }

    public String getTipoDescripcion() {
        return tipoDescripcion;
    }

    public void setTipoDescripcion(String tipoDescripcion) {
        this.tipoDescripcion = tipoDescripcion;
    }
    
    
    
}
