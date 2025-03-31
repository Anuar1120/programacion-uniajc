public class Ejercicio411{
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicitar al usuario que ingrese la operación
        System.out.print("Seleccione la operación (+: Suma, -: Resta, *: Multiplicación, /: División): ");
        String seleccionOp = scanner.next();  // Usamos String en lugar de entero

        // Variable para almacenar el resultado de la operación
        double resultado = 0;

        // Seleccionar la operación según el valor de seleccionOp
        if (seleccionOp.equals("+")) {
            // Suma
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (seleccionOp.equals("-")) {
            // Resta
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
        } else if (seleccionOp.equals("*")) {
            // Multiplicación
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
        } else if (seleccionOp.equals("/")) {
            // División
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("El resultado de la división es: " + resultado);
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
            }
        } else {
            System.out.println("Operación no válida.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}















package Clase7;

import java.util.Scanner;

public class Ejercicio411{
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicitar al usuario que ingrese la operación
        System.out.print("Seleccione la operación (+: Suma, -: Resta, *: Multiplicación, /: División): ");
        String seleccionOp = scanner.next();  // Usamos String en lugar de entero

        // Variable para almacenar el resultado de la operación
        double resultado = 0;

        // Seleccionar la operación según el valor de seleccionOp
        if (seleccionOp.equals("+")) {
            // Suma
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (seleccionOp.equals("-")) {
            // Resta
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
        } else if (seleccionOp.equals("*")) {
            // Multiplicación
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
        } else if (seleccionOp.equals("/")) {
            // División
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("El resultado de la división es: " + resultado);
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
            }
        } else {
            System.out.println("Operación no válida.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
