package seccion5;

public class SentenciaSwitch {
    public static void main(String[] args) {
        ///Ejemplo 1
        int numero = 2;
        String numeroTexto = "";

        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Numero desconocido";
        }
        System.out.println(numeroTexto);

        ///Ejemplo 2
        int mes = 5;
        String estacion = "Estacion desconocida";

        switch (mes) {
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otono";
                break;
        }
        System.out.println(estacion);
    }
}
