/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class EjemploScope {

    public static void main(String[] args) {
        int edad = 18;
        int cantidadPersonas = 2;
        //boolean esPareja = cantidadPersonas > 1;
        boolean esPareja; //El SCOPE podrÃ¡ ser accedido.
        if (cantidadPersonas > 1) {
            esPareja = true;
            /*
            * Si se declara boolean esPareja
            * el alcance o SCOPE sÃ³lo serÃ¡ dentro del
            * bloque de llaves.
            * */
        } else {
            esPareja = false;
        }
        boolean puedeEntrar = edad >= 18 && esPareja;
        if (puedeEntrar) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}
