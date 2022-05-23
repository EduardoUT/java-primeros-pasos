/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class ProbandoSwitchCase {

    public static void main(String[] args) {
        /*
        * SintÃ¡xis Switch
        * switch (variableASerProbada) {
            case opciÃ³n1:
                comando (s) si se ha elegido la opciÃ³n 1
                break;
            case option2:
                comando (s) si se ha elegido la opciÃ³n 2
                break;
            case option3:
                comando (s) si se ha elegido la opciÃ³n 3
                break;
            default:
                comando (s) si ninguna de las opciones anteriores ha sido elegida
          }
        * */
        int mes = 10;
        switch (mes) {
            case 1:
                System.out.println("El mes es enero");
                break;
            case 2:
                System.out.println("El mes es febrero");
                break;
            case 3:
                System.out.println("El mes es marzo");
                break;
            case 4:
                System.out.println("El mes es abril");
                break;
            case 5:
                System.out.println("El mes es mayo");
                break;
            case 6:
                System.out.println("El mes es junio");
                break;
            case 7:
                System.out.println("El mes es julio");
                break;
            case 8:
                System.out.println("El mes es agosto");
                break;
            case 9:
                System.out.println("El mes es septiembre");
                break;
            case 10:
                System.out.println("El mes es octubre");
                break;
            case 11:
                System.out.println("El mes es noviembre");
                break;
            case 12:
                System.out.println("El mes es diciembre");
                break;
            default:
                System.out.println("Mes invÃ¡lido");
                break;
        }
        System.out.println(mes);
    }
}
