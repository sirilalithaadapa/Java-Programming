import java.util.ArrayList;
import java.util.Scanner;

public class Experiment19 {

    public static ArrayList<Integer> removeBadPairs(ArrayList<Integer> numbers) {
        ArrayList<Integer> newNumbers = new ArrayList<Integer>();
        for (int i = 0; i < numbers.size(); i += 2) {
            if (numbers.get(i) <= numbers.get(i + 1)) {
                newNumbers.add(numbers.get(i));
                newNumbers.add(numbers.get(i + 1));
            }
        }

        return newNumbers;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of ArrayList: ");
        int size = input.nextInt();

        System.out.println("Enter elements: ");
        ArrayList<Integer> numbers = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            numbers.add(input.nextInt());
        }

        ArrayList<Integer> newNumbers = removeBadPairs(numbers);

        System.out.print("After removing bad pairs: ");
        for (int i = 0; i < newNumbers.size(); i++) {
            System.out.print(newNumbers.get(i) + " ");
        }
        System.out.println();
    }
}
