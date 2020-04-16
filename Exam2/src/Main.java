import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Handle command line arguments
        if(args.length < 1) {
            System.out.println("No arguments");
            return;
        }

        String sourceFile, targetFile, oldString, newString;

        try {
            sourceFile = args[0];
            targetFile = args[1];
            oldString = args[2];
            newString = args[3];
        } catch (Exception e) {
            System.out.println("Invalid arguments");
            return;
        }
        File inFile = new File(sourceFile);
        Scanner in;

        try {
            in = new Scanner(inFile);
        } catch (FileNotFoundException e) {
            System.out.println(sourceFile + " does not exist ");
            return;
        }

        // Replace code
        while (in.hasNext()) {
            String word = in.next();
            if (word.equals(oldString)) {
                word = newString;
            }
            try (FileWriter output = new FileWriter(targetFile, true)) {
                output.write(word  + " ");
            } catch (IOException e) {
                System.out.println("Unable to write to file");
            }
        }
    }
}
