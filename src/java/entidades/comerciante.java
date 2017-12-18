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
public class comerciante {
    private Integer idcomerciante;
    private String identificador;
    private Integer tipoidentificador;
    private String nombrecomerciante;
    private String apellidocomerciante;
    private String direccioncomerciante;
    private String correocomerciante;
    private Integer conadis;
    private String telefono;

    public comerciante() {
    }

    public comerciante(Integer idcomerciante, String identificador, Integer tipoidentificador, String nombrecomerciante, String apellidocomerciante, String direccioncomerciante, String correocomerciante, Integer conadis, String telefono) {
        this.idcomerciante = idcomerciante;
        this.identificador = identificador;
        this.tipoidentificador = tipoidentificador;
        this.nombrecomerciante = nombrecomerciante;
        this.apellidocomerciante = apellidocomerciante;
        this.direccioncomerciante = direccioncomerciante;
        this.correocomerciante = correocomerciante;
        this.conadis = conadis;
        this.telefono = telefono;
    }

    public Integer getIdcomerciante() {
        return idcomerciante;
    }

    public void setIdcomerciante(Integer idcomerciante) {
        this.idcomerciante = idcomerciante;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Integer getTipoidentificador() {
        return tipoidentificador;
    }

    public void setTipoidentificador(Integer tipoidentificador) {
        this.tipoidentificador = tipoidentificador;
    }

    public String getNombrecomerciante() {
        return nombrecomerciante;
    }

    public void setNombrecomerciante(String nombrecomerciante) {
        this.nombrecomerciante = nombrecomerciante;
    }

    public String getApellidocomerciante() {
        return apellidocomerciante;
    }

    public void setApellidocomerciante(String apellidocomerciante) {
        this.apellidocomerciante = apellidocomerciante;
    }

    public String getDireccioncomerciante() {
        return direccioncomerciante;
    }

    public void setDireccioncomerciante(String direccioncomerciante) {
        this.direccioncomerciante = direccioncomerciante;
    }

    public String getCorreocomerciante() {
        return correocomerciante;
    }

    public void setCorreocomerciante(String correocomerciante) {
        this.correocomerciante = correocomerciante;
    }

    public Integer getConadis() {
        return conadis;
    }

    public void setConadis(Integer conadis) {
        this.conadis = conadis;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
