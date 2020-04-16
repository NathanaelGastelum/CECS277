public interface ZooSubject {

    /* allows an observer to register with the subject */
    public void registerAnimalAddedListener( AnimalAddedListener o );

    /* removes an observer */
    public void unregisterAnimalAddedListener( AnimalAddedListener o );

    /* notifies all registered observers when its state changes */
    public void notifyAnimalAddedListener();
}
