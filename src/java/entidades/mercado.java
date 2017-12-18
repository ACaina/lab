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
public class mercado {
    private Integer idmercado;
    private String nombremercado;
    private Integer estado;

    public mercado() {
    }

    public mercado(Integer idmercado, String nombremercado, Integer estado) {
        this.idmercado = idmercado;
        this.nombremercado = nombremercado;
        this.estado = estado;
    }

    public Integer getIdmercado() {
        return idmercado;
    }

    public void setIdmercado(Integer idmercado) {
        this.idmercado = idmercado;
    }

    public String getNombremercado() {
        return nombremercado;
    }

    public void setNombremercado(String nombremercado) {
        this.nombremercado = nombremercado;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    
    
    
}
