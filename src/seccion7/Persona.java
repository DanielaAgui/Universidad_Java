package seccion7;

//Una clase es una plantilla con atributos y metodos de la cual podemos crear objetos (instancias)
//Nombre de la clase debe iniciar con mayuscula
public class Persona {
    //Los atributos se deben declarar al inicio de la clase
    String nombre;
    String apellido;

    //Metodos de la clase
    //Parte de codigo que se puede reutilizar
    public void desplegarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}
