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
public class clUsuario {
    private Integer usucodigo;
    private String carcodigo;
    private String cardescripcionx;
    private String usucedula;
    private String usunombre;
    private String usuapellido;
    private String usutipo;
    

    public clUsuario() {
    }

    public clUsuario(Integer usucodigo, String carcodigo, String usucedula, String usunombre, String usuapellido, String usutipo) {
        this.usucodigo = usucodigo;
        this.carcodigo = carcodigo;
        this.usucedula = usucedula;
        this.usunombre = usunombre;
        this.usuapellido = usuapellido;
        this.usutipo = usutipo;
    }

    public clUsuario(Integer usucodigo, String carcodigo, String cardescripcionx, String usucedula, String usunombre, String usuapellido, String usutipo) {
        this.usucodigo = usucodigo;
        this.carcodigo = carcodigo;
        this.cardescripcionx = cardescripcionx;
        this.usucedula = usucedula;
        this.usunombre = usunombre;
        this.usuapellido = usuapellido;
        this.usutipo = usutipo;
    }

    public Integer getUsucodigo() {
        return usucodigo;
    }

    public void setUsucodigo(Integer usucodigo) {
        this.usucodigo = usucodigo;
    }

    public String getCarcodigo() {
        return carcodigo;
    }

    public void setCarcodigo(String carcodigo) {
        this.carcodigo = carcodigo;
    }

    public String getUsucedula() {
        return usucedula;
    }

    public void setUsucedula(String usucedula) {
        this.usucedula = usucedula;
    }

    public String getUsunombre() {
        return usunombre;
    }

    public void setUsunombre(String usunombre) {
        this.usunombre = usunombre;
    }

    public String getUsuapellido() {
        return usuapellido;
    }

    public void setUsuapellido(String usuapellido) {
        this.usuapellido = usuapellido;
    }

    public String getUsutipo() {
        return usutipo;
    }

    public void setUsutipo(String usutipo) {
        this.usutipo = usutipo;
    }

    public String getCardescripcionx() {
        return cardescripcionx;
    }

    public void setCardescripcionx(String cardescripcionx) {
        this.cardescripcionx = cardescripcionx;
    }
    
    
}
