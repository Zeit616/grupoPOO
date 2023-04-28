package hotelProyecto;

//Importaciones
import java.util.List;

/*
 * @Autores
 * Ivan Alejandro Noriega Llerena
 * Bruno
 * Daniel
*/
public class habitacion {

     //atributos
    private int numeroDehabitacion;
    private String tipoHabitacion;
    private int capacidadMaxima;
    public int precio;
    private String estado;
    private hotel hotel;

    public habitacion(int numeroDehabitacion, String tipoHabitacion, int capacidadMaxima, int precio, String estado, hotel hotel) {
        this.numeroDehabitacion = numeroDehabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.capacidadMaxima = capacidadMaxima;
        this.precio = precio;
        this.estado = estado;
        this.hotel = hotel;
    }

    public hotel getHotel() {
        return hotel;
    }

    public void setHotel(hotel hotel) {
        this.hotel = hotel;
    }
        
    habitacion(int _precio, String _estado){
        precio = _precio;
        estado = _estado;
    }
    
    
    public void reservar(){
        this.precio = precio;
        
         if(precio>= 100){ 
            System.out.println("Reservacion hecha");
        }
        else{
             System.out.println("Habitacion no reservada");
        } 
        
    }
       
  public void liberar(){
        this.estado = estado;
        if(precio>= 100){ 
            System.out.println("Habitacion reservada"); 
        }
        else{ System.out.println("Habitacion liberada"); 
        }                     
    }
        /**
     * @return the numeroDehabitacion
     */
    public int getNumeroDehabitacion() {
        return numeroDehabitacion;
    }

    /**
     * @param numeroDehabitacion the numeroDehabitacion to set
     */
    public void setNumeroDehabitacion(int numeroDehabitacion) {
        this.numeroDehabitacion = numeroDehabitacion;
    }

    /**
     * @return the tipoHabitacion
     */
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    /**
     * @param tipoHabitacion the tipoHabitacion to set
     */
    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    /**
     * @return the capacidadMaxima
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * @param capacidadMaxima the capacidadMaxima to set
     */
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
