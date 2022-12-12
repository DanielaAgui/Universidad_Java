package seccion6;

public class CicloDoWhile {
    public static void main(String[] args) {
        //Ejecuta la sentencia mientras la condicion sea verdadera
        //Ejecuta por lo menos una vez la sentencia y luego verifica la condicion
        int contador = 5;

        do {
            System.out.println(contador);
            contador++;
        }
        while (contador < 3);
    }
}
