/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class transpose
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int array[][]=new int[m][n];
		System.out.println("Enter matrix:");
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				array[i][j]=sc.nextInt();
				System.out.println(" ");
			}
		}
	  	for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.println(array[j][i]+" ");
			}
		}
	}
}
