//Q12. Write a program Checkerboard that takes an integer command-line argument n and uses a loop
//        nested within a loop to print out a two-dimensional n-by-n checkerboard pattern with
//        alternating spaces and asterisks.


import java.util.Scanner;

public class ques12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++){
                    if(j%2==0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

            }
            else {
                for (int j = 0; j < n; j++){
                    if(j%2==0)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }

            System.out.println();
        }


    }
}

