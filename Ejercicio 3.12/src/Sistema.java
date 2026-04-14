public class Sistema {

    public void ejecutar(){
        Factura f1 = new Factura("A156", "Tornillos", 25, 7.59);
        Factura f2 = new Factura("B6789", "Taladro", 1, 38.56);

        System.out.println("=== FACTURA 1 ===");
        System.out.println(f1);

        System.out.println("\n=== FACTURA 2 ===");
        System.out.println(f2);
    }
}
