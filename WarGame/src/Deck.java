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

    public int getPlayer() {
        return player;
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void deal(ArrayList<Deck> playerDecks) {
        //TODO refactor deal logic somewhere else, just keep function
        while (!deck.isEmpty()) {
            for (Deck d : playerDecks) {
                d.add(deck.get(0));
                deck.remove(0);
            }
        }
    }

    public Card play() {
        System.out.println("Player " + player + " " + this.size());
        Card topCard = this.get(0);
        this.remove(0);
        return topCard;
    }
}