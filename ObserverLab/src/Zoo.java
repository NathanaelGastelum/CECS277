/*
 * Zoo.java
 *
 * This manages an auction whereby listeners register themselves
 * and  are notified when an animal is added.
 */

import java.util.ArrayList;

public class Zoo implements ZooSubject {
    private ArrayList<AnimalAddedListener> listeners;
    private Animal animal;

    public Zoo() {
        listeners = new ArrayList<AnimalAddedListener>();
    }

    /* add a registered observer */
    public void registerAnimalAddedListener(AnimalAddedListener o) {
        listeners.add(o);
    }

    /* remove a registered observer */
    public void unregisterAnimalAddedListener(AnimalAddedListener o) {
        listeners.remove(0);
    }

    /* notify all registered observers */
    public void notifyAnimalAddedListener() {
        for (int i = 0; i < listeners.size(); i++) {
            AnimalAddedListener listen = listeners.get(i);
            listen.update(animal);
        }
    }

    /* invoke this method when a new animal is added */
    public void addAnimal(Animal animal) {
        this.animal = animal;

        // notify all registered listeners (observers)
        notifyAnimalAddedListener();
    }
}