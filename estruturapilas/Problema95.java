package estruturapilas;

import java.util.List;
import java.util.Scanner;

public class Problema95 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pila<Integer>> pilas = Problema94.crearPilas(Problema94.N);

        System.out.println("Introduce triplos (i j k). k=-1 vacía la pila, k=0 como en 9.4, i=0 termina.");
        while (true) {
            System.out.print("i j k > ");
            int i = sc.nextInt();
            if (i == 0) break;
            int j = sc.nextInt();
            int k = sc.nextInt();

            if (Math.abs(i) > Problema94.N) {
                System.out.println("  Pila inexistente (1 <= |i| <= " + Problema94.N + ").");
                continue;
            }
            Pila<Integer> p = pilas.get(Math.abs(i) - 1);

            if (k == -1) {
                p.vaciar();
            } else if (k == 0) {
                if (i > 0) p.push(j);
                else if (!Problema94.eliminar(p, j))
                    System.out.println("  El elemento " + j + " no está en P" + Math.abs(i));
            } else {
                System.out.println("  Valor de k no válido (solo -1 o 0).");
            }
        }
        Problema94.mostrar(pilas);
    }
}