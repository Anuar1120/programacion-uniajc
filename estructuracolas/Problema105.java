package estructuracolas;

import java.util.Scanner;

public class Problema105 {
     public static void main(String[] args) {
        // Lista que ya existe con contenido
        ListaRepartidores lista = new ListaRepartidores();
        lista.insertarFinal(new Repartidor("1001", "Ana Gomez", 5, "Banco Andino"));
        lista.insertarFinal(new Repartidor("1002", "Luis Perez", 3, "Pizzeria Roma"));
        lista.insertarFinal(new Repartidor("1003", "Marta Diaz", 8, "Gimnasio Fit"));

        System.out.println("LISTA ANTES DE ACTUALIZAR:");
        lista.mostrar();

        // Paso 1: crear la cola con los datos del dia
        Cola<RegistroDia> cola = new Cola<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nRegistros del dia. Escribe: numeroSS entidad  (ejemplo: 1002 Cine Sol)");
        System.out.println("Escribe 'fin' para terminar.");

        while (true) {
            System.out.print("> ");
            String linea = sc.nextLine().trim();
            if (linea.equalsIgnoreCase("fin")) {
                break;
            }
            String[] partes = linea.split(" ", 2);
            if (partes.length < 2 || partes[1].trim().isEmpty()) {
                System.out.println("  Formato invalido. Usa: numeroSS entidad");
                continue;
            }
            cola.encolar(new RegistroDia(partes[0], partes[1].trim()));
        }

        System.out.println("\nCOLA DEL DIA: " + cola);

        // Paso 2: actualizar la lista a partir de la cola
        while (!cola.esVacia()) {
            RegistroDia reg = cola.desencolar();
            Repartidor r = lista.buscar(reg.numSS);
            if (r != null) {
                r.diasTrabajados++;
                r.ultimaEntidad = reg.entidad;
            } else {
                lista.insertarFinal(new Repartidor(reg.numSS, "(nuevo)", 1, reg.entidad));
            }
        }

        System.out.println("\nLISTA DESPUES DE ACTUALIZAR:");
        lista.mostrar();
    }
}
