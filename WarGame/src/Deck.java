import java.util.ArrayList;
import java.util.Collections;

public class Deck extends ArrayList<Card> {

    private ArrayList<Card> deck = new ArrayList<Card>();

    public Deck() {

    }

    public void generateDeck() {
        for (int i=2; i < 15; i++) {
            deck.add(new Card(i, "spades"));
        }
        for (int i=2; i < 15; i++) {
            deck.add(new Card(i, "clubs"));
        }
        for (int i=2; i < 15; i++) {
            deck.add(new Card(i, "hearts"));
        }
        for (int i=2; i < 15; i++) {
            deck.add(new Card(i, "diamonds"));
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void deal(Deck[] playerDecks) {
        //TODO refactor deal logic somewhere else, just keep function
        while (!deck.isEmpty()) {
            for (Deck d : playerDecks) {
                d.add(deck.get(0));
                deck.remove(0);
            }
        }
    }

    public Card play() {
        Card topCard = deck.get(0);
        deck.remove(0);
        return topCard;
    }
}