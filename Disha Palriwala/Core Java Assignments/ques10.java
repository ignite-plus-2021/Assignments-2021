package com.company;
import java.util.Scanner;
public class ques10 {
    public static int gcd(int x, int y){
        if(x==0)
            return y;
        return gcd(y%x,x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int g = gcd(x, y);
        System.out.print(g);
    }
}
