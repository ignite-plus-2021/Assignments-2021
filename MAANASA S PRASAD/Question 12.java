package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x");
        int x = in.nextInt();
        int length = x;
        int height = x;

        for (int i = 0; i <= height; i++)
        {
            if (i % 2 == 0)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= length; j++)
            {
                if (j % 2 == 0)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}