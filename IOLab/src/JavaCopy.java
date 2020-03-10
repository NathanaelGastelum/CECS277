import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaCopy {

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
        String outFilePath = null;
        try {
            inFilePath = args[0];
            outFilePath = args[1];
        } catch (Exception e) {
            System.out.println("Not enough arguments");
            return;
        }

        File inFile = null;
        File outFile = null;

        inFile = new File(inFilePath);
        outFile = new File(outFilePath);


        PrintWriter output;
        Scanner input;

        try {
            output = new PrintWriter(outFile);
            input = new Scanner(inFile);
        } catch (FileNotFoundException e) {
            System.out.println(inFilePath + " does not exist ");
            return;
        }

        while (input.hasNextLine()) {
            String outString  = input.nextLine();
            output.println(outString);
        }
        output.close();
    }
}