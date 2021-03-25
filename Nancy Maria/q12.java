package com.assignment;

public class q12 {
    public static void main(String[] args) {

        int length = 5;
        int height = 5;

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
                else if (j != length || i % 2 != 0)
                {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
