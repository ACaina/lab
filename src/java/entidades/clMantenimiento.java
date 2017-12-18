/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class clMantenimiento {
    private Integer comcodigo;
    private Integer tipmcodigo;
    private String manresponsable;
    private Date manfecha;
    private Integer comcodigobienesx;
    private Integer comnumerocomputadorax;
    private String labdescripcionx;
    private String  tipmdescripcionx;

    public clMantenimiento() {
    }

    public clMantenimiento(Integer comcodigo, Integer tipmcodigo, String manresponsable, Date manfecha) {
        this.comcodigo = comcodigo;
        this.tipmcodigo = tipmcodigo;
        this.manresponsable = manresponsable;
        this.manfecha = manfecha;
    }

    public Integer getComcodigo() {
        return comcodigo;
    }

    public void setComcodigo(Integer comcodigo) {
        this.comcodigo = comcodigo;
    }

    public Integer getTipmcodigo() {
        return tipmcodigo;
    }

    public void setTipmcodigo(Integer tipmcodigo) {
        this.tipmcodigo = tipmcodigo;
    }

    public String getManresponsable() {
        return manresponsable;
    }

    public void setManresponsable(String manresponsable) {
        this.manresponsable = manresponsable;
    }

    public Date getManfecha() {
        return manfecha;
    }

    public void setManfecha(Date manfecha) {
        this.manfecha = manfecha;
    }

    public Integer getComcodigobienesx() {
        return comcodigobienesx;
    }

    public void setComcodigobienesx(Integer comcodigobienesx) {
        this.comcodigobienesx = comcodigobienesx;
    }

    public Integer getComnumerocomputadorax() {
        return comnumerocomputadorax;
    }

    public void setComnumerocomputadorax(Integer comnumerocomputadorax) {
        this.comnumerocomputadorax = comnumerocomputadorax;
    }

    public String getLabdescripcionx() {
        return labdescripcionx;
    }

    public void setLabdescripcionx(String labdescripcionx) {
        this.labdescripcionx = labdescripcionx;
    }

    public String getTipmdescripcionx() {
        return tipmdescripcionx;
    }

    public void setTipmdescripcionx(String tipmdescripcionx) {
        this.tipmdescripcionx = tipmdescripcionx;
    }

   

    
}
