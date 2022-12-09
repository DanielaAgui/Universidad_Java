package seccion4;

public class OperadoresIgualdadYRelacionales {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        //Operador de igualdad
        boolean c = (a == b);
        System.out.println(c);

        //Operador diferente de
        boolean d = (a != b);
        System.out.println(d);

        //Con string, se comparan referencias de objetos
        String texto = "Hola";
        String texto1 = "Adios";

        boolean e = texto == texto1;
        System.out.println(e);

        //Compara si las cadenas son iguales en contenido
        boolean f = texto.equals(texto1);
        System.out.println(f);
    }
}
