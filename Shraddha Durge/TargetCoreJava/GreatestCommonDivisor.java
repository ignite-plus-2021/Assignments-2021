package target.assignment;

import java.util.Scanner;

public class GreatestCommonDivisor {
    //find GCD of two number using Euclid's method
    private static int findGCD(int number1, int number2)
    {
        if(number2 == 0)
        {
            return number1;
        }
        return findGCD(number2, number1%number2);
    }

    public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter first number : ");
         int number1 = scanner.nextInt();

         System.out.print("Enter second number : ");
         int number2 = scanner.nextInt();

         System.out.println("GCD of " + number1 +" and " + number2 +" : " + findGCD(number1,number2));
    }
}

/*
Enter first number : 48
Enter second number : 22
GCD of 48 and 22 : 2
 */