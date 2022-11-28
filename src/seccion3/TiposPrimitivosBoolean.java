package seccion3;

public class TiposPrimitivosBoolean {
    public static void main(String[] args) {
        //Almacenan 'true' o 'false'
        boolean varBoolean = true;

        if (varBoolean) {
            System.out.println("La bandera es verdadera");
        }
        else {
            System.out.println("La bandera es falsa");
        }

        System.out.println("---------------------");

        int edad = 30;
        boolean esAdulto = edad >= 18;

        if (esAdulto) {
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("No es mayor de edad");
        }
    }
}
