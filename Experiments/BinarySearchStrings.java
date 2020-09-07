import java.io.*;
import java.util.*;

public class BinarySearchStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] words = sentence.split("\\s+");

        // Sort using bubble Sort
        for (int i = 0; i < words.length - 1; ++i) {
            for (int j = 0; j < words.length - i - 1; ++j) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted words in sentence: ");
        for (String word : words)
            System.out.println(word);

        System.out.println("Enter a word to search: ");
        String key = input.next();

        // Apply binary search
        int low = 0;
        int high = words.length - 1;
        boolean notFound = true;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key.compareTo(words[mid]) == 0) {
                System.out.println("Key Found at position " + mid);
                notFound = false;
                break;
            }
            else if (key.compareTo(words[mid]) > 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (notFound) {
            System.out.println("Key not Found :(");
        }

    }
}
