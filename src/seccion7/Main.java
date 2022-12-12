package seccion7;

public class Main {
    public static void main(String[] args) {
        //Instanciamos la clase
        Persona persona1 = new Persona();

        //Accedemos a un atributo y le asignamos un valor
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";

        //Llamamos al metodo
        persona1.desplegarInformacion();

        Persona persona2 = new Persona();
        persona2.nombre = "Andres";
        persona2.apellido = "Lopez";
    }
}
