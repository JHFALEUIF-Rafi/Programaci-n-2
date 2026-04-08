public class Duenio {

    private String nombre;
    private String telefono;
    private int cedula;
    private int anio;
    private int mes;
    private int dia;


    public Duenio(String nombre, String telefono, int cedula) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
    }

    public Duenio(String nombre, String telefono, int cedula, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public Duenio(Duenio duenio){
        this.nombre = duenio.nombre;
        this.cedula = duenio.cedula;
    }


    public int calcularEdad(){
        int anioActual = 2026;
        int mesActual = 4;
        int diaActual = 7;

        int fechaActualDias = anioActual * 365 + mesActual * 30 + diaActual;
        int fechaNacimientoDias = this.anio * 365 + this.mes * 30 + this.dia;
        int edadDias = fechaActualDias - fechaNacimientoDias;

        int edad = edadDias / 365;
        return edad;
    }

    public int calcularEdad(int anioActual, int mesActual, int diaActual){
        int fechaActualDias = anioActual * 365 + mesActual * 30 + diaActual;
        int fechaNacimientoDias = this.anio * 365 + this.mes * 30 + this.dia;
        int edadDias = fechaActualDias + fechaNacimientoDias;
        int edad = edadDias / 365;
        return edad;
    }

    public void setFechaNacimiento(int anio, int mes, int dia){
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
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