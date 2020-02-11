import java.util.ArrayList;
import java.util.Collections;

public class Deck extends ArrayList<Card> {

    private int player;
    private ArrayList<Card> deck;

    public Deck() {
        this(0);
    }

    public Deck(int player) {
        this.player = player;
        deck = new ArrayList<>();
    }

    public void generateDeck() {
        for (int i=2; i < 15; i++) {
            deck.add(new Card(i, "Spades"));
        }
        for (int i=2; i < 15; i++) {
            deck.add(new Card(i, "Clubs"));
        }
        for (int i=2; i < 15; i++) {
            deck.add(new Card(i, "Hearts"));
        }
        for (int i=2; i < 15; i++) {
            deck.add(new Card(i, "Diamonds"));
        }
    }

    public int getPlayer() {
        return player;
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void deal(ArrayList<Deck> playerDecks) {
        while (!deck.isEmpty()) {
            for (Deck d : playerDecks) {
                if (deck.size() == 0) return;
                d.add(deck.get(0));
                deck.remove(0);
            }
        }
    }

    public Card play() {
        if (this.size() == 0) return null;
        Card topCard = this.get(0);
        this.remove(0);

        return topCard;
    }
}