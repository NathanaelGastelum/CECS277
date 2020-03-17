/*
    Nathanael Gastelum
    March 17, 2020
    Purpose:
    */

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if(args.length < 1) {
            System.out.println("No arguments, use \"h\" for help");
            return;
        }

        if (args[0].equals("h")) {
            System.out.println("Needs 2 file path arguments: source and destination");
            return;
        }

        String inFilePath = null;

        try {
            inFilePath = args[0];
        } catch (Exception e) {
            System.out.println("Not enough arguments");
            return;
        }

        File inFile = null;

        inFile = new File(inFilePath);

        Scanner input;

        try {
            input = new Scanner(inFile);
        } catch (FileNotFoundException e) {
            System.out.println(inFilePath + " does not exist ");
            return;
        }


        String outFilePath = null;
        File outFile = null;
        FileWriter output = null;

        while (input.hasNextLine()) {
            String outString  = input.nextLine();
            String[] outStrings = outString.split(";");

            outFilePath = outStrings[1] + ".txt";

            try {
                output = new FileWriter(outFilePath, true);
            } catch (IOException e) {
                System.out.println("Unable to write to file");
            }

            try {
                output.write(outString + "\n");
                output.close();
            } catch (IOException e) {
                System.out.println("Unable to write to file");
            }
        }
    }
}