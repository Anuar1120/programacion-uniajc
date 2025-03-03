import java.util.Scanner;
public class triangulo{
    public static void main(String[]args) {
        Scanner leer = new
        Scanner(System.in);
       // Pedir la base y la altura al usurio
       System.out.println("Ingrese la base del triangulo: ");
       double base = leer.nextDouble();
       
       System.out.println("Ingrese la altura del triangulo: ");
       double altura = leer.nextDouble();
       //Calcular la superficie del triangulo
       double superficie = (base * altura)/ 2;
       //mostrar el resultado de
       System.out.println("La superficie del triangulo es : " + superficie);
       scanner.close();

    }
}