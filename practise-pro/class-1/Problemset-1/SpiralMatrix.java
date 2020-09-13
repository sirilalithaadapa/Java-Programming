import java.io.*;
public class SpiralMatrix{
    public static void main(String []args){
        int k = 0;
		int n = 5;
		int[][] arr = new int[n][n];

		for (int i = 0; i < n/2; ++i)
		{
		    for (int a = i,b = i; b < n - i - 1; ++b)
		    {
		        k += 1;
		       // System.out.printf("%d %d k = %d\n",a, b, k);
		        arr[a][b] = k;
		    }

		    for (int a = i,b = n - i - 1; a < n - i - 1; ++a)
		    {
		        k += 1;
		       // System.out.printf("%d %d k = %d\n",a, b, k);
		        arr[a][b] = k;
		    }

		    for (int a = n - i - 1,b = n - i - 1; b > i; --b)
		    {
		        k += 1;
		       // System.out.printf("%d %d k = %d\n",a, b, k);
		        arr[a][b] = k;
		    }


		    for (int a = n - i - 1,b = i; a > i; --a)
		    {
		        k += 1;
		      //  System.out.printf("%d %d k = %d\n",a, b, k);
		        arr[a][b] = k;
		    }

		}
		arr[n/2][n/2] = n * n;

		for (int i = 0; i < n; ++i)
		{
		    for (int j = 0; j < n; ++j)
		    {
		        System.out.printf("%d ",arr[i][j]);
		    }
		    System.out.println();
		}
       }
}
