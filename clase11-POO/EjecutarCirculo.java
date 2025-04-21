public class EjecutarCirculo {
    public static void main(String[] args) {
        double r = 2.3; // radio

        // Creacion del objeto
        Circulo objCirculo1 = new Circulo(r);
        System.out.println("El perimetro es: " + objCirculo1.calcularPerimetro());

        System.out.println("El area es: " + objCirculo1.calcularArea());

    }
}