package TareasProgramacion3;

public class Ejercicio18 {
    public static void main(String[] args) {
        int[][] tabla = new int[10][10];

        // Llenar la matriz con las tablas de multiplicar (1 al 10)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }

        // Imprimir la tabla
        System.out.println("--- TABLAS DE MULTIPLICAR (1 al 10) ---");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
    }
}