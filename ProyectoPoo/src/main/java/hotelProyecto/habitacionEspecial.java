package hotelProyecto;

/*
 * @Autores
 * Ivan Alejandro Noriega Llerena
 * Bruno
 * Daniel
*/
public class habitacionEspecial extends habitacion{  //sobreescritura de metodos
    
    //atributos
    private String tipoDeCama;
    private String jacuzzi;    

    

    public habitacionEspecial(String tipoDeCama, String jacuzzi, int numeroDehabitacion, String tipoHabitacion, int capacidadMaxima, int precio, String estado, hotelProyecto.hotel hotel) {
        super(numeroDehabitacion, tipoHabitacion, capacidadMaxima, precio, estado, hotel);
        this.tipoDeCama = tipoDeCama;
        this.jacuzzi = jacuzzi;
    }

    public habitacionEspecial(String tipoDeCama, String jacuzzi, int _precio, String _estado) {
        super(_precio, _estado);
        this.tipoDeCama = tipoDeCama;
        this.jacuzzi = jacuzzi;
    }

    public String getTipoDeCama() {
        return tipoDeCama;
    }

    public void setTipoDeCama(String tipoDeCama) {
        this.tipoDeCama = tipoDeCama;
    }

    public String getJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(String jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    

   
}

