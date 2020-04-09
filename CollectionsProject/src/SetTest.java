/*  Nathanael Gastelum
    April 9, 2020
    Purpose: This program times how long it takes a Set to load a large txt file
    and then search for a specific word 100 times
    Inputs: One Command Line argument to decide which Set to test
    Outputs: Elapsed time for loading and searching the Set in milliseconds and nanoseconds*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> aliceWords;
        String setType;

        // Command line arguments initialize Set using polymorphism
        if(args.length < 1) {
            System.out.println("No arguments");
            return;
        }
        else if (args[0].equals("ts")) {
            setType = "TreeSet";
            aliceWords = new TreeSet<>();
        }
        else if (args[0].equals("hs")) {
            setType = "HashSet";
            aliceWords = new HashSet<>();
        }
        else {
            System.out.println("Invalid argument");
            return;
        }

        // Initialize scanner with book file
        File bookFile = new File("alice.txt");
        Scanner s = null;
        try {
            s = new Scanner(bookFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Load Set with words
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        while (s.hasNext()) {
            aliceWords.add(s.next());
        }
        endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Elapsed time for loading " + setType + ": " + duration + " milliseconds");

        // Search set for word 100 times
        boolean search = false;
        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
           search = aliceWords.contains("dog");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;

        System.out.println("Elapsed time for searching " + setType + ": " + duration + " nanoseconds");
    }
}
