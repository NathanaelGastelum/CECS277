import java.util.ArrayList;

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

        gameController.gameRound(playerDecks);

        System.out.println("Player " + playerDecks.get(0).getPlayer() + " is the winner!");
    }
}