package estruturapilas;

import java.util.Scanner;

public class Problema93 {
    public class Problema93 {

    public static boolean estaEquilibrada(String expr) {
        Pila<Character> pila = new Pila<>();

        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pila.esVacia()) return false;
                char abre = pila.pop();
                if (!coinciden(abre, c)) return false;
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
            System.out.println(e + "  ->  " + (estaEquilibrada(e) ? "equilibrada" : "NO equilibrada"));
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduce una expresión: ");
        String linea = sc.nextLine();
        System.out.println(estaEquilibrada(linea) ? "Equilibrada" : "NO equilibrada");
    }
}

}