package estruturapilas;

import java.text.Normalizer;
import java.util.Scanner;

public class Problema96 {
    private static String normalizar(String frase) {
        String sin = Normalizer.normalize(frase, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
        return sin.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    public static boolean esPalindromo(String frase) {
        String texto = normalizar(frase);
        Pila<Character> pila = new Pila<>();
        ListaCircular lista = new ListaCircular();

        for (char c : texto.toCharArray()) {
            pila.push(c);
            lista.insertarFinal(c);
        }
        while (!pila.esVacia()) {
            char dePila = pila.pop();
            char deLista = lista.extraerPrimero();
            if (dePila != deLista) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe frases (línea vacía para terminar):");
        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            if (linea.isBlank()) break;
            System.out.println("  -> " + (esPalindromo(linea) ? "ES palíndromo" : "NO es palíndromo"));
        }
    }
    
}
