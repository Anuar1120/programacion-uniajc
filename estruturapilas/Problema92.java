package estruturapilas;

import java.util.Scanner;

public class Problema92 {
    public static boolean tieneFormaXSepY(String s) {
        int idx = s.indexOf('&');
        if (idx < 0 || s.indexOf('&', idx + 1) >= 0) {
            return false;
        }

        String x = s.substring(0, idx);
        String y = s.substring(idx + 1);
        if (x.length() != y.length()) {
            return false;
        }

        Pila<Character> pila = new Pila<>();
        for (char c : x.toCharArray()) {
            pila.push(c);
        }

        for (char c : y.toCharArray()) {
            char tope = pila.pop();
            if (tope != c) {
                return false;
            }
        }
        return pila.esVacia();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cadena (formato X&Y): ");
        String s = sc.nextLine();

        if (tieneFormaXSepY(s)) {
            System.out.println("SI tiene la forma X & Y");
        } else {
            System.out.println("NO tiene la forma X & Y");
        }
    }
}
