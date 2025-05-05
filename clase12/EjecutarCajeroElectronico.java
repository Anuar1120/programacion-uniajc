package clase12;

public class EjecutarCajeroElectronico {
    public static void main(String[] args) {
        // Crear el objeto para trabajar con los metodos del cajero electronico
        //Se crea el objeto saldo inicial 1000
        CajeroElectronico cajero = new CajeroElectronico(1000);

        //Escenario 1
        //Depositar 1300 dolares
        System.out.prinln("Nuevo saldo: " + objP1.Depositar (1300.0));

        //consultar saldo actual
        System.out.println("Saldo Actual: " + obP1.consultarSaldo());

        //Retirar una cantidad de 2000.0
        objP1,retirar(2000.0);

        //Transferir 200 a Medelin
        objP1.transferir(cantidad: 200.0, destino: "Medellin");
        
    }
    
}
