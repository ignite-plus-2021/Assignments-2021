package assignment1;

import java.util.Scanner;

public class ques12 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0)
                        System.out.print(" ");
                    else
                        System.out.print("*");

                }

            }
            System.out.println();
        }
    }
}
