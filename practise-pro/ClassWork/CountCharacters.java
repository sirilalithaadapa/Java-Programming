import java.io.*;
import java.util.Scanner;
public class CountCharacters{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("Length of input " + input.length());
		String str = input.replaceAll("\\s","");
		System.out.println("Number of characters are: "+str.length());
		System.out.println(str);	
	}
}
	
