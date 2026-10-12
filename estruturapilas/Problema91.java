package estruturapilas;

public class Problema91 {

    public static <T> void copiarPila(Pila<T> fuente, Pila<T> destino) {
        destino.vaciar();
        Pila<T> aux = new Pila<>();
        while (!fuente.esVacia()) {
            aux.push(fuente.pop());
        }
        while (!aux.esVacia()) {
            T x = aux.pop();
            fuente.push(x);
            destino.push(x);
        }
    }

    public static void main(String[] args) {
        Pila<Integer> origen = new Pila<>();
        Pila<Integer> copia = new Pila<>();
        for (int i = 1; i <= 5; i++)
            origen.push(i * 10);

        copiarPila(origen, copia);
        System.out.println("Fuente : " + origen);
        System.out.println("Destino: " + copia);
    }
}
