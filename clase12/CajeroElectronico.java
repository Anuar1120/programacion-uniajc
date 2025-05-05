package clase12;

public class CajeroElectronico {
    private double saldo;

    public CajeroElectronico(double saldo) {
        this.saldo = saldo;
            this.saldo = saldo;

    }

    // Metodos
    /**
     * *ontiene lo que tenga asignado el atributo saldo
     * 
     * @return
     */

    public double getSaldo() {
        return saldo;

    }

    public double depositar(double Cantidad) {
        return saldo += Cantidad;

    }
    public void retirar(double cantidad){
        if (cantidad <= saldo) {
            System.out.println("El nuevo saldo es: " + saldo);
        } else {
            System.out.println("la cantidad a retirar es mayor al saldo");
        }
    }

/**
 * Obtener el saldo actual del cajero
 * 
 *@return saldo
 */


    public double consultarSaldo() {
        return saldo;
      
        }

    

    public void TRANSFERIR(double cantidad, String destino) {
        if (cantidad <= saldo) {
            System.out.println(
                    "Se realizo una transferencia: " + cantidad + " a " + destino + " y su saldo nuevo es: " + saldo);
        } else {
            System.out.println("La tranferencia no se pudo hacer");
        }
    }

}