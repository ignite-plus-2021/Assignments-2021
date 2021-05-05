package com.company;

import java.util.*;

public class q11 {

    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);

        System.out.println("enter any number:");
        int n=in.nextInt();

        StringBuilder s=new StringBuilder("");
        while(n>0)
        {
            if(n%2==0)
                s.append('0');
            else
                s.append('1');
            n/=2;


        }

        System.out.print("BINARY NUMBER:");
        System.out.println(s.reverse());






    }
}
