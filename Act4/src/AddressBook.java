import java.util.*;
import java.io.*;

public class AddressBook {
    static HashMap<String, String> contactos = new HashMap<>();
    //^Crea el HashMap de contactos.

    static String nombreArchivo = "src//agenda.csv";
    //^Define el nombre y ubicación del archivo.

    //El siguiente método carga el archivo a memoria, y después al HashMap, para ser utilizado por el programa.
    public static void load(){
        //Estos Arrays se crean para usarse en el try-catch para construir la agenda en el HashMap
        // desde los datos del csv.
        ArrayList<String> x = new ArrayList<String>();
        ArrayList<String> a = new ArrayList<String>();

        //El siguiente código establece la comunicación entre el programa y el archivo csv:
        File file = new File(nombreArchivo);

        //En caso de que el archivo no exista, usamos el siguiente try-catch:
        try {
            Scanner inputStream = new Scanner(file);
            int n = 0;
            // El while guarda cada dato del archivo csv en un Array, "x" o "a", según si es par o non.
            while(inputStream.hasNext()){
                String data = inputStream.next();
                if (n % 2 == 0){
                    data = data.substring(0, data.length()-1);
                    //^Esto se agrega para remover la coma que separa los datos.
                    x.add(data);
                    n++;
                } else {
                    a.add(data);
                    n++;
                }
            }
            inputStream.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        // Al concluir la lectura del archivo y haber formado los Arrays "x" y "a",
        // el siguiente For Loop guarda el par datos correspondientes en el HashMap.
        // De esta forma se crea el HashMap con los datos del archivo csv.
        for (int i = 0; i < x.size(); i++){
            contactos.put(x.get(i),a.get(i));
        }
    }

    //El siguiente método guardará los cambios realizados en la agenda, en el archivo.
    public static void save(){
        try {
            FileWriter aw = new FileWriter(nombreArchivo, false);
            BufferedWriter bw = new BufferedWriter(aw);
            PrintWriter pw = new PrintWriter(bw);
            for (Map.Entry<String, String> set: contactos.entrySet()){
                pw.println(set.getKey() + ", " + set.getValue());
            }
            pw.flush();
            pw.close();
        } catch (Exception E){
            System.out.println("Error");
        }
    }

    //El siguiente método crea un nuevo contacto en el HashMap.
    public static void create(){
        System.out.println("Por favor, escriba el nombre de la persona a agregar: ");
        Scanner aName = new Scanner(System.in);
        String a = aName.nextLine();
        System.out.println("Por favor, escriba el número de telefono que corresponde a la persona a agregar: ");
        Scanner aPhone = new Scanner(System.in);
        String x = aPhone.nextLine();
        contactos.put(x,a);
        System.out.println("El contacto ha sido agregado exitosamente.");
        save();
        menuPrincipal.opciones();
    }

    //El siguiente método lista todos los contactos en el HashMap
    public static void list(){
        for (Map.Entry<String, String> set: contactos.entrySet()){
            System.out.println(set.getKey() + " : " + set.getValue());
        }
        menuPrincipal.opciones();
    }

    //El siguiente método borra un contacto del HashMap, según el número de teléfono suministrado por el usuario.
    public static void delete(){
        System.out.println("Por favor, escriba el numero de telefono de la persona a eliminar: ");
        Scanner aName = new Scanner(System.in);
        String a = aName.nextLine();
        contactos.remove(a);
        System.out.println("El contacto ha sido eliminado exitosamente.");
        save();
        menuPrincipal.opciones();
    }

}