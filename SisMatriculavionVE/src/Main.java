public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Sistema sis = new Sistema();


        Vehiculo v1 = sis.crearVehiculo();
        sis.imprimirVehiculo(v1);
        sis.imprimirAceleracion(v1);

        Vehiculo v2 = sis.crearVehiculo();
        sis.imprimirVehiculo(v2);
        sis.imprimirAceleracion(v2);


    }
}
