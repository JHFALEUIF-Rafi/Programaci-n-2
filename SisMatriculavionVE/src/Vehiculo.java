public class Vehiculo {

    private String marca;
    private String modelo;
    private String placa;
    private int numRuedas;
    private double cilindraje;
    private double torque;
    private int tipoCombustible; //1.Gasolina, 2.Diesel
    private Duenio duenio;



    public Vehiculo(String marca, String modelo, String placa,
                    int numRuedas, double cilindraje, double torque, int tipoCombustible,
                    String nombreDuenio, String telefonoDuenio, int cedulaDuenio){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.numRuedas = numRuedas;
        this.cilindraje = cilindraje;
        this.torque = torque;
        this.tipoCombustible = tipoCombustible;
        this.duenio = new Duenio(nombreDuenio,telefonoDuenio,cedulaDuenio);
    }

    public Vehiculo(String marca, String modelo, String placa,
                    int numRuedas, double cilindraje, double torque, int tipoCombustible,
                    Duenio duenio){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.numRuedas = numRuedas;
        this.cilindraje = cilindraje;
        this.torque = torque;
        this.tipoCombustible = tipoCombustible;
        this.duenio = duenio;
    }

    public Vehiculo(){

    }


    double aceleracion(){
        double acc;
        if(tipoCombustible==1){
            acc = cilindraje * torque * 2;
        }else{
            acc = cilindraje * torque;
        }
        return acc;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public int getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(int tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
}
