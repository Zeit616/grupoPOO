package hotelProyecto;

import java.util.List;

/*
 * @Autores
 * Ivan Alejandro Noriega Llerena
 * Bruno
 * Daniel
*/
public class hotel {
    
     //atributos
    public String nombre;
    public String direccion;
    public int telefono;
    private List<empleado>cantidadEmpleados;    
    private List<habitacion>cantidadHabitaciones;    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    public hotel(String nombre, String direccion, int telefono, List<empleado>cantidadEmpleados, List<habitacion> cantidadHabitaciones) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantidadEmpleados = cantidadEmpleados;
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    
    
    

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<empleado> getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(List<empleado> cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    

    public List<habitacion> getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(List<habitacion> cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

   
}
