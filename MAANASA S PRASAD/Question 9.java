package com.company;

import java.util.Scanner;
class Main
{
    public static void leap()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter year to check");
        int n=in.nextInt();
        if (n % 400 == 0)
        {
            System.out.println("Leap year");

        }
        else if(n%100==0)
        {
            System.out.println("Not a leap year");
        }
        else if(n%4==0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }

    }
    public static void main(String[] args)
    {
        leap();
    }
}
