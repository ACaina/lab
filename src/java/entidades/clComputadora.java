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
public class clComputadora {
    private Integer comcodigo;
    private Integer frecodigo;
    private Integer labcodigo;
    private Integer comcodigobienes;
    private Integer comcodigobarras;
    private String comdescripcion;
    private String comestado;
    private Integer comnumerocomputadora;
    private String fredescripcionx;
    private String labdescripcionx;

    public clComputadora() {
    }

    public clComputadora(Integer comcodigo, Integer frecodigo, Integer labcodigo, Integer comcodigobienes, Integer comcodigobarras, String comdescripcion, String comestado, Integer comnumerocomputadora) {
        this.comcodigo = comcodigo;
        this.frecodigo = frecodigo;
        this.labcodigo = labcodigo;
        this.comcodigobienes = comcodigobienes;
        this.comcodigobarras = comcodigobarras;
        this.comdescripcion = comdescripcion;
        this.comestado = comestado;
        this.comnumerocomputadora = comnumerocomputadora;
    }

    public Integer getComcodigo() {
        return comcodigo;
    }

    public void setComcodigo(Integer comcodigo) {
        this.comcodigo = comcodigo;
    }

    public Integer getFrecodigo() {
        return frecodigo;
    }

    public void setFrecodigo(Integer frecodigo) {
        this.frecodigo = frecodigo;
    }

    public Integer getLabcodigo() {
        return labcodigo;
    }

    public void setLabcodigo(Integer labcodigo) {
        this.labcodigo = labcodigo;
    }

    public Integer getComcodigobienes() {
        return comcodigobienes;
    }

    public void setComcodigobienes(Integer comcodigobienes) {
        this.comcodigobienes = comcodigobienes;
    }

    public Integer getComcodigobarras() {
        return comcodigobarras;
    }

    public void setComcodigobarras(Integer comcodigobarras) {
        this.comcodigobarras = comcodigobarras;
    }

    public String getComdescripcion() {
        return comdescripcion;
    }

    public void setComdescripcion(String comdescripcion) {
        this.comdescripcion = comdescripcion;
    }

    public String getComestado() {
        return comestado;
    }

    public void setComestado(String comestado) {
        this.comestado = comestado;
    }

    public Integer getComnumerocomputadora() {
        return comnumerocomputadora;
    }

    public void setComnumerocomputadora(Integer comnumerocomputadora) {
        this.comnumerocomputadora = comnumerocomputadora;
    }

    public String getFredescripcionx() {
        return fredescripcionx;
    }

    public void setFredescripcionx(String fredescripcionx) {
        this.fredescripcionx = fredescripcionx;
    }

    public String getLabdescripcionx() {
        return labdescripcionx;
    }

    public void setLabdescripcionx(String labdescripcionx) {
        this.labdescripcionx = labdescripcionx;
    }

    
}
