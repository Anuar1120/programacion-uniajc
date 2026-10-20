package list;
import java.util.ArrayList;
public class ListaCompras {
    public static void main(String[] args) {
        ArrayList<String> listaCompras = new ArrayList<>();
        listaCompras.add("Leche");
        listaCompras.add("Pan");
        listaCompras.add("Huevos");
        listaCompras.add("Frutas");
        listaCompras.add("Verduras");

        System.out.println("Lista de compras: " + listaCompras);

        // Agregar un elemento en una posición específica
        listaCompras.add(2, "Arroz");
        System.out.println("Después de agregar Arroz en la posición 2: " + listaCompras);

        // Obtener un elemento en una posición específica
        String item = listaCompras.get(3);
        System.out.println("Elemento en la posición 3: " + item);

        // Modificar un elemento en una posición específica
        listaCompras.set(1, "Pan Integral");
        System.out.println("Después de modificar el elemento en la posición 1: " + listaCompras);

        // Eliminar un elemento en una posición específica
        String eliminado = listaCompras.remove(4);
        System.out.println("Después de eliminar el elemento en la posición 4 (" + eliminado + "): " + listaCompras);

        // Verificar si un elemento está en la lista
        boolean contieneFrutas = listaCompras.contains("Frutas");
        System.out.println("¿La lista contiene Frutas? " + contieneFrutas);

        // Limpiar la lista
        listaCompras.clear();
        System.out.println("Después de limpiar la lista: " + listaCompras);
    }
}