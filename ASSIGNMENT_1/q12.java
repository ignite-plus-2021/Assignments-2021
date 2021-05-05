package com.company;

import java.util.Scanner;

public class q12 {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=in.nextInt();


        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=n;j++)

            {
                if(j%2==0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
