package Clase7;

import java.util.Scanner;

public class Ejercicio410 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Digite la calificación: ");

        int nota = leer.nextInt();

        if (nota < 0 || nota > 100) {
            System.out.println("Número fuera de rango");
        } else {
            if (nota >= 90 && nota <= 100) {
                System.out.println("A");
            } else {
                if (nota >= 80 && nota < 90) {
                    System.out.println("B");
                } else {
                    if (nota >= 70 && nota < 80) {
                        System.out.println("C");
                    } else {
                        if (nota >= 69 && nota < 70) {
                            System.out.println("D");
                        } else {
                            System.out.println("F");
                        }
                    }
                }
            }
        }

        leer.close();
    }
}