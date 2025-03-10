import java.util.Scanner;

public class Ejercicio4punto1B {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("Digite la temperatura");
        double temperatura = 0.0;
        System.out.print("Digite temperatura");
        temperatura = leer.nextDouble();
        if(temperatura>= 100){
            System.out.print("por encima del punto de ebullicion");
        } else{
            System.out.print("por debajo del punto de ebullicion");
        }

    }
}
