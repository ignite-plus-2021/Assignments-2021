//Write a program to find Leap year

import java.util.*;
public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year= sc.nextInt();
        int leap = 0;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = 1;
                else
                    leap = 0;
            }

            else
                leap = 1;
        }
        else
            leap = 0;
        if (leap==1)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");

    }
}

