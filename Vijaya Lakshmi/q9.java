package com.company;

import java.util.Scanner;

public class q9 {

    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        System.out.println("enter  any year");
        int n=in.nextInt();

        if((n%4==0 && n%100!=0 ) || n%400==0)
           System.out.println("LEAP YEAR");

        else
            System.out.println("NOT LEAP YEAR");

}}
