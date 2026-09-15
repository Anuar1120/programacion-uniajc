package TareasProgramacion3;

public class Ejercicio23 {
    public static void main(String[] args) {
        int[][] matriz = {
            {-5, 12, -3},
            {8, -19, 4},
            {1, 0, -15}
        };


        int filas = matriz.length;
        int[] mayorAbsoluto = new int[filas];

        for (int i = 0; i < filas; i++) {
            int maxAbs = Math.abs(matriz[i][0]);
            for (int j = 1; j < matriz[i].length; j++) {
                int actualAbs = Math.abs(matriz[i][j]);
                if (actualAbs > maxAbs) {
                    maxAbs = actualAbs;
                }
            }
            
            mayorAbsoluto[i] = maxAbs;
        }

        System.out.print("Mayores valores absolutos por fila: ");
        for (int val : mayorAbsoluto) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}