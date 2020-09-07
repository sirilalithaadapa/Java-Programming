import java.io.*;
import java.util.Scanner;
public class MilkManAndBottles {
         public static void main(String [] args) {
         
        //Write your code here
        
       int[] sizes = {10, 7, 5, 1};

       // Scanner for taking input
       
       Scanner in = new Scanner(System.in);

       int tests = in.nextInt();
       int liters, numBottles, bottlesPerLitre;

       while(tests > 0)
       {
           liters = in.nextInt();
           if (liters == 0)
           {
               System.out.println(0);
               continue;
           }
           numBottles = 0;

           for (int i: sizes)
           {
               bottlesPerLitre = liters / i;
               numBottles += bottlesPerLitre;
               liters -= bottlesPerLitre * i;
           }

           System.out.println(numBottles);
           tests -= 1;
       }
	}
}
