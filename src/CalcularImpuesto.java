/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class CalcularImpuesto {

    public static void main(String[] args) {
        /**
         * A Juan le gustarÃ­a crear un programa sobre Impuesto sobre la Renta
         * (IR), para ello, verificÃ³ las reglas de impuestos. EncontrÃ³ en el
         * sitio web de impuestos que:
         *
         * De 1900.0 a 2800.0, el IR es de 7.5% y puede deducir de la
         * declaraciÃ³n el monto de 142. De 2800.01 a 3751.0, el IR es del 15% y
         * puede deducir 350. De 3751.01 a 4664.00, el IR es 22.5% y puede
         * deducir 636
         *
         * Ayuda a Juan implementando las reglas con condicionales.
         */
        double salario = 3300.00;
        System.out.println("Su salario sin IR es de: " + salario);
        boolean esRangoImpuestosUno = salario >= 1900.00 && salario <= 2800.00;
        boolean esRangoImpuestosDos = salario >= 2800.01 && salario <= 3751.00;
        boolean esRangoImpuestosTres = salario >= 3751.01 && salario <= 4664.00;
        if (esRangoImpuestosUno) {
            salario = salario - 142;
            System.out.println("Se aplicÃ³ un IR de 7.5%, su salario ahora es de: " + salario);
        } else if (esRangoImpuestosDos) {
            salario = salario - 350;
            System.out.println("Se aplicÃ³ un IR de 15%, su salario ahora es de: " + salario);
        } else if (esRangoImpuestosTres) {
            salario = salario - 636;
            System.out.println("Se aplicÃ³ un IR de 22.5%, su salario ahora es de: " + salario);
        } else {
            System.out.println("Impuesto no aplicable.");
        }
    }
}
