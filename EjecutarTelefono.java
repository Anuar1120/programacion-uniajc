import clase12.Telefono;

public class EjecutarTelefono {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Escenario 1 con nuevos atributos
        System.out.println("--------------Escenario 1-----------------------------");
        Telefono tel1 = new Telefono("Xiaomi", "Recmi Note 13", "Blanco", "6.7 pulgadas",
                "1234567890ABC", " 162.24mm x 75.55mm x 7.97mm ", "256GB", 5000, "16GB", 599.990, "108MP");

        tel1.mostrarInformacion();
        tel1.cambiarColor("negro");
        tel1.cargarTelefono(6000);
        tel1.actualizarAlmacenamiento("1TB");

        // Escenario 2 con nuevos atributos
        System.out.println("--------------Escenario 2-----------------------------");
        final Telefono tel2 = new Telefono("Apple", "iPhone 14", "Rojo", "6.1 pulgadas",
                "A2881", "71.5 x 146.7 x 7.80 mm", "128GB", (int) 3.279, "16GB", 729.99, "12MP");
        tel2.mostrarInformacion();
        tel2.cambiarColor("Amarillo");
        tel2.cargarTelefono(300);
        tel2.actualizarAlmacenamiento("512GB");
    }
}