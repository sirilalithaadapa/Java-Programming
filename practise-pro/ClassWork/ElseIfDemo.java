/* A Sample Demo for else if */
import java.io.*;
public class ElseIfDemo{
	public static void main(String args[]){
		int input = Integer.parseInt(args[0]);
		if(input > 0){
			System.out.println(input + " is Positive");
			//printf("%d is positive",input);
		}
		else if(input < 0){
			System.out.println(input + " is Negative");
		}
		else{
			System.out.println(input + " is neither Positive or Negative");
		}
	}
}
