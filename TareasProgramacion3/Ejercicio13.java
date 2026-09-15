package TareasProgramacion3;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50, 60};
        int suma = 0;

        for (int num : A) {
            suma += num;
        }
        double media = (double) suma / A.length;

        int cMayores = 0, cMenores = 0;
        for (int num : A) {
            if (num > media) cMayores++;
            else if (num < media) cMenores++;
        }

        int[] mayores = new int[cMayores];
        int[] menores = new int[cMenores];
        int iMay = 0, iMen = 0;

        for (int num : A) {
            if (num > media) mayores[iMay++] = num;
            else if (num < media) menores[iMen++] = num;
        }

        System.out.println("Media: " + media);
        System.out.print("Mayores que la media: ");
        for (int num : mayores) System.out.print(num + " ");
        System.out.println();
        System.out.print("Menores que la media: ");
        for (int num : menores) System.out.print(num + " ");
        System.out.println();
    }
}
