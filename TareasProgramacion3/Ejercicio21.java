package TareasProgramacion3;

public class Ejercicio21 {
    public static void main(String[] args) {
        int[][] matriz = {
            {2, 5, 8},
            {3, 4, 6},
            {1, 9, 2}
        };

        int filas = matriz.length;
        int[] vectorB = new int[filas];

        for (int i = 0; i < filas; i++) {
            int sumaPares = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    sumaPares += matriz[i][j];
                }
            }
            vectorB[i] = sumaPares;
        }

        System.out.print("Vector B (Suma de pares por fila): ");
        for (int val : vectorB) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}