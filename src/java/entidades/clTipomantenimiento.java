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
public class clTipomantenimiento {
    private Integer tipmcodigo;
    private Integer tipcodigo;
    private String tipmdescripcion;
    private String tipdescripcionx;
    
    public clTipomantenimiento() {
    }

    public clTipomantenimiento(Integer tipmcodigo, Integer tipcodigo, String tipmdescripcion, String tipdescripcionx) {
        this.tipmcodigo = tipmcodigo;
        this.tipcodigo = tipcodigo;
        this.tipmdescripcion = tipmdescripcion;
        this.tipdescripcionx = tipdescripcionx;
    }

    public Integer getTipmcodigo() {
        return tipmcodigo;
    }

    public void setTipmcodigo(Integer tipmcodigo) {
        this.tipmcodigo = tipmcodigo;
    }

    public Integer getTipcodigo() {
        return tipcodigo;
    }

    public void setTipcodigo(Integer tipcodigo) {
        this.tipcodigo = tipcodigo;
    }

    public String getTipmdescripcion() {
        return tipmdescripcion;
    }

    public void setTipmdescripcion(String tipmdescripcion) {
        this.tipmdescripcion = tipmdescripcion;
    }

    public String getTipdescripcionx() {
        return tipdescripcionx;
    }

    public void setTipdescripcionx(String tipdescripcionx) {
        this.tipdescripcionx = tipdescripcionx;
    }

    
}
