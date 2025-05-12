package clase12;

public class Telefono {

    // Atributos modificados
    private String marca;
    private String modelo;
    private String color;
    private String tamañoDePantalla;
    private String referencia;
    private String dimensiones;
    private String almacenamiento; // Cambio de tipo de int a String
    private int bateria;
    private String memoria;
    private double precio; // Nuevo atributo
    private String camara; // Nuevo atributo

    // Constructor modificado
    public Telefono(String marca, String modelo, String color, String tamañoDePantalla,
            String referencia, String dimensiones, String almacenamiento,
            int bateria, String memoria, double precio, String camara) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tamañoDePantalla = tamañoDePantalla;
        this.referencia = referencia;
        this.dimensiones = dimensiones;
        this.almacenamiento = almacenamiento;
        this.bateria = bateria;
        this.memoria = memoria;
        this.precio = precio; // Inicializando el nuevo atributo
        this.camara = camara; // Inicializando el nuevo atributo
    }

    // Métodos modificados
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Tamaño de Pantalla: " + tamañoDePantalla);
        System.out.println("Referencia: " + referencia);
        System.out.println("Dimensiones: " + dimensiones);
        System.out.println("Almacenamiento: " + almacenamiento); // Cambiado para mostrar String
        System.out.println("Batería: " + bateria + " mAh");
        System.out.println("Memoria RAM: " + memoria);
        System.out.println("Precio: " + precio + " USD"); // Mostrando el precio
        System.out.println("Cámara: " + camara); // Mostrando la cámara
    }

    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("Color cambiado a: " + color);
    }

    public void cargarTelefono(int carga) {
        bateria += carga;
        System.out.println("Teléfono cargado. Batería actual: " + bateria + " mAh");
    }

    public void actualizarAlmacenamiento(String nuevoAlmacenamiento) {
        this.almacenamiento = nuevoAlmacenamiento;
        System.out.println("Almacenamiento actualizado a: " + almacenamiento);
    }
}
