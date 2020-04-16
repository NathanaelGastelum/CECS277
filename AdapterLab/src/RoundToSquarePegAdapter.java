/**
* The RoundToSquarePegAdapter class.
* This is the Adapter class.
* It adapts a RoundPeg to a SquarePeg.
* Its interface is that of a SquarePeg.
*/
public class RoundToSquarePegAdapter extends SquarePeg {
  private RoundPeg roundPeg; 
  public RoundToSquarePegAdapter(RoundPeg peg) {
    //the roundPeg is plugged into the adapter
    this.roundPeg = peg;}
  public void insert(String str) {
    //the roundPeg can now be inserted in the same manner as a squarePeg!
    roundPeg.insertIntoHole(str);}
}

