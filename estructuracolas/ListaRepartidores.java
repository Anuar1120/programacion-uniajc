package estructuracolas;

public class ListaRepartidores {
    private static class Nodo {
        Repartidor dato;
        Nodo sig;

        Nodo(Repartidor dato) {
            this.dato = dato;
        }
    }

    private Nodo cabeza;
    private int tam;

    public void insertarFinal(Repartidor r) {
        Nodo nuevo = new Nodo(r);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = nuevo;
        }
        tam++;
    }

    /**
     * Devuelve el repartidor con ese numero de seguridad social, o null si no esta.
     */
    public Repartidor buscar(String numSS) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato.numSS.equals(numSS)) {
                return actual.dato;
            }
            actual = actual.sig;
        }
        return null;
    }

    public int tamano() {
        return tam;
    }

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("  (lista vacia)");
            return;
        }
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println("  - " + actual.dato);
            actual = actual.sig;
        }
    }
}
