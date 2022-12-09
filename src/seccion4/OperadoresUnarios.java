package seccion4;

public class OperadoresUnarios {
    public static void main(String[] args) {

        //Operador de cambio de signo
        int a = 3;
        int b = -a;

        System.out.println(a);
        System.out.println(b);

        //Operador de negacion
        boolean c = true;
        boolean d = !c;

        System.out.println(c);
        System.out.println(d);

        //Preincremento
        //Primero se incrementa la variable y luego se utiliza su valor
        int e = 3;
        int f = ++e;

        System.out.println(e);
        System.out.println(f);

        //Postincremento
        //Primero se utiliza el valor y luego se incrementa la variable
        int g = 3;
        int h = g++;

        System.out.println(g);
        System.out.println(h);

        //Predecremento
        //Primero se decrementa la variable y luego se utiliza su valor
        int i = 3;
        int j = --i;

        System.out.println(i);
        System.out.println(j);

        //Postdecremento
        //Primero se utiliza el valor y luego se decrementa la variable
        int k = 3;
        int l = k--;

        System.out.println(k);
        System.out.println(l);
    }
}
