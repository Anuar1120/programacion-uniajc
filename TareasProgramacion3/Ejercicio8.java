package TareasProgramacion3;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[30];

        System.out.println("Ingrese 30 números enteros:");
        for (int i = 0; i < 30; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < 30; i++) {
            if (numeros[i] > mayor) mayor = numeros[i];
            if (numeros[i] < menor) menor = numeros[i];
        }

        int contMayor = 0, contMenor = 0;
        for (int i = 0; i < 30; i++) {
            if (numeros[i] == mayor) contMayor++;
            if (numeros[i] == menor) contMenor++;
        }

        System.out.println("\nNúmero mayor: " + mayor + " (Se repite " + contMayor + " veces)");
        System.out.println("Número menor: " + menor + " (Se repite " + contMenor + " veces)");
        scanner.close();
    }
}