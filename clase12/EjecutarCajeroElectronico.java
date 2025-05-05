package clase12;

public class EjecutarCajeroElectronico {
    public static void main(String[] args) {
        // Crear el objeto para trabajar con los metodos del cajero electronico
        //Se crea el objeto saldo inicial 1000
        CajeroElectronico cajero = new CajeroElectronico(1000);

        //Escenario 1
        //Depositar 1300 dolares
        System.out.prinln("Nuevo saldo: " + objP1.depositar (1300.0));

        //consultar saldo actual
        System.out.println("Saldo Actual: " + objP1.consultarSaldo());

        //Retirar una cantidad de 2000.0
        objP1,retirar(2000.0);

        //Transferir 200 a Medelin
        objP1.transferir(Cantidad: 200.0, destino: "Medellin");
        
    }

    //Escenario 2
    //Se crea el objeto objp2 con saldo inicial de 500.0
    CajeroElectronico objP2 = new CajeroElectronico(500.0);

    objP2.depositar(cantidad:200.0);


    objP2.retirar(Cantidad: 1000.0);

    objP2.trranferir(cantidad: 800.0, destino: "Jhon Cano");


    
}
