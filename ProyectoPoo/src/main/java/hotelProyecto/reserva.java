package hotelProyecto;

import java.util.List;

/*
 * @Autores
 * Ivan Alejandro Noriega Llerena
 * Bruno
 * Daniel
*/
public class reserva {
    
     //atributos
    private int numeroReserva;
    private int fechaLlegada;
    private int fechaSalida;
    private List<habitacion>habitacionReservadas;
    private String cliente;

    public reserva(int numeroReserva, int fechaLlegada, int fechaSalida, List<habitacion> habitacionReservadas, String cliente) {
        this.numeroReserva = numeroReserva;
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
        this.habitacionReservadas = habitacionReservadas;
        this.cliente = cliente;
    }

    public List<habitacion> getHabitacionReservadas() {
        return habitacionReservadas;
    }

    public void setHabitacionReservadas(List<habitacion> habitacionReservadas) {
        this.habitacionReservadas = habitacionReservadas;
    }

    
    
    

    /**
     * @return the numeroReserva
     */
    public int getNumeroReserva() {
        return numeroReserva;
    }

    /**
     * @param numeroReserva the numeroReserva to set
     */
    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    /**
     * @return the fechaLlegada
     */
    public int getFechaLlegada() {
        return fechaLlegada;
    }

    /**
     * @param fechaLlegada the fechaLlegada to set
     */
    public void setFechaLlegada(int fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    /**
     * @return the fechaSalida
     */
    public int getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(int fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }   
    
      public void agregarHabitacion(habitacion habitacion) {
        
    }

    public void eliminarHabitacion(habitacion habitacion) {
        
    }
}
