//Q3. Write a program that takes an integer command-line argument n and prints all the
//        positive powers of 2 less than or equal to n. Make sure that your program works
//        properly for all values of n.


import java.util.Scanner;
import java.lang.Math;

public class ques3 {
    public static void main(String[] args){

        long m = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("enter value of n: ");
        long n = in.nextInt();
        if (n>=1) {
            while (n >= Math.pow(2, m)) {
                System.out.println(Math.pow(2,m));
                m++;
            }
        }
        else System.out.print("invalid input");
    }
}
