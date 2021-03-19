/*Write a program Checkerboard that takes an integer command-line argument n and uses a loop nested
within a loop to print out a two-dimensional n-by-n checkerboard pattern with alternating spaces and asterisks.
 */

import java.util.*;
public class question12 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j<(n+i);j++){
                if(j%2==0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }
}
