package TareasProgramacion3;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] A = {4, 6, 8, 2, 6, 9, 6, 1};
        int x = 6;
        int count = 0;

        // Contar cuántas veces aparece X para dimensionar B
        for (int nume : A) {
            if (nume == x) count++;
        }

        int[] B = new int[count];
        int indexB = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                B[indexB++] = i + 1; // Posición basada en 1
            }
        }

        System.out.print("Arreglo B (Posiciones): ");
        for (int pos : B) {
            System.out.print(pos + " ");
        }
        System.out.println();
    }
}