public class Circulo {
    // Atributos
    private double radio;

    // constructor de la clase: nos permite crear objetos de la clase Circulo
    // El metodo contructor se llama igual que la clase
    public Circulo(double radio) {
        this.radio = radio;// this hace referencia al atributo de la clase
    }

    // Metodos
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double calcularArea() {
        return Math.PI * (radio * radio);// Math,PI* Math.POW(radio,2)
    }
}
