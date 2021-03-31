package com.company;

import java.util.Scanner;

public class ques3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        int n= sc.nextInt();
        int i=0;
        while(true){
            x=Math.pow(2,i);
            if(x>n) break;
            System.out.println((int)(Math.pow(2,i)));
            i++;
        }


    }
}
