package com.company;


import java.util.Scanner;
public class Main
{
    public static void power()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        int n=in.nextInt();
        int k=1;
        if(n==0)
        {
            System.out.println("2");
        }
        else
        {
            for(int i=0;i<=n-1;i++)
            {

                k=k*2;
                System.out.println(k);

            }
        }

    }
    public static void main(String[] args)
    {
        power();
    }

}

