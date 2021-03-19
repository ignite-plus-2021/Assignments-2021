/*Q1. Write a program that takes three integer command-line arguments and prints equal
if all three are equal, and not equal otherwise.*/

import java.util.*;
public class question1 {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if (((num1 == num2) && (num1 == num3))) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
