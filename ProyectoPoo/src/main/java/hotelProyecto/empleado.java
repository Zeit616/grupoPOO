package hotelProyecto;

/*
 * @Autores
 * Ivan Alejandro Noriega Llerena
 * Bruno
 * Daniel
*/
public class empleado extends persona{
    
     //atributos
    private int edentificacionID;
    private String cargo;
    private String habitacionesAsignadas; 
    private hotel hotel;

    public empleado(int edentificacionID, String cargo, String habitacionesAsignadas, hotel hotel, String nombre, String apellido) {
        super(nombre, apellido);
        this.edentificacionID = edentificacionID;
        this.cargo = cargo;
        this.habitacionesAsignadas = habitacionesAsignadas;
        this.hotel = hotel;
    }

   

    

    public int getEdentificacionID() {
        return edentificacionID;
    }

    public void setEdentificacionID(int edentificacionID) {
        this.edentificacionID = edentificacionID;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHabitacionesAsignadas() {
        return habitacionesAsignadas;
    }

    public void setHabitacionesAsignadas(String habitacionesAsignadas) {
        this.habitacionesAsignadas = habitacionesAsignadas;
    }

    public hotel getHotel() {
        return hotel;
    }

    public void setHotel(hotel hotel) {
        this.hotel = hotel;
    }
    
       @Override
    public void setNombre(String nombre) {
        // Agregar aquí cualquier validación necesaria
        super.setNombre(nombre);
    }
    
    @Override
    public void setApellido(String apellido) {
        // Agregar aquí cualquier validación necesaria
        super.setApellido(apellido);
    }
    
    
    
    //metodos
    public void asignarHabitacion(){
    
    }
    
    public void liberarHabitacion(){
    
    }
    
    
}
