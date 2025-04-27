public class Main {
    public static void main(String[] args) {
      OperacionesMatematicas operaciones = new OperacionesMatematicas();

      int a = 10;
      int b = 5;

      System.out.println("Suma: " + operaciones.sumar(a, b));
      System.out.println("Resta: " + operaciones.restar(a, b));
      System.out.println("Multiplicación: " + operaciones.multiplicar(a, b));
      System.out.println("División: " + operaciones.dividir(a, b));
    }
}
