
public class Act2 {
    // A continuación se define como atributo publico estatico el arreglo de 5 calificaciones:
    public static int[] calificaciones = {100, 49, 70, 89, 29};

    // A continuación se define como atributo publico estatico el nombre del alumno:
    public static String alumno = "Guillermo";

    // Método principal (También llamado "main").
    // Aquí es donde se manda a consola ("hace print") el resultado.
    public static void main(String[] args){

        System.out.println("Nombre del Estudiante: "+alumno);
        System.out.println("Calificacion 1: "+calificaciones[0]);
        System.out.println("Calificacion 2: "+calificaciones[1]);
        System.out.println("Calificacion 3: "+calificaciones[2]);
        System.out.println("Calificacion 4: "+calificaciones[3]);
        System.out.println("Calificacion 5: "+calificaciones[4]);
        System.out.println("Promedio: "+calcPromedio());
        System.out.println("Calificacion: "+calcCalifFinal());
    }

    //Método calcPromedio. Este método calcula el promedio de las calificaciones.
    public static double calcPromedio() {
        int[] c = calificaciones;
        int sum = 0;

        for (int i = 0; i < c.length; i++) {
            sum += c[i];
        }

        double promedio = sum / c.length;

        return promedio;
    }

    //Método calcCalifFinal.
    // Este método es una colección de "ifs" para determinar cual letra corresponde al promedio
    public static String calcCalifFinal(){
        double promedio = calcPromedio();
        String calificaFinal = "";

        if (promedio <= 50.0){
            calificaFinal ="F";
        }
        if (promedio > 51.0 && promedio <= 60.0){
            calificaFinal ="E";
        }
        if (promedio > 61.0 && promedio <= 70.0){
            calificaFinal ="D";
        }
        if (promedio > 71.0 && promedio <= 80.0){
            calificaFinal ="C";
        }
        if (promedio > 81.0 && promedio <= 90.0){
            calificaFinal ="B";
        }
        if (promedio > 91.0 && promedio <= 100.0){
            calificaFinal ="A";
        }
        return calificaFinal;

    }



}
