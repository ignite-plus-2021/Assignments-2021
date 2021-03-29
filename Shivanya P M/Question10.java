package TargetAssignment;
import java. util. Scanner;
public class Question10 {

    static class Test
    {

        static int gcd(int a, int b)
        {

            if (a == 0)
                return b;
            if (b == 0)
                return a;


            if (a == b)
                return a;


            if (a > b)
                return gcd(a-b, b);
            return gcd(a, b-a);
        }


        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Type a number:");
            int a = input.nextInt();
            System.out.println("Type another number:");
            int b = input.nextInt();

            System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
        }
    }

}
