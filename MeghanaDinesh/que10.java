package com.practice;
import java.util.Scanner;
public class que10
{
    public static int gcd(int num1,int num2)
    {
        if(num2==0)
            return num1;
        return gcd(num2,num1%num2) ;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        int ans=gcd(num1,num2);
        System.out.println("GCD="+ans);
    }
}
