
// Experiment 21
 
import java.util.Scanner;
import java.util.ArrayList;
 
public class Experiment21 {
    public static ArrayList<Integer> removeBadElement(ArrayList<Integer> list) {
        if (list.size() == 0 || list.size() % 2 == 0) {
            return list;
        } else {
            list.remove(list.size() - 1);
            return list;
        }
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();
 
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter elements in the list: ");
 
        for (int i = 0; i < size; i++) {
            list.add(input.nextInt());
        }
 
        ArrayList<Integer> goodList = removeBadElement(list);
        System.out.print("Good list: ");
        for (int num : goodList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
