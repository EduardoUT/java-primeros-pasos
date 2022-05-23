/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class EjemploCaracteres {

    public static void main(String[] args) {
        char caracter = 'a';
        System.out.println(caracter);
        /*
        * Podemos ingresar tambiÃ©n el nÃºmero de referencia
        * del carÃ¡cter acorde al cÃ³digo ASCII:
        * Tabla de referencia:
        * https://elcodigoascii.com.ar/
        *
        * */
        caracter = 178;
        System.out.println(caracter);
        caracter = 178 + 1;
        char segundoChar = (char) (caracter + 1); //1 Al ser entero es necesario castear toda la definiciÃ³n.
        System.out.println(segundoChar);
    }
}
