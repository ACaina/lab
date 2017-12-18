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
public class clTipo {
    private Integer tipcodigo;
    private String tipdescripcion;

    public clTipo() {
    }

    public clTipo(Integer tipcodigo, String tipdescripcion) {
        this.tipcodigo = tipcodigo;
        this.tipdescripcion = tipdescripcion;
    }

    public Integer getTipcodigo() {
        return tipcodigo;
    }

    public void setTipcodigo(Integer tipcodigo) {
        this.tipcodigo = tipcodigo;
    }

    public String getTipdescripcion() {
        return tipdescripcion;
    }

    public void setTipdescripcion(String tipdescripcion) {
        this.tipdescripcion = tipdescripcion;
    }
    
    
}
