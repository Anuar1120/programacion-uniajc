import java.util.Scanner;

public class Convertidor {
      public static void main(String[] args){
        // Declaracion de las variables para el ejercicio
        // c -> grados celsius, + -> grados farenheit
        // gradoscelcius, gradosfarenheit
        double c, f, gradoscelcius, gradosfarenheit;
     
       // pedir datos por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite los Celcius");
        c = leer.nextInt();
        System.out.println("Digite los grados Farenheit");
        f = leer.nextInt();
        leer.close();
        gradoscelcius   = (f - 32) * (5.0/9.0);
        gradosfarenheit = c * (9/5) + 32;
        // Mostrar los resultados de las formulas
        System.out.println("ºF - > ºc : " + gradoscelcius);
        System.out.println("ºC - > ºF : " + gradosfarenheit);
        leer.close();


      }
}