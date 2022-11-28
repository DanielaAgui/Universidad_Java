package seccion2;

public class ConcatenacionDeCadenas {
    public static void main(String[] args) {
        String usuario = "Juan";
        String titulo = "Ingeniero";

        //Con el operador de suma unimos las variables
        String union = titulo + " " + usuario;
        System.out.println(union);

        int i = 3;
        int j = 4;
        //Si se usa el operador de suma, devuelve la sumatoria de las variables
        System.out.println(i + j);
        //Si la expresion comienza con cadena, el resto de la expresión lo toma como cadena
        System.out.println(usuario + i + j);
        //Si queremos realizar la sumatoria, ponemos las variables entre parentesis
        System.out.println(usuario + (i + j));
    }
}
