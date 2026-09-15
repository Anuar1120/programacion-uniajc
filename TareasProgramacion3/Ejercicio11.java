package TareasProgramacion3;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] A = {-5, 0, 3, -1, 0, 8, 4, -2};
        int cNeg = 0, cCero = 0, cPos = 0;

        for (int num : A) {
            if (num < 0) cNeg++;
            else if (num == 0) cCero++;
            else cPos++;
        }

        int[] negativos = new int[cNeg];
        int[] ceros = new int[cCero];
        int[] positivos = new int[cPos];

        int iNeg = 0, iCero = 0, iPos = 0;
        for (int num : A) {
            if (num < 0) negativos[iNeg++] = num;
            else if (num == 0) ceros[iCero++] = num;
            else positivos[iPos++] = num;
        }

        System.out.println("Negativos procesados: " + cNeg);
        System.out.println("Ceros procesados: " + cCero);
        System.out.println("Positivos procesados: " + cPos);
    }
}