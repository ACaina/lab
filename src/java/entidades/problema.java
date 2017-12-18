/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Jackeline
 */
public class problema {
    private Integer id_problema;
    private String descripcion;
    private Integer id_causa;
    private Integer id_involucrado;

    public problema() {
    }

    public problema(Integer id_problema, String descripcion, Integer id_causa, Integer id_involucrado) {
        this.id_problema = id_problema;
        this.descripcion = descripcion;
        this.id_causa = id_causa;
        this.id_involucrado = id_involucrado;
    }

    public Integer getId_problema() {
        return id_problema;
    }

    public void setId_problema(Integer id_problema) {
        this.id_problema = id_problema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId_causa() {
        return id_causa;
    }

    public void setId_causa(Integer id_causa) {
        this.id_causa = id_causa;
    }

    public Integer getId_involucrado() {
        return id_involucrado;
    }

    public void setId_involucrado(Integer id_involucrado) {
        this.id_involucrado = id_involucrado;
    }
    
    
    
}
