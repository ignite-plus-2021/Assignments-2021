package com.company;

public class Q1 {
    public static void main(String[] args)
    {
        if(Integer.parseInt(args[0])==Integer.parseInt(args[1]) && Integer.parseInt(args[1])==Integer.parseInt(args[2]))
        {
            System.out.println("The 3 numbers are Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}