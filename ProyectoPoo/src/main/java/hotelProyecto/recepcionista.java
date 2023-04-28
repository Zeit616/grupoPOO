package hotelProyecto;

/*
 * @Autores
 * Ivan Alejandro Noriega Llerena
 * Bruno
 * Daniel
*/

public class recepcionista extends empleado{

    public recepcionista(int edentificacionID, String cargo, String habitacionesAsignadas, hotelProyecto.hotel hotel, String nombre, String apellido) {
        super(edentificacionID, cargo, habitacionesAsignadas, hotel, nombre, apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    

    
    
    
    
    //metodos
    public void hacerReserva(){
    }
    
    public void cancelarReserva(){
    }
    
}