public class Ejercicio4punto1C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.print("Ingrese un numero");
        int numero = scanner.nextInt();
        if (numero > 0) {

            total += numero;
        } else {
            total -= numero;
        }

        System.out.println("El total es:" + total);
        scanner.close();

    }

}
