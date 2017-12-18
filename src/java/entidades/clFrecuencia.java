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
public class clFrecuencia {

    private Integer frecodigo;
    private String fredescripcion;

    public clFrecuencia() {
    }

    public clFrecuencia(Integer frecodigo, String fredescripcion) {
        this.frecodigo = frecodigo;
        this.fredescripcion = fredescripcion;
    }

    public Integer getFrecodigo() {
        return frecodigo;
    }

    public void setFrecodigo(Integer frecodigo) {
        this.frecodigo = frecodigo;
    }

    public String getFredescripcion() {
        return fredescripcion;
    }

    public void setFredescripcion(String fredescripcion) {
        this.fredescripcion = fredescripcion;
    }

}
