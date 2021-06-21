public class Card {

    // Los atributos de la carta son palo, color, y valor. Todos son Strings.

    static String palo;
    static String color;
    static String valor;

    // Setter del palo

    public static void definirPalo(String nuevoPalo){
        palo = nuevoPalo;
    }

    // Getter del palo

    public static String obtenerPalo(){
        return palo;
    }

    // Se define el color según el palo de la carta.

    public static String obtenerColor(){
        if (palo == "Diamantes"){
            color = "Rojo";
        }
        if (palo == "Corazones"){
            color = "Rojo";
        }
        if (palo == "Picas"){
            color = "Negro";
        }
        if (palo == "Tréboles"){
            color = "Negro";
        }

        return color;
    }

    // Setter del valor

    public static void definirValor(String nuevoValor){
        valor = nuevoValor;
    }

    // Getter del valor

    public static String obtenerValor(){
        return valor;
    }

}