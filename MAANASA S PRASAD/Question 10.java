package com.company;
import java.util.Scanner;

public class Main {
    public static void gcd(int x, int y)
    {

        if (x > y)
        {
            if (x % y == 0)
            {
                System.out.println("GCD is " + y);
            }
        }
        else
            {
                System.out.println("GCD is " + x);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x");
        int x = in.nextInt();
        System.out.println("Enter y");
        int y = in.nextInt();
        gcd(x,y);

    }
}