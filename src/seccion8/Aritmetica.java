package seccion8;

public class Aritmetica {
    int a;
    int b;

    //Metodo sin retorno
    public void sumar() {
        int resultado = a + b;
        System.out.println(resultado);
    }

    //Metodo con retorno
    public int sumarConRetorno() {
        return a + b;
    }

    //Metodo con argumentos
    public int sumarConArgumentos(int a, int b) {
        //Tambien podemos llamar a un metodo dentro de otro
        //return sumarConRetorno();
        return a + b;
    }
}
