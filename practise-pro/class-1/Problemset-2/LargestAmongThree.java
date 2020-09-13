import java.io.*;
import java.util.Scanner;
public class LargestAmongThree
{
           public static void main(String args[]){
                    //Scanner in = new Scanner(System.in);
                    //int a = in.nextInt();
                    //int b = in.nextInt();
                    //int c = in.nextInt();

                    int a = Integer.parseInt(args[0]);
                    int b = Integer.parseInt(args[1]);
                    int c = Integer.parseInt(args[2]);

                    int largest = (a >= b && a >= c) ? a : (b >= c && b >= a) ? b : c;

                    System.out.println(largest);

           }
}
