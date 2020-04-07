import java.util.PriorityQueue;

public class PriorityQueueRunner {

    public static void main(String[] args) {
        PriorityQueue<Person> personQueue = new PriorityQueue<>();

        personQueue.add(new Person("Sam", "Smith"));
        personQueue.add(new Person("Charlie", "Black"));
        personQueue.add(new Person("Betty", "Brown"));
        personQueue.add(new Person("Jessica", "Stewart"));
        personQueue.add(new Person("John", "Friday"));
        personQueue.add(new Person("Frank", "Foley"));

        for (Person p : personQueue) {
            System.out.println(p);
        }
        System.out.println();
        while (personQueue.peek() != null) {
            System.out.println(personQueue.poll());
        }
    }
}
