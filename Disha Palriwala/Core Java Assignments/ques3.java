package com.company;
import java.util.Scanner;
public class ques3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double x = 0;
        int k=-1;
        while(x<=n){
            k++;
            x=Math.pow(2,k);
            if(x<=n)
                System.out.print(x+ " ");
        }
    }
}

