package TareasProgramacion3;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] A = {8, 5, 3, 10, 2, 8, 1};
        int n = A.length;
        int mitad = (n + 1) / 2;
        int[] B = new int[mitad];

        for (int i = 0; i < mitad; i++) {
            if (i == n - 1 - i) {
                B[i] = A[i]; // Elemento central si la longitud es impar
            } else {
                B[i] = A[i] + A[n - 1 - i];
            }
        }

        System.out.print("Arreglo B (Suma de opuestos): ");
        for (int num : B) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}