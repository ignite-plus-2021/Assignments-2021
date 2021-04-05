package com.company;
import java.util.Scanner;
public class ques11 {
    public static void main(String[] args) {
        String x = "";
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n > 0)
        {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        System.out.println(x);
        }
    }

