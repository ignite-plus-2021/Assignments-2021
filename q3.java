package com.company;

import java.util.*;

public class q3 {

    public static void main(String[] args) {
        // write your code here

        Scanner in=new Scanner(System.in);
        System.out.println("enter any number:");
        double n=in.nextDouble();

        if(n<0)
      System.out.println("Enter only positive integers");

        else
        {
            double i=1;
            double k=0;
            while(i<n)
            {


            System.out.print(i+"  ");
                i=Math.pow(2,k++);

            }
        }


    }
}
