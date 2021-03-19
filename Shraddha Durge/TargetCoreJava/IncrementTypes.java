package target.assignment;

import java.util.Scanner;

public class IncrementTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Original value of i : " );
        int i = sc.nextInt();
        int temp = i;

        //In ++i, increment is done before the assignment
        System.out.println("Value after ++i : " + ++temp);

        temp = i;
        //In i++, increment is done after the assignment
        System.out.println("Value after i++ : " + temp++);

        temp = i;
        int n = temp+3;

        System.out.println("Value after ++i in while loop : ");
        while(++temp < n) {  //The comparison takes place after the value has been incremented
            System.out.println(temp);
        }

        temp = i;

        System.out.println("Value after i++ in while loop: ");
        while(temp++ < n) {  //value is compared before it is incremented.
            System.out.println(temp);
        }
    }
}

/*
Original value of i : 8
Value after ++i : 9
Value after i++ : 8
Value after ++i in while loop :
9
10
Value after i++ in while loop:
9
10
11
 */