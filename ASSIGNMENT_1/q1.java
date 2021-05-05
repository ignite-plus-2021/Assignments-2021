package com.company;

import java.util.*;

public class q1 {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);

        if(a==b && b==c && a==c)
            System.out.println("EQUAL");
        else
            System.out.println("NOT EQUAL");

    }
}
