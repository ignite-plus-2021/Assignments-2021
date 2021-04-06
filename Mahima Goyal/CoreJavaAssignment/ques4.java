package com.company;

public class ques4 {

    public static void main(String[] args) {
        int i=5,a=0,b=0;
        a=++i;
        System.out.print("Pre-increment:\na="+a+" i="+i);
        i=5;
        b=i++;
        System.out.print("\nPost-increment:\nb="+b+" i="+i);
    }
}
