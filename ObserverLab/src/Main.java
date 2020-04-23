public class Main {
    public static void main (String[] args) {
        Zoo zoo = new Zoo();
//      This implementation calls register in the listener constructor, calling it again in main creates duplicate list entries
//      zoo.registerAnimalAddedListener(new PrintNameAnimalAddedListener(zoo));
        PrintNameAnimalAddedListener al0 = new PrintNameAnimalAddedListener(zoo);
        zoo.addAnimal(new Animal("Tiger"));
        PrintNameAnimalAddedListener al1 = new PrintNameAnimalAddedListener(zoo);
        PrintNameAnimalAddedListener al2 = new PrintNameAnimalAddedListener(zoo);
//		zoo.registerAnimalAddedListener(al1);
//		zoo.registerAnimalAddedListener(al2);
		zoo.addAnimal(new Animal("Lion"));
        System.out.println(zoo.listeners.toString());
		zoo.unregisterAnimalAddedListener(al1);
		zoo.addAnimal(new Animal("Bear"));
		System.out.println(zoo.listeners.toString());
    }
}