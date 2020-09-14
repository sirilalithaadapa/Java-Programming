//Square.java - Siri Lalitha

import java.util.Scanner;

public class Square
{
   //Constructs a n x n square filled with zeros.

   public Square(int n)
   {
	  size = n;
	  board = new int[size][size];
	  for (int i = 0; i < size; i++)
	  {
		 for (int j = 0; j < size; j++)
		 {
			board[i][j] = 0;
		 }
	  }
   }

   //Adds a number to the square.

   public void add(int aNumber)
   {
	  try
	  {
		 if (col > size - 1)
		 {
			row++;
			col = 0;
		 }
		 board[row][col] = aNumber;
		 col++;
	  }
	  catch(ArrayIndexOutOfBoundsException ex)
	  {
		 System.err.println("Too many Numbers!  The square is already full.");
	  }
   }

      //Checks if the square is a Magic Square. Returns true if and only if the square is a Magic Square.

      public boolean isMagic()
      {
   	  boolean isMagic = false;

   	  /**
   		 Add up each column, add up each row, and the diagonals. If they are all the same, the square is magic. Store each sum in an array.
   		 Compare each sum to see if they're all the same. If they are the same, it's a magic square.
   	  */

   	  int sum = 0;
   	  int[] theSums = new int[size + size + 2];
   	  int index = 0;
   	  for (int j = 0; j < size; j++)
   	  {
   		 for (int i = 0; i < size; i++)
   		 {
   			sum += board[i][j];
   		 }
   		 theSums[index] = sum;
   		 index++;
   		 sum = 0;
   	  }
   	  int compareToThis = theSums[0];
   	  for (int x: theSums)
   	  {
   		 if (x == compareToThis)
   		 {
   			isMagic = true;
   		 }
   		 else
   		 {
   			isMagic = false;
   		 }
   	  }
   	  return isMagic;
   }

   //Returns a String representation of the square.

   public String toString()
   {
	  String r = "";
	  for (int i = 0; i < size; i++)
	  {
		 r = r + "|";
		 for (int j = 0; j < size; j++)
		 {
			if (board[i][j] < 10)
			{
			   r = r + "0" + board[i][j] + "|";
			}
			else
			{
			   r = r + board[i][j] + "|";
			}
		 }
		 r = r + "\n";
	  }
	  return r;
   }

   int[][] board;
   int size;
   int row = 0;
   int col = 0;

   //Tests the Square class.

   public static void main(String[] args)
   {
	  Scanner in = new Scanner(System.in);
	  final int SIZE = 4;
	  Square ms = new Square(SIZE);
	  System.out.println("Enter the numbers for a " + SIZE + "x" + SIZE + " magic square.");
	  for (int i = 0; i < SIZE * SIZE; i++)
	  {
		 System.out.print(i + 1 + ": ");
		 if (in.hasNextInt())
		 {
			ms.add(in.nextInt());
		 }
	  }

	  if (ms.isMagic())
	  {
		 System.out.println("Congratulations!  This is a magic square.");
	  }
	  else
	  {
		 System.out.println("Not a magic square.");
	  }
	  System.out.println(ms.toString());
   }
}
