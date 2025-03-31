//INICIO
// Leer los números ingresados por el usuario
//ESCRIBIR"Ingrese el primer número: "LEER num1 ESCRIBIR"Ingrese el segundo número: "LEER num2

// Leer la operación a realizar
//ESCRIBIR"Seleccione la operación (+: Suma, -: Resta, *: Multiplicación, /: División): "LEER seleccionOp

// Inicializar variable resultado
//resultado←0

// Evaluar la operación seleccionada
//SI seleccionOp="+"ENTONCES resultado←num1+num2 ESCRIBIR"El resultado de la suma es: ",resultado SINO SI seleccionOp="-"ENTONCES resultado←num1-num2 ESCRIBIR"El resultado de la resta es: ",resultado SINO SI seleccionOp="*"ENTONCES resultado←num1*num2 ESCRIBIR"El resultado de la multiplicación es: ",resultado SINO SI seleccionOp="/"ENTONCES SI num2≠0 ENTONCES resultado←num1/num2 ESCRIBIR"El resultado de la división es: ",resultado SINO ESCRIBIR"Error: No se puede dividir entre cero."FIN SI SINO ESCRIBIR"Operación no válida."FIN SI FIN

package Clase7;

import java.util.Scanner;

public class Ejercicio410 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Digite la calificación: ");

        int nota = leer.nextInt();

        if (nota < 0 || nota > 100) {
            System.out.println("Número fuera de rango");
        } else {
            if (nota >= 90 && nota <= 100) {
                System.out.println("A");
            } else {
                if (nota >= 80 && nota < 90) {
                    System.out.println("B");
                } else {
                    if (nota >= 70 && nota < 80) {
                        System.out.println("C");
                    } else {
                        if (nota >= 69 && nota < 70) {
                            System.out.println("D");
                        } else {
                            System.out.println("F");
                        }
                    }
                }
            }
        }

        leer.close();
    }
}