package estructuracolas;

public class Cliente {
     int id;
    int tiempoCompra;   // minutos que le faltan para terminar de comprar
    int tiempoPago;     // minutos que le faltan para terminar de pagar
    int carrito;        // numero del carrito que usa

    public Cliente(int id, int tiempoCompra, int tiempoPago) {
        this.id = id;
        this.tiempoCompra = tiempoCompra;
        this.tiempoPago = tiempoPago;
    }

    @Override
    public String toString() {
        return "C" + id;
    }
}
    
