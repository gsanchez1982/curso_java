import java.util.*;

//Esta clase tiene un solo método: opciones().
//El método opciones() es el menú interactivo del usuario para interactuar con las funciones del programa.

public class menuPrincipal {
    public static void opciones(){
        System.out.println("Seleccione del siguiente menú la opción deseada:");
        System.out.println("[1] -- Mostrar los contactos de la Agenda");
        System.out.println("[2] -- Crear un nuevo contacto");
        System.out.println("[3] -- Borrar un contacto");
        System.out.println("[4] -- Salir del Programa");
        System.out.println("");
        System.out.println("Escriba el número de su opción a continuación:");

        Scanner opcion = new Scanner(System.in);
        String x = opcion.nextLine();

        switch(x) {
            case "1":
                AddressBook.list();
            case "2":
                AddressBook.create();
            case "3":
                AddressBook.delete();
            case "4":
                System.out.println("El programa ha terminado exitosamente. ¡Hasta luego!");
                System.exit(0);
            default:
                System.out.println("Esa no es una opción válida. Favor de intentar de nuevo.");
                opciones();
        }
    }
}
