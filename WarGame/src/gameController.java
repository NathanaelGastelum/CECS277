import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class gameController {

    public static void gameRound(ArrayList<Deck> playerDecks) {

        boolean win = false;
        ArrayList<Card> round = new ArrayList<>();

        // Game loop
        while (!win) {
            for (Deck d : playerDecks) {
                System.out.print("Player " + d.getPlayer() + " plays ");
                round.add(d.play());
            }

            // return the index of the highest ranked cards
            Card highestCard = Collections.max(round,
                    Comparator.comparingInt(Card::getRank));
            ArrayList<Integer> roundWinner = new ArrayList<>();
            for (int i = 0; i < round.size(); i++) {
                if (round.get(i).getRank() == highestCard.getRank()) {
                    roundWinner.add(playerDecks.get(i).getPlayer());
                }
            }
            if (roundWinner.size() > 1) {
                warRound(playerDecks, roundWinner);
            }

            // give all round cards to roundWinner
            playerDecks.get(roundWinner.get(0)).addAll(round);
            System.out.println("Player " + roundWinner.get(0) + " wins the round\n");
            round.clear();

            playerDecks.removeIf(i -> i.size() <= 0);

            // win condition
            if (playerDecks.size() == 1){
                win = true;
            }
        }
    }

    public static void warRound(ArrayList<Deck> playerDecks, ArrayList<Integer> roundWinner) {
        /*Decks of 5 cards
         * each tied player .play()s into their warDeck
         * each of the warDecks plays one at a time into a new gameRound()
         * remove losers from roundWinner*/
        System.out.println("War Round -----------------------------------------------");
        ArrayList<Deck> warDecks = new ArrayList<>();
        for (Integer player : roundWinner) {
            warDecks.add(new Deck(player));
            for (Deck wD : playerDecks) {
                if (wD.getPlayer() == player) {
                    for (int i=0; i < 5; i++) {
                        if (wD.play() == null) break;
                        warDecks.get(i).add(wD.play());
                    }
                }
            }
        }
        //TODO Player loss text
        for (Deck wD : warDecks) {
            if (wD.size() < 5) {
                System.out.println("Player " + wD.getPlayer() + " has ran out of cards");
            }
        }
        warDecks.removeIf(i -> i.size() <= 5);
        gameRound(warDecks);
    }
}
