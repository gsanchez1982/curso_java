import java.util.Random;
import java.util.*;

public class Deck {
static ArrayList<String> paloTipo;
static ArrayList<String> valorTipo;
static ArrayList<String[]> deckCards;
static Random rand = new Random();

// Se definen los tipos de palos que hay y se guardan en un ArrayList

    public static void TipoPalos(){
        paloTipo = new ArrayList<>();
        paloTipo.add("Tréboles");
        paloTipo.add("Picas");
        paloTipo.add("Diamantes");
        paloTipo.add("Corazones");

    }

    // Se definen los tipos de valores que hay y se guardan en un ArrayList

    public static void TipoValores(){

        valorTipo = new ArrayList<>();
        valorTipo.add("A");
        valorTipo.add("2");
        valorTipo.add("3");
        valorTipo.add("4");
        valorTipo.add("5");
        valorTipo.add("6");
        valorTipo.add("7");
        valorTipo.add("8");
        valorTipo.add("9");
        valorTipo.add("10");
        valorTipo.add("J");
        valorTipo.add("Q");
        valorTipo.add("K");

     }

    // Se hace el Deck en orden, mezclando los tipos de palos con los tipos de valores.
    // Los colores están determinados según el palo en la Clase "Card.java"

  public static void makeDeck() {
      TipoPalos();
      TipoValores();

      deckCards = new ArrayList<>();

      for (int i = 0; i < paloTipo.size(); i++) {
          Card.definirPalo(paloTipo.get(i));
          for (int a = 0; a < valorTipo.size(); a++) {
              Card.definirValor(valorTipo.get(a));
              String newCard[] = {Card.obtenerPalo(), Card.obtenerColor(), Card.obtenerValor()};
              deckCards.add(newCard);
          }
      }

  }

  // Se toma el deck que hicimos en makeDeck() y se revuelve al azar.

  public static void shuffle(){
        makeDeck();
        Collections.shuffle(deckCards);

        System.out.println("Se mezcló el deck");

  }

  // Toma el deck que existe después de los métodos llamados anteriormente (al menos shuffle(), pero también otros),
    // y muestra la primera carta y la quita del deck

  public static void head(){


      String[] c = deckCards.get(0);
      System.out.println(Arrays.toString(c));

      deckCards.remove(0);

      System.out.println("Quedan " + deckCards.size() + " cartas en deck");
    }

    // Toma el deck que existe después de los métodos llamados anteriormente (al menos shuffle(), pero también otros),
    // y muestra una carta al azar y la quita del deck

  public static void pick(){

        int r = rand.nextInt(deckCards.size());

      String[] c = deckCards.get(r);
      System.out.println(Arrays.toString(c));

      deckCards.remove(r);

      System.out.println("Quedan " + deckCards.size() + " cartas en deck");

  }

    // Toma el deck que existe después de los métodos llamados anteriormente (al menos shuffle(), pero también otros),
    // y muestra cinco cartas al azar y las quita del deck

  public static void hand(){
      for (int i = 0; i < 5; i++) {
          int r = rand.nextInt(deckCards.size());

          String[] c = deckCards.get(r);
          System.out.println(Arrays.toString(c));

          deckCards.remove(r);
      }
      System.out.println("Quedan " + deckCards.size() + " cartas en deck");
  }

}
