package estruturapilas;

import java.util.Scanner;

public class Problema93 {

    public static boolean estaEquilibrada(String expr) {
        Pila<Character> pila = new Pila<>();

        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pila.esVacia()) {
                    return false;
                }
                char abre = pila.pop();
                if (!coinciden(abre, c)) {
                    return false;
                }
            }
        }
        return pila.esVacia();
    }

    private static boolean coinciden(char abre, char cierra) {
        return (abre == '(' && cierra == ')')
                || (abre == '{' && cierra == '}')
                || (abre == '[' && cierra == ']');
    }

    public static void main(String[] args) {
        String[] ejemplos = { "((a+b)*5) - 7", "2*[(a+b)/2.5 + x - 7*y" };
        for (String e : ejemplos) {
            if (estaEquilibrada(e)) {
                System.out.println(e + "  ->  equilibrada");
            } else {
                System.out.println(e + "  ->  NO equilibrada");
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduce una expresion: ");
        String linea = sc.nextLine();
        if (estaEquilibrada(linea)) {
            System.out.println("Equilibrada");
        } else {
            System.out.println("NO equilibrada");
        }
    }
}