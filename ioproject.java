import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File inFile = new File("inFile");
        File outFile = new File("outFile");

        PrintWriter output = null;
        Scanner input = null;
        try {
            output = new PrintWriter(outFile);
            input = new Scanner(inFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (input.hasNextLine()) {
            String outString  = input.nextLine();
            output.println(outString);
        }
        output.close();
    }
}