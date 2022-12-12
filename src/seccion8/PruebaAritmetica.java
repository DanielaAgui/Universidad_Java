package seccion8;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();

        aritmetica.a = 3;
        aritmetica.b = 2;
        aritmetica.sumar();

        //Para llamar un metodo con retorno, debemos crear una variable
        int resultado = aritmetica.sumarConRetorno();
        System.out.println(resultado);

        resultado = aritmetica.sumarConArgumentos(4, 5);
        System.out.println(resultado);
    }
}
