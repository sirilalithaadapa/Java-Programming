import java.util.Scanner;
import java.util.ArrayList;

public class Experiment20 {
    
    public static ArrayList<ArrayList<Integer>> removeBadPairs(ArrayList<ArrayList<Integer>> pairs) {
        ArrayList<ArrayList<Integer>> filteredPairs = new ArrayList<>();

        for (ArrayList<Integer> pair : pairs) {
            if (pair.get(0) > pair.get(1)) {
                continue;
            }

            filteredPairs.add(pair);
        }

        return filteredPairs;
    }


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of pairs: ");
        int numOfPairs = input.nextInt();

        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < numOfPairs; i++) {
            System.out.print("Enter pair number " + (i + 1) + " : ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(num1);
            pair.add(num2);

            pairs.add(pair);
        }

        ArrayList<ArrayList<Integer>> filteredPairs = removeBadPairs(pairs);
        ArrayList<Integer> goodNumbers = new ArrayList<>();

        for (ArrayList<Integer> pair : filteredPairs) {
            goodNumbers.add(pair.get(0));
            goodNumbers.add(pair.get(1));
        }

        System.out.print("\nGood numbers: ");
        for (int num : goodNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();


        /*
        Sample output:
        -------------
        Enter number of pairs: 7
        Enter pair number 1 : 3 7
        Enter pair number 2 : 9 2
        Enter pair number 3 : 5 5
        Enter pair number 4 : 8 5
        Enter pair number 5 : 6 3
        Enter pair number 6 : 4 7
        Enter pair number 7 : 3 1
        Good numbers: 3 7 5 5 4 7 
         */
    }
}
