package target.assignment;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Year : ");
        int year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Year " + year + " is a LEAP YEAR");
        else
            System.out.println("Year " + year + " is NOT A LEAP YEAR");

    }
}
/*
Enter an Year : 2021
Year 2021 is NOT A LEAP YEAR
 */