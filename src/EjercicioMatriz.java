/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class EjercicioMatriz {

    public static void main(String[] args) {

        //Forma 1:
        for (int fila = 0; fila <= 10; fila++) {
            for (int columna = 0; columna <= 10; columna++) {
                if (columna > fila) {
                    break;
                }
                System.out.print("*");
                System.out.print("  ");
            }
            System.out.println();
        }

        //Forma 2:
        for (int fila = 0; fila <= 10; fila++) {
            for (int columna = 0; columna < fila; columna++) {
                System.out.print("*");
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
