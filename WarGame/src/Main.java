import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        //TODO allow user selected playerCounts
        int playerCount = 2;

        Deck gameDeck = new Deck();
        ArrayList<Deck> playerDecks = new ArrayList<>();
        for (int i = 1; i <= playerCount; i++) {
            playerDecks.add(new Deck(i));
        }

        gameDeck.generateDeck();
        gameDeck.shuffle();
        gameDeck.deal(playerDecks);

        // Game loop
        boolean win = false;
        while (!win) {
            ArrayList<Card> round = new ArrayList<>();
            for (Deck d : playerDecks) {
                round.add(d.play());
                // return the index of the highest ranked cards
                Card highestCard = Collections.max(round,
                        Comparator.comparingInt(Card::getRank));
                ArrayList<Integer> roundWinner = new ArrayList<>();
                for (int i = 0; i < round.size(); i++) {
                    if (round.get(i).getRank() == highestCard.getRank()) {
                        roundWinner.add(i);
                    }
                }
                if (roundWinner.size() > 1){
                    //TODO warRound()
                }

                // give all round cards to roundWinner
                playerDecks.get(roundWinner.get(0)).addAll(round);
                round.clear();

                // win condition
                if (playerDecks.size() == 1){
                    win = true;
                }
            }
            System.out.println("Player " + playerDecks.get(0).getPlayer() + " is the winner!");
        }
    }
}