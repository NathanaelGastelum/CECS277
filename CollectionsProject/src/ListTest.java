/*  Nathanael Gastelum
    April 9, 2020
    Purpose: This program helps compare List efficiency by simulating a scavenger hunt
    and timing related tasks
    Inputs: One Command Line argument to decide which List to test
            User cli for creating groups and choosing List index
    Outputs: Elapsed time for each task in nanoseconds*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ListTest {

    public static void main(String[] args) {
        List<String> scavengerList;
        List<List<String>> groups;
        String listType;

        // Command line arguments initialize Map using polymorphism
        if(args.length < 1) {
            System.out.println("No arguments");
            return;
        }
        else if (args[0].equals("al")) {
            listType = "ArrayList";
            scavengerList = new ArrayList<>();
            groups = new ArrayList<>();
        }
        else if (args[0].equals("ll")) {
            listType = "LinkedList";
            scavengerList = new LinkedList<>();
            groups = new LinkedList<>();
        }
        else {
            System.out.println("Invalid argument");
            return;
        }

        // Initialize scanner with scavenger hunt file
        File listFile = new File("ScavengerHunt.txt");
        Scanner s = null;
        try {
            s = new Scanner(listFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Load List with items
        long startTime, endTime;
        startTime = System.nanoTime();
        while (s.hasNextLine()) {
            scavengerList.add(s.nextLine());
        }
        endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Elapsed time for loading " + listType + ": " + duration + " nanoseconds");

        // Use iterator in java library to traverse Collection forwards then backwards
        startTime = System.nanoTime();
        ListIterator<String> li = scavengerList.listIterator();
        while (li.hasNext()) {
            li.next();
        }
        while (li.hasPrevious()) {
            li.previous();
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        long loopTime = duration;

        //Validate user input for number of teams
        s = new Scanner(System.in);
        int groupCount;
        do {
            System.out.println("How many groups?");
            while (!s.hasNextInt()) {
                System.out.println("Please enter a number");
                s.next();
            }
            groupCount = s.nextInt();
            if (groupCount <= 0) System.out.println("Please enter a valid number of groups");
        } while (groupCount <= 0);

        // Create a shuffled copy of scavenger hunt list per team
        startTime = System.nanoTime();
        if (args[0].equals("al")) {
            for (int i = 0; i < groupCount; i++) {
                groups.add(new ArrayList<>());
                groups.get(i).addAll(scavengerList);
                Collections.shuffle(groups.get(i));
            }
        }
        else if (args[0].equals("ll")) {
            for (int i = 0; i < groupCount; i++) {
                groups.add(new LinkedList<>());
                groups.get(i).addAll(scavengerList);
                Collections.shuffle(groups.get(i));
            }
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        long groupTime = duration;

        // User input for list index
        System.out.print("Which element do you want to work with. ");
        s = new Scanner(System.in);
        int index;
        do {
            System.out.println("Enter a number between 0 and 99)");
            while (!s.hasNextInt()) {
                System.out.println("Please enter a valid number");
                s.next();
            }
            index = s.nextInt();
        } while (index < 0 || index > 99);

        // Retrieve and insert element from each group
        startTime = System.nanoTime();
        System.out.println("The things are: ");
        for (List<String> group : groups) {
            System.out.println(group.get(index));
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        long retrievalTime = duration;

        startTime = System.nanoTime();
        for (List<String> group : groups) {
            group.add(index, "easter egg");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        long insertTime = duration;

        //Use Random class to choose a new position
        Random rand = new Random();
        index = rand.nextInt(101);
        startTime = System.nanoTime();
        System.out.println("\nThe random things are: ");
        for (List<String> group : groups) {
            System.out.println(group.get(index));
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        long randRetrievalTime = duration;

        // Display times
        System.out.println("\nTime to loop through " + listType + ": " + loopTime);
        System.out.println("Time to create groups: " + groupTime);
        System.out.println("Time to retrieve user index: " + retrievalTime);
        System.out.println("Time to insert at user index: " + insertTime);
        System.out.println("Time to retrieve random index: " + randRetrievalTime);
    }
}