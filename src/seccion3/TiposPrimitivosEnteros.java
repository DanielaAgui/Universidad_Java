package seccion3;

public class TiposPrimitivosEnteros {
    public static void main(String[] args) {
        //byte, short, int, long
        byte numeroByte = 10;
        //Verifiamos el valor minimo que soporta el tipo
        System.out.println(Byte.MIN_VALUE);
        //Verifiamos el valor maximo que soporta el tipo
        System.out.println(Byte.MAX_VALUE);
        System.out.println("---------------------");

        short numeroShort = 10;
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("---------------------");
        
        int numeroInt = 10;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("---------------------");

        long numeroLong = 10;
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

    }
}
