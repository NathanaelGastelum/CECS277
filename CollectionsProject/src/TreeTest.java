import java.util.Map;
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
    // Load Keys into TreeMap
    public void load (String filePath) {
        Scanner s = new Scanner(filePath);
        TreeMap<String, Integer> qWords = new TreeMap();

        while (s.hasNextLine()) {
            qWords.put(s.nextLine(), null);
        }
    }

    // Calculate score Value based on Key name in TreeMap
    public void score (TreeMap<String, Integer> words, TreeMap<Character, Integer> scores) {
        for(Map.Entry<String, Integer> entry : words.entrySet()) {
            int sum = 0;
            for (char c : entry.getKey().toCharArray()) {
                sum += scores.get(c);
            }
        }
    }
}