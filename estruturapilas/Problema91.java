package estruturapilas;

    /**
 * Problema 9.1: copiarPila() copia el contenido de una pila en otra
 * usando solo las operaciones del TAD Pila.
 */
public class Problema91 {

    public static <T> void copiarPila(Pila<T> fuente, Pila<T> destino) {
        destino.vaciar();
        Pila<T> aux = new Pila<>();
        while (!fuente.esVacia()) {
            aux.push(fuente.pop());
        }
        while (!aux.esVacia()) {
            T x = aux.pop();
            fuente.push(x);     // restaura la fuente
            destino.push(x);    // llena el destino con el mismo orden
        }
    }

    public static void main(String[] args) {
        Pila<Integer> origen = new Pila<>();
        Pila<Integer> copia = new Pila<>();
        for (int i = 1; i <= 5; i++) origen.push(i * 10);

        copiarPila(origen, copia);
        System.out.println("Fuente : " + origen);
        System.out.println("Destino: " + copia);
    }
}

