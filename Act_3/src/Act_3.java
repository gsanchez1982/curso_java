public class Act_3 {


    public static void main(String[] args) {

        //Es indispensable llamar shuffle() al inicio del programa.

        Deck.shuffle();

        // Para este ejercicio, el primer método que probamos después de llamar shuffle es head().
        // Después llamamos los demás. Las cartas se van removiendo del deck
        // según el órden en que se llamen los métodos que remueven cartas.

        Deck.head();
        Deck.pick();
        Deck.hand();

    }


}

