package estructuracolas;
import java.util.*;

public class Problema103 {
    static final int NUM_CARRITOS = 25;
    static final int NUM_CAJAS = 3;
    static final int MINUTOS_DE_LLEGADAS = 40;

    public static void main(String[] args) {
        Random rnd = new Random(7);

        Cola<Integer> carritos = new Cola<>();
        for (int i = 1; i <= NUM_CARRITOS; i++) {
            carritos.encolar(i);
        }

        Cola<Cliente> espera = new Cola<>(); // clientes sin carrito
        List<Cliente> comprando = new ArrayList<>(); // clientes dentro comprando
        List<Cola<Cliente>> cajas = new ArrayList<>();
        for (int i = 0; i < NUM_CAJAS; i++) {
            cajas.add(new Cola<Cliente>());
        }

        int siguienteId = 1;
        int atendidos = 0;
        int minuto = 0;

        while ((minuto < MINUTOS_DE_LLEGADAS || !todoVacio(espera, comprando, cajas))
                && minuto < 1000) {
            minuto++;
            System.out.println("--- Minuto " + minuto + " ---");

            // 1. Llegan clientes (0 a 4 por minuto)
            if (minuto <= MINUTOS_DE_LLEGADAS) {
                int llegan = rnd.nextInt(5);
                for (int i = 0; i < llegan; i++) {
                    Cliente c = new Cliente(siguienteId++, 3 + rnd.nextInt(8), 1 + rnd.nextInt(3));
                    espera.encolar(c);
                    System.out.println("Llega " + c);
                }
            }

            // 2. Las cajas atienden al primero de su cola
            for (int k = 0; k < NUM_CAJAS; k++) {
                Cola<Cliente> caja = cajas.get(k);
                if (!caja.esVacia()) {
                    Cliente c = caja.frente();
                    c.tiempoPago--;
                    if (c.tiempoPago <= 0) {
                        caja.desencolar();
                        carritos.encolar(c.carrito); // el carrito queda disponible
                        atendidos++;
                        System.out.println(c + " paga en caja " + (k + 1)
                                + " y deja libre el carrito " + c.carrito);
                    }
                }
            }

            // 3. Los clientes en espera toman un carrito si hay
            while (!espera.esVacia() && !carritos.esVacia()) {
                Cliente c = espera.desencolar();
                c.carrito = carritos.desencolar();
                comprando.add(c);
                System.out.println(c + " toma el carrito " + c.carrito);
            }

            // 4. Los clientes que estan comprando avanzan un minuto
            Iterator<Cliente> it = comprando.iterator();
            while (it.hasNext()) {
                Cliente c = it.next();
                c.tiempoCompra--;
                if (c.tiempoCompra <= 0) {
                    it.remove();
                    int mejor = cajaConMenosGente(cajas);
                    cajas.get(mejor).encolar(c);
                    System.out.println(c + " termina de comprar y va a la caja " + (mejor + 1));
                }
            }

            // 5. Estado al final del minuto
            System.out.println("Carritos libres: " + carritos.tamano()
                    + " | Esperando carrito: " + espera.tamano()
                    + " | Comprando: " + comprando.size());
            for (int k = 0; k < NUM_CAJAS; k++) {
                System.out.println("Caja " + (k + 1) + ": " + cajas.get(k));
            }
        }

        System.out.println("\n=== FIN ===");
        System.out.println("Clientes atendidos: " + atendidos);
        System.out.println("Carritos devueltos: " + carritos.tamano() + " de " + NUM_CARRITOS);
    }

    static int cajaConMenosGente(List<Cola<Cliente>> cajas) {
        int mejor = 0;
        for (int k = 1; k < cajas.size(); k++) {
            if (cajas.get(k).tamano() < cajas.get(mejor).tamano()) {
                mejor = k;
            }
        }
        return mejor;
    }

    static boolean todoVacio(Cola<Cliente> espera, List<Cliente> comprando,
            List<Cola<Cliente>> cajas) {
        if (!espera.esVacia() || !comprando.isEmpty()) {
            return false;
        }
        for (Cola<Cliente> caja : cajas) {
            if (!caja.esVacia()) {
                return false;
            }
        }
        return true;
    }

}
