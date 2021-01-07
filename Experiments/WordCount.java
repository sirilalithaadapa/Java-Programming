import java.util.HashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sentence:");
        String inputString = input.nextLine();
        String[] words = inputString.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("Word\tCount");
        for (String word : wordCount.keySet()) {
            System.out.println(word + "\t" + wordCount.get(word));
        }
    }
}
