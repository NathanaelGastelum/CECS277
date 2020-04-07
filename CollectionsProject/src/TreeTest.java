import java.util.Scanner;
import java.util.TreeMap;

public class TreeTest {
    /*for each Qword in txt file
         Enter into TreeMap
      Print load time

      for each letter
          Enter letter and value into TreeMap

      for each qword in TreeMap
          for each letter in qword
              Sum values from letter TreeMap

      Print Qword TreeMap
      Print search time
    */
    public void load (String filePath) {
        Scanner s = new Scanner(filePath);
        TreeMap qWords = new TreeMap();

        while (s.hasNextLine()) {
            qWords.put(s.nextLine(), null);
        }
    }

    public void score (TreeMap words, TreeMap scores) {
        words.forEach( );
    }
}