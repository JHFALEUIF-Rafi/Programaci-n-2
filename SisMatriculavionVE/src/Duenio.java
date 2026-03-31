public class Duenio {

    private String nombre;
    private String telefono;
    private int cedula;


    public Duenio(String nombre, String telefono, int cedula) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
    }

    public Duenio(Duenio duenio){
        this.nombre = duenio.nombre;
        this.cedula = duenio.cedula;
    }

   public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
