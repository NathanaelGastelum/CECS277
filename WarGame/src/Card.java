public class Card {

    private int rank;
    private String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        int n = rank;
        String face = Integer.toString(n);
        switch (n) {
            case 11: face = "Jack";
                break;
            case 12: face = "Queen";
                break;
            case 13: face = "King";
                break;
            case 14: face = "Ace";
                break;
        }
        return face + " of " + suit;
    }

}