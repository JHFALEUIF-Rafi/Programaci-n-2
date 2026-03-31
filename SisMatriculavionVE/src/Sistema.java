import java.util.Scanner;

public class Sistema {

    Scanner sc;

    public Sistema() {
        sc = new Scanner(System.in);
    }

    public Vehiculo crearVehiculo() {
        System.out.println("###INGRESE LOS DATOS DEL VEHICULO###");
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Placa: ");
        String placa = sc.nextLine();
        System.out.println("Numero de ruedas: ");
        int numeroRuedas = sc.nextInt();
        System.out.println("Cilindraje: ");
        double cilindraje = sc.nextDouble();
        System.out.println("Combustible: 1.Gasolina / 2.Diesel");
        int combustible = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        Duenio duenio = crearDuenio();
        Vehiculo vehiculo = new Vehiculo(marca, modelo, placa, numeroRuedas, cilindraje, combustible, duenio);
        return vehiculo;
    }

    public Duenio crearDuenio() {
        System.out.println("###INGRESE LOS DATOS DEL DUENIO###");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Cedula: ");
        int cedula = sc.nextInt();
        System.out.println("Telefono:");
        String telefono = sc.next();
        Duenio duenio = new Duenio(nombre, telefono, cedula);
        return duenio;
    }

    public void imprimirDuenio(Duenio duenio) {
        System.out.println("DATOS DEL DUENIO");
        System.out.println("Nombre: " + duenio.getNombre());
        System.out.println("Cedula: " + duenio.getCedula());
        System.out.println("Telefono: " + duenio.getTelefono());
    }

    public void imprimirVehiculo(Vehiculo vehiculo) {
        System.out.println("DATOS DEL VEHICULO");
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Placa: " + vehiculo.getPlaca());
        System.out.println("Numero de ruedas: " + vehiculo.getNumeroRuedas());
        System.out.println("Cilindraje: " + vehiculo.getCilindraje());
        System.out.println("Combustible: " + vehiculo.getCombustible());
        System.out.println("\n--- DUEÑO DEL VEHICULO ---");
        imprimirDuenio(vehiculo.getDuenio());
    }
}
