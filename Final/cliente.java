/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author Lenovo
 */
public class cliente {
    
     //atributos
    private String direccion;
    public int telefonoCliente;
    private String correoCliente;
    private String listaDeReserva;
    
  

    cliente(){}//constructor
    
    
    //metodos
    public void hacerReserva(){
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefonoCliente
     */
    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    /**
     * @param telefonoCliente the telefonoCliente to set
     */
    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    /**
     * @return the correoCliente
     */
    public String getCorreoCliente() {
        return correoCliente;
    }

    /**
     * @param correoCliente the correoCliente to set
     */
    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }
    
    
}
