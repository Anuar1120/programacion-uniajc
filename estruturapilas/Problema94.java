package estruturapilas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problema94 {

    static final int N = 5;

    public static List<Pila<Integer>> crearPilas(int n) {
        List<Pila<Integer>> pilas = new ArrayList<>();
        for (int i = 0; i < n; i++) pilas.add(new Pila<>());
        return pilas;
    }

    /** Elimina la primera aparición de 'elem' (desde la cima). */
    public static boolean eliminar(Pila<Integer> pila, int elem) {
        Pila<Integer> aux = new Pila<>();
        boolean encontrado = false;

        while (!pila.esVacia() && !encontrado) {
            int x = pila.pop();
            if (x == elem) encontrado = true;
            else aux.push(x);
        }
        while (!aux.esVacia()) pila.push(aux.pop());
        return encontrado;
    }

    public static void mostrar(List<Pila<Integer>> pilas) {
        System.out.println("\nContenido de las pilas (base -> cima):");
        for (int i = 0; i < pilas.size(); i++) {
            System.out.println("P" + (i + 1) + " = " + pilas.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pila<Integer>> pilas = crearPilas(N);

        System.out.println("Introduce pares (i j). i>0 inserta, i<0 elimina, i=0 termina.");
        while (true) {
            System.out.print("i j > ");
            int i = sc.nextInt();
            if (i == 0) break;
            int j = sc.nextInt();

            if (Math.abs(i) > N) {
                System.out.println("  Pila inexistente (1 <= |i| <= " + N + ").");
                continue;
            }
            Pila<Integer> p = pilas.get(Math.abs(i) - 1);
            if (i > 0) {
                p.push(j);
            } else if (!eliminar(p, j)) {
                System.out.println("  El elemento " + j + " no está en P" + Math.abs(i));
            }
        }
        mostrar(pilas);
    }
}