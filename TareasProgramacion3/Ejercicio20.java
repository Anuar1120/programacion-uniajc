package TareasProgramacion3;

public class Ejercicio20 {
    public static void main(String[] args) {
        int n = 10;
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    matriz[i][j] = 0; // Ceros en la diagonal principal y hacia arriba
                } else {
                    matriz[i][j] = (i + j); // Los valores arbitrarios abajo para distinguirlo
                }
            }
        }

        System.out.println("--- MATRIZ (Ceros en diagonal y arriba) ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}