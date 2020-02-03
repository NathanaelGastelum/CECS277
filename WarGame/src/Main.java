public class Main {

    public static void main(String[] args) {
        int playerCount = 2;

        Deck gameDeck = new Deck();
        Deck[] playerDecks = new Deck[playerCount];
        //TODO Find out why this can't be a foreach loop
        for (int i = 0; i < playerCount; i++) {
            playerDecks[i] = new Deck();
        }

        gameDeck.generateDeck();
        gameDeck.shuffle();
        gameDeck.deal(playerDecks);

        // Game loop
        boolean win = false;
        /*while (!win) {
            for (Deck d : playerDecks) {
                d.play();
            }
        }*/
    }
}