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
public class clCarrera {
    private String carcodigo;
    private String esccodigo;
    private String carnombre;

    public clCarrera() {
    }

    public clCarrera(String carcodigo, String esccodigo, String carnombre) {
        this.carcodigo = carcodigo;
        this.esccodigo = esccodigo;
        this.carnombre = carnombre;
    }

    public String getCarcodigo() {
        return carcodigo;
    }

    public void setCarcodigo(String carcodigo) {
        this.carcodigo = carcodigo;
    }

    public String getEsccodigo() {
        return esccodigo;
    }

    public void setEsccodigo(String esccodigo) {
        this.esccodigo = esccodigo;
    }

    public String getCarnombre() {
        return carnombre;
    }

    public void setCarnombre(String carnombre) {
        this.carnombre = carnombre;
    }
    
}
