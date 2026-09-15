package TareasProgramacion3;

import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] A = new int[10];
        Random rand = new Random();
        int contPares = 0, contImpares = 0;

        // Llenar A y contar pares e impares
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(100) + 1;
            if (A[i] % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }
        }

        int[] pares = new int[contPares];
        int[] impares = new int[contImpares];
        int p = 0, im = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                pares[p++] = A[i];
            } else {
                impares[im++] = A[i];
            }
        }

        // Mostrar resultados
        System.out.println("Arreglo A: ");
        imprimirArreglo(A);

        System.out.println("Pares: ");
        imprimirArreglo(pares);

        System.out.println("Impares: ");
        imprimirArreglo(impares);
    }

    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}