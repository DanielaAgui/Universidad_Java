package seccion3;

public class TiposPrimitivosChar {
    public static void main(String[] args) {
        /*
        Lista de valores: https://en.wikipedia.org/wiki/List_of_Unicode_characters#Basic_Latin
         */

        //Almacena solamente un caracter
        //Se define entre comillas simples
        //Podemos definir la variable con el caracter especifico
        char miCaracter = 'a';
        System.out.println(miCaracter);

        //Podemos definir la variable con el codigo unicode
        char varChar = '\u0021';
        System.out.println(varChar);

        //Podemos definir la variable con el valor decimal del caracter
        char varCharDecimal = 35;
        System.out.println(varCharDecimal);
    }
}
