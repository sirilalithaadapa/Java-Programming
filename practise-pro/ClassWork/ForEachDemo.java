/* A Demo on For Each Loop
	Print the elements in an array using Enhanced for loop
	Reading data/input using Scanner
*/
import java.io.*;
import java.util.*;
public class ForEachDemo{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int ar[] = new int[] { 10,20,30,40,50};
		for(int i : ar){
			System.out.print( i +" ");
		}
	}
}
