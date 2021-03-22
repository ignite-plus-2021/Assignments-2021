package com.practice;
import java.util.*;
public class que11
{
    public static void main(String args[])
    {
        int rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int num=sc.nextInt();
        int binary[]=new int[40];
        int m=num;
        int index=0;
        while(m>0)
        {
            rem=m%2;
            binary[index++]=rem;
            m=m/2;
        }
        for(int i=index-1;i>=0;i--)
            System.out.print(binary[i]);

    }
}
