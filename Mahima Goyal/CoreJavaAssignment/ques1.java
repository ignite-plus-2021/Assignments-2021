//Write a program that takes three integer command-line arguments and prints equal if all three are equal, and not equal otherwise.

package com.company;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a==b)&&(b==c))
            System.out.print("Equal");
        else
            System.out.print("Not equal");
    }
}

