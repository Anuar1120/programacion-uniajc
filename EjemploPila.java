import java.util.*;

/**
 * EJEMPLO REAL: Pila de platos en la cocina de un restaurante.
 * Estructura: PILA (LIFO - Last In, First Out).
 * El último plato que se apila (el recién lavado) es el primero que se usa.
 */
public class EjemploPila {

    public static void main(String[] args) {

        Stack<String> platos = new Stack<>();

        // ---------- MÉTODOS PROPIOS DE STACK ----------

        // push(): apila un plato en el tope (se lava y se coloca encima)
        platos.push("Plato sopa");
        platos.push("Plato fuerte");
        platos.push("Plato postre");
        platos.push("Plato ensalada");
        System.out.println("1. push() -> " + platos);

        // peek(): ve el tope SIN retirarlo (¿cuál plato está arriba?)
        System.out.println("2. peek() -> Plato en el tope: " + platos.peek());

        // pop(): retira y retorna el tope (el mesero toma un plato)
        String tomado = platos.pop();
        System.out.println("3. pop() -> El mesero tomó: " + tomado);
        System.out.println("   Pila ahora: " + platos);

        // empty(): ¿está vacía la pila?
        System.out.println("4. empty() -> " + platos.empty());

        // search(): posición desde el tope (base 1). Retorna -1 si no existe
        System.out.println("5. search(\"Plato postre\") -> " + platos.search("Plato postre"));
        System.out.println("   search(\"Plato sopa\") -> " + platos.search("Plato sopa"));

        // ---------- MÉTODOS HEREDADOS DE VECTOR / LIST ----------

        System.out.println("6. size() -> " + platos.size());
        System.out.println("7. isEmpty() -> " + platos.isEmpty());
        System.out.println("8. contains(\"Plato fuerte\") -> " + platos.contains("Plato fuerte"));
        System.out.println("9. get(0) / elementAt(1) -> " + platos.get(0) + " / " + platos.elementAt(1));
        System.out.println("10. firstElement() (base) -> " + platos.firstElement());
        System.out.println("11. lastElement() (tope) -> " + platos.lastElement());
        System.out.println("12. indexOf(\"Plato fuerte\") -> " + platos.indexOf("Plato fuerte"));

        platos.add("Plato sopa");                       // equivale a push (sin retornar)
        platos.add("Plato pan");
        System.out.println("13. add() -> " + platos);
        System.out.println("14. lastIndexOf(\"Plato sopa\") -> " + platos.lastIndexOf("Plato sopa"));

        platos.set(1, "Plato fuerte grande");           // reemplaza un elemento
        System.out.println("15. set(1, ...) -> " + platos);

        platos.remove("Plato pan");                     // elimina por objeto
        System.out.println("16. remove(Object) -> " + platos);

        platos.remove(0);                               // elimina por índice
        System.out.println("17. remove(int) -> " + platos);

        platos.addAll(Arrays.asList("Plato entrada", "Plato bebida"));
        System.out.println("18. addAll() -> " + platos);

        System.out.println("19. subList(1,3) -> " + platos.subList(1, 3));

        Object[] arreglo = platos.toArray();
        System.out.println("20. toArray() -> " + Arrays.toString(arreglo));

        // Recorrido con iterator (de la base hacia el tope)
        System.out.print("21. iterator() -> ");
        Iterator<String> it = platos.iterator();
        while (it.hasNext()) System.out.print(it.next() + " | ");
        System.out.println();

        // Recorrido del tope a la base (orden real en que se usarían)
        System.out.print("22. Tope a base -> ");
        for (int i = platos.size() - 1; i >= 0; i--) System.out.print(platos.get(i) + " | ");
        System.out.println();

        // Vaciar la pila (se retiran todos los platos)
        platos.clear();
        System.out.println("23. clear() -> " + platos + " | empty: " + platos.empty());

        // ---------- MANEJO DE EXCEPCIÓN ----------
        try {
            platos.pop();
        } catch (EmptyStackException e) {
            System.out.println("24. pop() en pila vacía -> EmptyStackException (no hay platos)");
        }

        // ---------- ALTERNATIVA MODERNA: Deque (ArrayDeque) ----------
        System.out.println("\n--- Pila moderna con ArrayDeque (recomendada por Java) ---");
        // Ejemplo: cajas cargadas en un camión; la última en subir es la primera en bajar
        Deque<String> camion = new ArrayDeque<>();
        camion.push("Caja A (Bogotá)");
        camion.push("Caja B (Cali)");
        camion.push("Caja C (Popayán)");
        System.out.println("push() -> " + camion);
        System.out.println("peek() -> " + camion.peek());
        System.out.println("pop()  -> Descargando: " + camion.pop());
        System.out.println("size() -> " + camion.size());
        System.out.println("peek() en pila vacía -> " + new ArrayDeque<String>().peek() + " (retorna null)");
    }
}