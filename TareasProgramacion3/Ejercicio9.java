package TareasProgramacion3;

public class Ejercicio9 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arreglo = {4, 2, 8, 5, 2, 9, 2, 1, 6};
        int objetivo = 2;
        int contador = 0;

        for (int num : arreglo) {
            if (num == objetivo) {
                contador++;
            }
        }

        System.out.println("El número " + objetivo + " se encuentra " + contador + " veces en el arreglo.");
    }
}