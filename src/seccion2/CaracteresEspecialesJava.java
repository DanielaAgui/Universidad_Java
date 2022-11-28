package seccion2;

public class CaracteresEspecialesJava {
    public static void main(String[] args) {
        String nombre = "Karla";

        //Da un salto de linea en la consola
        System.out.println("Nueva linea: \n" + nombre);

        //Agrega tabulaciones
        System.out.println("Tabulador: \t" + nombre);

        //Elimina el caracter anterior a la impresion
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);

        //Imprime entre comillas simple
        System.out.println("Comilla simple: \'" + nombre + "\'");
        //Tambien se puede imprimir sin usar la diagonal inversa
        System.out.println("Comilla simple: '" + nombre + "'");

        //Imprime entre comillas dobles
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }
}
