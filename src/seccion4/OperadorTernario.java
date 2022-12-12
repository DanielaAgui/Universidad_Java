package seccion4;

public class OperadorTernario {
    public static void main(String[] args) {
        //Solo se recomienda para expresiones sencillas
        //La primera expresión es la codicion, luego la ejecucion de verdadero y luego la ejecucion de falso
        String resultado = (3 > 2) ? "Verdadero" : "Falso";
        System.out.println(resultado);

        int numero = 8;
        resultado = (8 % 2 == 0) ? "Numero par" : "Numero impar";
        System.out.println(resultado);
    }
}
