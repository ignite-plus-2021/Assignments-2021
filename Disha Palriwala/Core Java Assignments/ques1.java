package com.company;
import java.util.Scanner;
public class ques1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        if(x==y && y==z)
            System.out.print("equal");
        else
            System.out.print("not-equal");
    }
}
