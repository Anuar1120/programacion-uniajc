package estruturapilas;

    /**
 * Lista enlazada circular de caracteres.
 * 'ultimo' apunta al último nodo y ultimo.sig es el primero.
 */
public class ListaCircular {

    private static class Nodo {
        char dato;
        Nodo sig;

        Nodo(char dato) {
            this.dato = dato;
        }
    }

    private Nodo ultimo;

    public boolean esVacia() {
        return ultimo == null;
    }

    public void insertarFinal(char c) {
        Nodo nuevo = new Nodo(c);
        if (ultimo == null) {
            nuevo.sig = nuevo;
        } else {
            nuevo.sig = ultimo.sig;
            ultimo.sig = nuevo;
        }
        ultimo = nuevo;
    }

    public char extraerPrimero() {
        if (ultimo == null) throw new RuntimeException("Lista vacía");
        Nodo primero = ultimo.sig;
        char c = primero.dato;
        if (primero == ultimo) ultimo = null;
        else ultimo.sig = primero.sig;
        return c;
    }
}
    
