

public class PilaLineal {
    private static final int TAMAPILA = 100;   // capacidad máxima
    private int cima;                          // índice del último elemento
    private int[] listaPila;

    // Crea una pila vacía
    public PilaLineal() {
        cima = -1;
        listaPila = new int[TAMAPILA];
    }

    // Operaciones de consulta
    public boolean pilaVacia() {
        return cima == -1;
    }

    public boolean pilaLlena() {
        return cima == TAMAPILA - 1;
    }
    // Añade un elemento en la cima
    public void insertar(int elemento) throws Exception {
        if (pilaLlena())
            throw new Exception("Desbordamiento pila");
        listaPila[++cima] = elemento;
    }

    // Quita y devuelve el elemento de la cima
    public int quitar() throws Exception {
        if (pilaVacia())
            throw new Exception("Pila vacia, no se puede extraer.");
        return listaPila[cima--];
    }

    // Devuelve el elemento de la cima sin quitarlo
    public int cimaPila() throws Exception {
        if (pilaVacia())
            throw new Exception("Pila vacia, no hay elemento cima.");
        return listaPila[cima];
    }

    // Vacía la pila
    public void limpiarPila() {
        cima = -1;
    }
}