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
public class puesto {
    private Integer idpuesto;
    private String numeropuesto;
    private Integer idtarifa;
    private Integer idmercado;

    public puesto() {
    }

    public puesto(Integer idpuesto, String numeropuesto, Integer idtarifa, Integer idmercado) {
        this.idpuesto = idpuesto;
        this.numeropuesto = numeropuesto;
        this.idtarifa = idtarifa;
        this.idmercado = idmercado;
    }

    public Integer getIdpuesto() {
        return idpuesto;
    }

    public void setIdpuesto(Integer idpuesto) {
        this.idpuesto = idpuesto;
    }

    public String getNumeropuesto() {
        return numeropuesto;
    }

    public void setNumeropuesto(String numeropuesto) {
        this.numeropuesto = numeropuesto;
    }

    public Integer getIdtarifa() {
        return idtarifa;
    }

    public void setIdtarifa(Integer idtarifa) {
        this.idtarifa = idtarifa;
    }

    public Integer getIdmercado() {
        return idmercado;
    }

    public void setIdmercado(Integer idmercado) {
        this.idmercado = idmercado;
    }
    
    
    
}
