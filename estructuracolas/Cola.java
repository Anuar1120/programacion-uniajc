package estructuracolas;

public class Cola <T> {
    private static class Nodo<T> {
        T dato;
        Nodo<T> sig;

        Nodo(T dato) {
            this.dato = dato;
        }
    }

    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tam;

    public void encolar(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        if (ultimo == null) {
            primero = nuevo;
        } else {
            ultimo.sig = nuevo;
        }
        ultimo = nuevo;
        tam++;
    }

    public T desencolar() {
        if (esVacia()) {
            throw new RuntimeException("Cola vacia");
        }
        T dato = primero.dato;
        primero = primero.sig;
        if (primero == null) {
            ultimo = null;
        }
        tam--;
        return dato;
    }

    public T frente() {
        if (esVacia()) {
            throw new RuntimeException("Cola vacia");
        }
        return primero.dato;
    }

    public boolean esVacia() {
        return primero == null;
    }

    public int tamano() {
        return tam;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Nodo<T> actual = primero;
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.sig != null) {
                sb.append(", ");
            }
            actual = actual.sig;
        }
        return sb.append("]").toString();
    }
    
}
