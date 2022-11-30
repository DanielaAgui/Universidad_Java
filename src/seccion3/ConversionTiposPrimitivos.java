package seccion3;

import java.util.Scanner;

public class ConversionTiposPrimitivos {
    public static void main(String[] args) {
        //Convertir desde un tipo String
        String edadTexto = "20";
        int edad = Integer.parseInt(edadTexto);

        double valorPi = Double.parseDouble("3.1416");

        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(consola.nextLine());

        //Convertir a un tipo String
        int num = 5;
        String numTexto = String.valueOf(num);

        String cadena = "hola";
        //Para convertir de String a caracter pasamos el índice a devolver
        char caracter = cadena.charAt(1);
        System.out.println(caracter);
    }
}
