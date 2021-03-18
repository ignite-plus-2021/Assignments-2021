//Q.1 Write a program that takes three integer command-line arguments
// and prints equal if all three are equal, and not equal otherwise.

import java.util.*;
public class ques1 {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                System.out.print("Input first number: ");
                int num1 = in.nextInt();
                System.out.print("Input second number: ");
                int num2 = in.nextInt();
                System.out.print("Input third number: ");
                int num3 = in.nextInt();


                if (num1 == num2 && num2 == num3 )
                {
                    System.out.println("Numbers are equal.");
                }
                else
                {
                    System.out.println("Numbers are not equal!");
                }

    }

}
