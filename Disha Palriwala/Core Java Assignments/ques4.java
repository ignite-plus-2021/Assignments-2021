package com.company;

public class ques4 {
    public static void main(String[] args){
        int i=2,x=0,y=0;
        x=++i;
        System.out.print("Pre-increment:\nx="+x +" i="+i);
        i=2;
        y=i++;
        System.out.print("\nPost-increment:\ny="+y +" i="+i);
    }
}
