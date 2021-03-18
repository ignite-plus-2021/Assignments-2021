package assignment1;

import java.util.Scanner;

public class ques10 {
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

        return gcd(a%b, a);
    }
    public static void main(String args[]){
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and y");
        x = sc.nextInt();
        y = sc.nextInt();
        if(x%y == 0)
            System.out.println("GCD(" + x +  " , " + y+ ") = "+ y);
        else
            System.out.println("GCD(" + x +  " , " + y+ ") = " + gcd(x,y));
    }
}
