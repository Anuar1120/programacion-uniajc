/**
 * TAD Pila (LIFO) implementada con nodos enlazados.
 */
public class Pila<T> {

    private static class Nodo<T> {
        T dato;
        Nodo<T> sig;

        Nodo(T dato, Nodo<T> sig) {
            this.dato = dato;
            this.sig = sig;
        }
    }

    private Nodo<T> cima;
    private int tam;

    public void push(T elemento) {
        cima = new Nodo<>(elemento, cima);
        tam++;
    }

    public T pop() {
        if (esVacia()) throw new RuntimeException("Pila vacía");
        T dato = cima.dato;
        cima = cima.sig;
        tam--;
        return dato;
    }

    public T cima() {
        if (esVacia()) throw new RuntimeException("Pila vacía");
        return cima.dato;
    }

    public boolean esVacia() {
        return cima == null;
    }

    public int tamano() {
        return tam;
    }

    public void vaciar() {
        cima = null;
        tam = 0;
    }

    /** Muestra el contenido de base a cima, sin modificar la pila. */
    @Override
    public String toString() {
        java.util.LinkedList<T> tmp = new java.util.LinkedList<>();
        Nodo<T> actual = cima;
        while (actual != null) {
            tmp.addFirst(actual.dato);
            actual = actual.sig;
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tmp.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(tmp.get(i));
        }
        return sb.append("]").toString();
    }
}