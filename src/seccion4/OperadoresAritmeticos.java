package seccion4;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Podemos definir varias variables de una sola linea de codigo
        double a = 3, b = 2;

        //Operador de suma
        double resultadoSuma = a + b;
        System.out.println("Suma: " + resultadoSuma);

        //Operador de resta
        double resultadoResta = a - b;
        System.out.println("Resta: " + resultadoResta);

        //Operador de multiplicacion
        double resultadoMultiplicacion = a * b;
        System.out.println("Multiplicacion: " + resultadoMultiplicacion);

        //Operador de division
        double resultadoDivision = a / b;
        System.out.println("Division: " + resultadoDivision);

        //Operador de modulo: restante de la division
        double resultadoModulo = a % b;
        System.out.println("Modulo: " + resultadoDivision);
    }
}
