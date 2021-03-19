/*Write a program GreatestCommonDivisor that finds the greatest common divisor (gcd) of two integers using
Euclid’s algorithm, which is an iterative computation based on the following observation: if x is
greater than y, then if y divides x, the gcd of x and y is y;
otherwise, the gcd of x and y is the same as the gcd of x % y and y.
 */

import java.util.*;
public class question10 {
    public static int GreatestCommonDivisor(int num1, int num2)
    {
        if (num1 == 0)
            return num2;

        return GreatestCommonDivisor(num1%num2, num1);
    }
    public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("GreatestCommonDivisor of the two numbers is " + GreatestCommonDivisor(a,b));
    }
}
