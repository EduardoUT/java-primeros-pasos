/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class BucleMultiplosDeTres {

    public static void main(String[] args) {
        /*
        * Usa un bucle for para imprimir todos los mÃºltiplos de 3, entre 1 y 100.
        * Consejo: Hay dos formas tradicionales de resolver este problema.
        * Una es hacer el for y usar el nÃºmero% 3 para encontrar el
        * residuo de dividir un nÃºmero entre 3 (el operador % se llama mÃ³dulo).
        * Si el residuo es cero, es divisible por 3. Como en:
        *
        * if (numero% 3 == 0) {
        *   // hacer algo
        * }
        *
        * Otro enfoque es hacer un bucle ligeramente diferente,
        * que salta directamente a travÃ©s de mÃºltiplos de tres.
        * Â¡Hay otros enfoques, elige el tuyo e implemÃ©ntalo en una nueva clase!
        *
        * */
        //SoluciÃ³n 1:
        for (int i = 1; i <= 33; i++) {
            int multiplo = i * 3;
            System.out.println(multiplo);
        }

        //SoluciÃ³n 2:
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        //SoluciÃ³n Instructor:
        for (int i = 3; i <= 100; i += 3) {
            System.out.println(i);
        }
    }
}
