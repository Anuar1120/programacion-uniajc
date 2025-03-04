import java.util.Scanner;
public class Fabreica chocolates {
    public static void main(String[]args){
        //Definir constante
        final double Costo_materia_prima = 2.50;
        final double Costo_empaque = 0.50;
        final int Barras_por_caja = 10;

        //leer el numero de barras producidas en un dia
        Scanner scanner = new
        Scanner(System.in);
        System.out.print("ingrese la cantidad de barras producidas en un dia:");

        int N = scanner.nextInt();

        //calcular el costo de procción total
        double costoproducciontotal = (Costo_materia_prima + Costo_empauque) * N;

        //Calcular el precio de venta por barra
        double precioventbarra = (Costo_materia_prima + Costo_empaque) * (1 + Porcentaje_ganancia);

        //Calcular el ingreso total diario
        double ingresototal = Precioventabarra * N;
         //Calcular el numero de cajas necesarias
         int cajasllenas = N / Barras_por_caja;
         int barrasobrantes = N % Barras_por_caja;

         //Mostrar los resultados obtenidos 
         System.out.println("Costo total de produccio: $ " + CostoProduccionTotal); 
         System.out.println("Precio de venta por barra: $ " + preecioVentaBarra);
         System.out.println("Ingresos diarios por ventas: $ " + ingresoTotal);
         System.out.println("Numero de cajas completas:" + cajasLlenas);
         System.out.println("Barras sobrantes para el siguiente dia: " + barrasSobrantes);

         scanner.close();
    }
    
}
