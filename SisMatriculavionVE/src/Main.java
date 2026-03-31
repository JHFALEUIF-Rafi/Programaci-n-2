public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        
        // Crear un vehículo con sus datos y los del dueño
        Vehiculo vehiculo = sistema.crearVehiculo();
        
        // Imprimir los datos del vehículo y del dueño
        System.out.println("\n========================================");
        sistema.imprimirVehiculo(vehiculo);
        System.out.println("========================================\n");
    }
}
