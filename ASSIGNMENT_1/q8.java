package com.company;

import java.util.Scanner;

public class q8 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any number:");
        int n = in.nextInt();

        int a[] = new int[100];

        System.out.println("enter  any array values:");
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();

        //BUBBLE SORT

        for (int i = 0; i < n-1; i++) {

           int flag=0;

            for (int j = 0; j < n - i - 1; j++) {

                if (a[j] > a[j + 1]) {

                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    flag=1;
                }
            }

            if(flag==0)
                break;


        }
        // sorted array

        for( int i=0;i<n;i++)
            System.out.print(a[i] +" ");
    }
}
