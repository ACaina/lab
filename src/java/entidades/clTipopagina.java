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
public class clTipopagina {
    private Integer tppcodigo;
    private String tppdescripcion;
    private String tpptipo;
    private String tpptipoaux; //para la descripcion..

    public clTipopagina() {
    }

    public clTipopagina(Integer tppcodigo, String tppdescripcion, String tpptipo) {
        this.tppcodigo = tppcodigo;
        this.tppdescripcion = tppdescripcion;
        this.tpptipo = tpptipo;
    }

    public Integer getTppcodigo() {
        return tppcodigo;
    }

    public void setTppcodigo(Integer tppcodigo) {
        this.tppcodigo = tppcodigo;
    }

    public String getTppdescripcion() {
        return tppdescripcion;
    }

    public void setTppdescripcion(String tppdescripcion) {
        this.tppdescripcion = tppdescripcion;
    }

    public String getTpptipo() {
        return tpptipo;
    }

    public void setTpptipo(String tpptipo) {
        this.tpptipo = tpptipo;
    }

    public String getTpptipoaux() {
        return tpptipoaux;
    }

    public void setTpptipoaux(String tpptipoaux) {
        this.tpptipoaux = tpptipoaux;
    }
    
    
}
