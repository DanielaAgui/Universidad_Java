package seccion2;

import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args) {
        //Mensaje que le sale al usuario
        System.out.println("Escribe tu nombre: ");
        //Creamos la clase 'Scanner' para pedir datos por consola
        Scanner consola = new Scanner(System.in);
        //Asignamos los datos que se pasan por consola a una variable
        //'nextLine()' lee el texto hasta que encuentra un salto de linea
        String usuario = consola.nextLine();
        System.out.println("Mi nombre es " + usuario);
    }
}
