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
public class comprobante {
    private Integer idcomprobante;
    private Double valorcancelar;
    private Double iva;
    private String numeropuesto;
    private String nombresusuario;
    private String apellidosusuario;
    private String fechaemision;
    private Integer mespago;
    private Integer añopago;
    private String nombreseccion;
    private String tipopuesto;
    private Integer idcontrato;

    public comprobante() {
    }

    public comprobante(Integer idcomprobante, Double valorcancelar, Double iva, String numeropuesto, String nombresusuario, String apellidosusuario, String fechaemision, Integer mespago, Integer añopago, String nombreseccion, String tipopuesto, Integer idcontrato) {
        this.idcomprobante = idcomprobante;
        this.valorcancelar = valorcancelar;
        this.iva = iva;
        this.numeropuesto = numeropuesto;
        this.nombresusuario = nombresusuario;
        this.apellidosusuario = apellidosusuario;
        this.fechaemision = fechaemision;
        this.mespago = mespago;
        this.añopago = añopago;
        this.nombreseccion = nombreseccion;
        this.tipopuesto = tipopuesto;
        this.idcontrato = idcontrato;
    }

    public Integer getIdcomprobante() {
        return idcomprobante;
    }

    public void setIdcomprobante(Integer idcomprobante) {
        this.idcomprobante = idcomprobante;
    }

    public Double getValorcancelar() {
        return valorcancelar;
    }

    public void setValorcancelar(Double valorcancelar) {
        this.valorcancelar = valorcancelar;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public String getNumeropuesto() {
        return numeropuesto;
    }

    public void setNumeropuesto(String numeropuesto) {
        this.numeropuesto = numeropuesto;
    }

    public String getNombresusuario() {
        return nombresusuario;
    }

    public void setNombresusuario(String nombresusuario) {
        this.nombresusuario = nombresusuario;
    }

    public String getApellidosusuario() {
        return apellidosusuario;
    }

    public void setApellidosusuario(String apellidosusuario) {
        this.apellidosusuario = apellidosusuario;
    }

    public String getFechaemision() {
        return fechaemision;
    }

    public void setFechaemision(String fechaemision) {
        this.fechaemision = fechaemision;
    }

    public Integer getMespago() {
        return mespago;
    }

    public void setMespago(Integer mespago) {
        this.mespago = mespago;
    }

    public Integer getAñopago() {
        return añopago;
    }

    public void setAñopago(Integer añopago) {
        this.añopago = añopago;
    }

    public String getNombreseccion() {
        return nombreseccion;
    }

    public void setNombreseccion(String nombreseccion) {
        this.nombreseccion = nombreseccion;
    }

    public String getTipopuesto() {
        return tipopuesto;
    }

    public void setTipopuesto(String tipopuesto) {
        this.tipopuesto = tipopuesto;
    }

    public Integer getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(Integer idcontrato) {
        this.idcontrato = idcontrato;
    }
    
    
    
}
