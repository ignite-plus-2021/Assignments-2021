package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x");
        int x = in.nextInt();
        int A[] = new int[40] ;
        int i;
        for(i=0;x>0;i++)
        {
            A[i]=x%2;
            x=x/2;
        }

          for(i=i-1 ; i>=0;i--)
          {
              System.out.print(A[i]);
          }
    }

}



