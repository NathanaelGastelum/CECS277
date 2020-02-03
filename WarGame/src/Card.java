public class Card {

    private int rank;
    private String suit;
    private int value;

    public Card(int r, String s) {
        rank = r;
        suit = s;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

}