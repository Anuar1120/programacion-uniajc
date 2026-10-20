package list;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> objArr = new ArrayList<>();
        objArr.add(7);
        objArr.add(3);
        objArr.add(1);
        objArr.add(9);
        objArr.add(6);
        objArr.add(8);
        objArr.add(4);
        objArr.add(10);
        objArr.add(12);
        objArr.add(20);
        objArr.add(30);
        System.out.println(objArr);
        objArr.add(4, 25);  /*agregar un elemento(25)en una posicion especifica */

        System.out.println(objArr);
        System.out.println(objArr.get(6));
        System.out.println(objArr.get(4));
        System.out.println(objArr.set(3, 33));
        System.out.println(objArr.indexOf(4));/*Devuelve el indice(posicion) de la ultima aparicion del elemento en este caso es 7*/
        System.out.println(objArr.indexOf(50)); /* -1 porque el indice no esta */
       
        System.out.println(objArr.indexOf(10)); /* Muestra el indice de la primera aparicion del elemento */
        System.out.println(objArr.contains(10)); /*Muestra true si el elemento esta en la lista, de lo contrario devuelve false */
        System.out.println(objArr.contains(100)); /*Muestra true si el elemento esta en la lista, de lo contrario devuelve false */
        System.out.println(objArr.remove(8)); /*Elimina el elemento en la posicion 12 y devuelve el elemento eliminado */
        objArr.clear(); /* Elimina todos los elementos de esta lista*/
        System.out.println(objArr.clone()); /* Devuelve una copia de la lista */


    }
}