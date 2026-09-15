package TareasProgramacion3;

public class Ejercicio22 {
    public static void main(String[] args) {
        int[][] matriz = {
            {12, 45, 3},
            {89, 23, 56},
            {7, 34, 90}
        };
        // Tomamos el primer elemento como punto de partida para las comparaciones
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        int fMayor = 0, cMayor = 0;
        int fMenor = 0, cMenor = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                // Actualizamos si encontramos un valor superior al actual
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    fMayor = i;
                    cMayor = j;
                }
                // Actualizamos si encontramos un valor inferior al actual
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    fMenor = i;
                    cMenor = j;
                }
            }
        }

        System.out.println("Elemento mayor: " + mayor + " (Fila: " + fMayor + ", Columna: " + cMayor + ")");
        System.out.println("Elemento menor: " + menor + " (Fila: " + fMenor + ", Columna: " + cMenor + ")");
    }
}