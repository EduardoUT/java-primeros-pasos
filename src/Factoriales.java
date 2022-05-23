/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class Factoriales {

    public static void main(String[] args) {
        /**
         * En este ejercicio opcional, tu desafÃ­o es imprimir los factoriales
         * del 1 al 10. Â¿Recuerdas el factorial? Â¿No? No hay problema, sigue
         * las reglas:
         *
         * El factorial de 0 es 1. El factorial de 1 es (0!) * 1 = 1. El
         * factorial de 2 es (1!) * 2 = 2 El factorial de 3 es (2!) * 3 = 6 El
         * factorial de 4 es (3!) * 4 = 24 El factorial de un nÃºmero n es n *
         * n-1 * n-2 ... hasta n = 1.
         *
         * O sea: El factorial de 4! = 1 x 2 x 3 x 4 = 24 El factorial de 6! = 1
         * x 2 x 3 x 4 x 5 x 6 = 720 Ahora crea una nueva clase, escribe un for
         * que comience una variable n (nÃºmero actual) como 1 y factorial
         * (resultado total) como 1. Â¡Haz su ciclo entre 1 y 10 y calcula el
         * resultado!
         */
        //SoluciÃ³n:
        int factorial = 1;
        for (int i = 1; i <= 10; i++) {
            factorial = (factorial * i);
            System.out.println(factorial);
        }
    }
}
