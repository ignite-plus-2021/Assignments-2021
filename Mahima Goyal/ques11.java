package com.company;

import java.util.Scanner;
public class ques11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        int[] binNum = new int[100];
        int i=1;
        while(n>0) {
            binNum[i++] = n%2;
            n = n/2;
        }
        System.out.print("Binary form: ");
        for(int j=i-1; j>0; j--)
            System.out.print(binNum[j]);
    }
}
