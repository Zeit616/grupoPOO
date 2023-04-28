package hotelProyecto;

import java.util.List;

/*
 * @Autores
 * Ivan Alejandro Noriega Llerena
 * Bruno
 * Daniel
*/
public class cliente extends persona{
    
     //atributos
    private String direccion;
    public int telefonoCliente;
    private String correoCliente;
    private List<reserva>listaDeReserva;

    public cliente(String direccion, int telefonoCliente, String correoCliente, List<reserva> listaDeReserva, String nombre, String apellido) {
        super(nombre, apellido);
        this.direccion = direccion;
        this.telefonoCliente = telefonoCliente;
        this.correoCliente = correoCliente;
        this.listaDeReserva = listaDeReserva;
    }

    @Override
    public void setNombre(String nombre) {
        
        super.setNombre(nombre);
    }
    
    @Override
    public void setApellido(String apellido) {
        
        super.setApellido(apellido);
    }

    
    public List<reserva> getListaDeReserva() {
        return listaDeReserva;
    }

    public void setListaDeReserva(List<reserva> listaDeReserva) {
        this.listaDeReserva = listaDeReserva;
    }

    
  

    
    
    
    //metodos
    public void agregarReserva(reserva reserva) {
        
    }

    public void eliminarReserva(reserva reserva) {
        
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
