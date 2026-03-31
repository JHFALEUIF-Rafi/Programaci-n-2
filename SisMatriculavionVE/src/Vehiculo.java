public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int numeroRuedas;
    private double cilindraje;
    private int combustible;
    private Duenio duenio;

    public Vehiculo(String marca, String modelo, String placa, int numeroRuedas, double cilindraje, int combustible, Duenio duenio) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.numeroRuedas = numeroRuedas;
        this.cilindraje = cilindraje;
        this.combustible = combustible;
        this.duenio = duenio;
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

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
}
