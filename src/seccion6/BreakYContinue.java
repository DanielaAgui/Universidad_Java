package seccion6;

public class BreakYContinue {
    public static void main(String[] args) {

        for (int contador = 0; contador < 3; contador++) {
            if (contador % 2 == 0) {
                System.out.println(contador);
                //Rompe el ciclo una vez lo ejecuta
                break;
            }
        }

        for (int contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                //Ignora la sentencia dada y salta a la siguiente iteracion
                continue;
            }
            System.out.println(contador);
        }
    }
}
