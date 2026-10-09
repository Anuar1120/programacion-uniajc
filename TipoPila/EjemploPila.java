import java.io.BufferedReader;
import java.io.InputStreamReader;

class EjemploPila {
    public static void main(String[] a) {
        PilaLineal pila;
        int x;
        final int CLAVE = -1;

        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Teclea los elementos (termina con -1).");
        try {
            pila = new PilaLineal();          // crea pila vacía
            do {
                x = Integer.parseInt(entrada.readLine());
                pila.insertar(x);
            } while (x != CLAVE);

            System.out.println("Elementos de la Pila: ");
            while (!pila.pilaVacia()) {
                x = pila.quitar();
                System.out.print(x + " ");
            }
            System.out.println();
        } catch (Exception er) {
            System.err.println("Excepcion: " + er);
        }
    }
}
