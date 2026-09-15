package TareasProgramacion3;

public class Ejercicio19 {
    public static void main(String[] args) {
        int n = 4; // El tamaño de la matriz n x n
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1; // Diagonal principal
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("--- MATRIZ IDENTIDAD ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}