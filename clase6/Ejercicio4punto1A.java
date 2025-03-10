import java.util.Scanner;

public class Ejercicio4punto1A {
    public static void main(String[] args) {
        // datos por teclado
        Scanner leer = new Scanner(System.in);

        // se declara la variable o las variables
        double angulo;

        // solicitar por teclado el angulo para validacion
        System.out.println("Digite el angulo");
        angulo = leer.nextInt();

        // Solicitar por teclado el angulo para su validacion
        if (angulo == 90) {
            System.out.print("El angulo es un angulo recto");

        } else {
            System.out.println("El angulo no es un angulo recto");

        }
        leer.close();

    }
}