//Q9. Write a program to find Leap year.

import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter number: ");
        int year = in.nextInt();

        if ((year % 400) == 0)
            System.out.println("it is a leap year");
        else if ((year % 100) == 0)
            System.out.println("it is not a leap year");
        else if ((year % 4) == 0)
            System.out.println("it is a leap year");
        else
            System.out.println("it is not a leap year");

    }
}
