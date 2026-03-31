import java.util.Scanner;

public class Sistema {

    Scanner sc;

    public Sistema(){
        sc = new Scanner(System.in);
    }

    public Vehiculo crearVehiculo(){
        System.out.println("Ingrese los datos del vehículo:");
        System.out.print("Marca: ");
        String marca = sc.next();
        System.out.print("Modelo: ");
        String modelo = sc.next();
        System.out.print("Placa: ");
        String placa = sc.next();
        System.out.print("Numero de ruedas: ");
        int numRuedas = sc.nextInt();
        System.out.print("Cilindraje: ");
        double cilindraje = sc.nextDouble();
        System.out.print("Torque: ");
        double torque = sc.nextDouble();
        System.out.print("Combustible 1.Gasolina/2.Diesel : ");
        int tipoCombustible = sc.nextInt();
        Duenio duenio = this.crearDuenio();
        Vehiculo vehiculo = new Vehiculo(marca,modelo,placa,numRuedas,
                                          cilindraje,torque,tipoCombustible,duenio);
        return vehiculo;
    }


    public Duenio crearDuenio(){
        System.out.println("Ingrese los datos del Dueño:");
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Cédula: ");
        int cedula = sc.nextInt();
        System.out.print("Teléfono: ");
        String telefono = sc.next();
        Duenio duenio = new Duenio(nombre,telefono,cedula);
        return duenio;
    }


    public void imprimirDuenio(Duenio duenio){
        System.out.println("Datos del Dueño:");
        System.out.println("Nombre: " + duenio.getNombre());
        System.out.println("Cédula: " + duenio.getCedula());
        System.out.println("Teléfono: " + duenio.getTelefono());
    }

    public void imprimirVehiculo(Vehiculo vehiculo){
        System.out.println("Información Vehículo:");
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Placa: " + vehiculo.getMarca());
        System.out.println("Numero Ruedas: " + vehiculo.getNumRuedas());
        System.out.println("Cilindraje: " + vehiculo.getCilindraje());
        System.out.println("Torque: " + vehiculo.getTorque());
        System.out.println("Combustible: " + (vehiculo.getTipoCombustible()==1 ? "Gasolina" : "Diesel"));
        this.imprimirDuenio(vehiculo.getDuenio());
    }

    public void imprimirAceleracion(Vehiculo vehiculo){
        double accV = vehiculo.aceleracion();
        System.out.println("La aceleración del vehículo es: " + accV);
    }



}