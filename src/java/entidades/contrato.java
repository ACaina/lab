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
public class contrato {
    private Integer idcontrato;
    private String fechainicio;
    private String fechafin;
    private Integer idcomerciante;
    private Integer idpuesto;
    private Integer idactividad;

    public contrato() {
    }

    public contrato(Integer idcontrato, String fechainicio, String fechafin, Integer idcomerciante, Integer idpuesto, Integer idactividad) {
        this.idcontrato = idcontrato;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.idcomerciante = idcomerciante;
        this.idpuesto = idpuesto;
        this.idactividad = idactividad;
    }

    public Integer getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(Integer idcontrato) {
        this.idcontrato = idcontrato;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public Integer getIdcomerciante() {
        return idcomerciante;
    }

    public void setIdcomerciante(Integer idcomerciante) {
        this.idcomerciante = idcomerciante;
    }

    public Integer getIdpuesto() {
        return idpuesto;
    }

    public void setIdpuesto(Integer idpuesto) {
        this.idpuesto = idpuesto;
    }

    public Integer getIdactividad() {
        return idactividad;
    }

    public void setIdactividad(Integer idactividad) {
        this.idactividad = idactividad;
    }
    
    
    
}
