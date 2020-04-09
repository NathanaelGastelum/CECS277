/*  Nathanael Gastelum
    April 9, 2020
    Purpose: This program times how long it takes a Map to load Keys and then search for
    their values
    Inputs: One Command Line argument to decide which Map to test
    Outputs: Scrabble scores for Q without U words and the time it took to complete
    the task in nanoseconds*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapTest {

    public static void main(String[] args) {
        Map<String, Integer> qWords;

        // Command line arguments initialize Map using polymorphism
        if(args.length < 1) {
            System.out.println("No arguments");
            return;
        }
        else if (args[0].equals("tm")) {
            System.out.println("Using TreeMap");
            qWords = new TreeMap<>();
        }
        else if (args[0].equals("hm")) {
            System.out.println("Using HashMap");
            qWords = new HashMap<>();
        }
        else {
            System.out.println("Invalid argument");
            return;
        }

        // Load Keys into TreeMap
        long startTime, endTime;
        startTime = System.nanoTime();
        File wordsFile = new File("QWords.txt");
        Scanner s = null;
        try {
            s = new Scanner(wordsFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (s.hasNextLine()) {
            qWords.put(s.nextLine(), null);
        }
        endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time for loading into Map " + duration + " nano-seconds");

        // Calculate score Value based on Key name in TreeMap
        TreeMap<String, Integer> scores = new TreeMap<>();
        File scoreFile = new File("LetterValues.txt");
        try {
            s = new Scanner(scoreFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (s.hasNext()) {
            scores.put(s.next(), s.nextInt());
        }

        startTime = System.nanoTime();
        // Calculate values
        for(Map.Entry<String, Integer> entry : qWords.entrySet()) {
            int sum = 0;
            for (char c : entry.getKey().toCharArray()) {
                sum += scores.get(String.valueOf(c));
            }
            entry.setValue(sum);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;

        // Print TreeMap entries
        for(Map.Entry<String, Integer> entry : qWords.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
        System.out.println("Time for searching Map " + duration + " nano-seconds");
    }
}