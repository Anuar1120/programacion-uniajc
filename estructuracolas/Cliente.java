package estructuracolas;

public class Cliente {
     int id;
    int tiempoCompra;   
    int tiempoPago;  
    int carrito;   

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
    
