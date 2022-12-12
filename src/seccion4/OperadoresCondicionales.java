package seccion4;

public class OperadoresCondicionales {
    public static void main(String[] args) {
        int a = 10;
        int valorMaximo = 10;
        int valorMinimo = 0;

        //Condicional 'And'
        //Ambas condiciones tienen que ser verdaderas
        boolean resultado = a >= valorMinimo && a <= valorMaximo;

        if (resultado) {
            System.out.println("Dentro de rango");
        }
        else {
            System.out.println("Fuera de rango");
        }

        //Condicional 'Or'
        //Por lo menos una de las condiciones debe ser verdadera
        boolean vacaciones = false;
        boolean diaDescanso = true;

        if (vacaciones || diaDescanso) {
            System.out.println("El padre puede asistir al juego de su hijo");
        }
        else {
            System.out.println("El padre esta ocupado");
        }
    }
}
