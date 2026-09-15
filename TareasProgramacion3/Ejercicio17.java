package TareasProgramacion3;

public class Ejercicio17 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Suma de las filas
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma de la fila " + i + ": " + sumaFila);
        }

        System.out.println();

        // Suma de las columnas
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < filas; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma de la columna " + j + ": " + sumaColumna);
        }
    }
}