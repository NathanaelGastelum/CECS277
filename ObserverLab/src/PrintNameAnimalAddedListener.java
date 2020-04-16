public class PrintNameAnimalAddedListener implements AnimalAddedListener {
    private ZooSubject zoo;

    public PrintNameAnimalAddedListener(ZooSubject zoo) {
        this.zoo = zoo;
        zoo.registerAnimalAddedListener(this);
    }

    // this is invoked when the state of the zoo has changed
    public void update(Object newState) {
        Animal animal = (Animal) newState;
        display(animal);
    }

    public void display(Animal animal) {
        System.out.println("Added a new animal with name " + animal);
    }
}