/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author usuario
 */
public class clLaboratorio {

    private Integer labcodigo;
    private String labdescripcion;

    public clLaboratorio() {
    }

    public clLaboratorio(Integer labcodigo, String labdescripcion) {
        this.labcodigo = labcodigo;
        this.labdescripcion = labdescripcion;
    }

    public Integer getLabcodigo() {
        return labcodigo;
    }

    public void setLabcodigo(Integer labcodigo) {
        this.labcodigo = labcodigo;
    }

    public String getLabdescripcion() {
        return labdescripcion;
    }

    public void setLabdescripcion(String labdescripcion) {
        this.labdescripcion = labdescripcion;
    }

}
