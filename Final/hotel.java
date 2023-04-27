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
public class hotel {
    
     //atributos
    public String nombre;
    public String direccion;
    public int telefono;
    private int cantidadEmpleados;
    private int cantidadHabitaciones;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
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

    /**
     * @return the cantidadEmpleados
     */
    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    /**
     * @param cantidadEmpleados the cantidadEmpleados to set
     */
    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    /**
     * @return the cantidadHabitaciones
     */
    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    /**
     * @param cantidadHabitaciones the cantidadHabitaciones to set
     */
    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }  
}
