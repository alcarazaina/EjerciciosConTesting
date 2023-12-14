package ejercicio01;
/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        ArrayList<String> solucion = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0){
            solucion.add(i - 1,"fizzbuzz");
            } else if (i % 5 == 0) {
            solucion.add(i -1,"buzz");
            } else if (i % 3 == 0) {
             solucion.add(i -1, "fizz");
            }else {
                solucion.add(Integer.toString(i));
            }
        }
        for (int i = 0; i <solucion.size() ; i++) {
            System.out.println(solucion.get(i));
        }
    }
}