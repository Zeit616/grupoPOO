package hotelProyecto;

/*
 * @Autores
 * Ivan Alejandro Noriega Llerena
 * Bruno
 * Daniel
*/
public class conserje extends empleado{
    
     //atributos
    private int habitacionesParaLimpiar;

    public conserje(int habitacionesParaLimpiar, int edentificacionID, String cargo, String habitacionesAsignadas, hotelProyecto.hotel hotel, String nombre, String apellido) {
        super(edentificacionID, cargo, habitacionesAsignadas, hotel, nombre, apellido);
        this.habitacionesParaLimpiar = habitacionesParaLimpiar;
    }

    public int getHabitacionesParaLimpiar() {
        return habitacionesParaLimpiar;
    }

    public void setHabitacionesParaLimpiar(int habitacionesParaLimpiar) {
        this.habitacionesParaLimpiar = habitacionesParaLimpiar;
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
    public void limpiarHabitacion(){
    }
    
    public void atenderSolicitud(){
    }
    
    public void resolverSolicitud(){
    }
    
}
