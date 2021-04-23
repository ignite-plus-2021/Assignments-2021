import java.util.*;
public class Assignment3 {
    public static void main(String[] args){
        /*
        Write a program that takes an integer command-line argument n and prints all the positive powers of 2 less than or equal
        to n. Make sure that your program works properly for all values of n.
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("If you want ot use this program type 1 else 0");
        int str=sc.nextInt();
        System.out.println();
        while(str!=0) {
            System.out.print("ENTER THE VALUE OF n : ");
            int n = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                if (Math.pow(2, i) <= n)
                    System.out.print((int) Math.pow(2, i) + " ");
            }
            System.out.println();
            System.out.println("If you want ot use this program type 1 else 0");
            str=sc.nextInt();
        }
        System.out.println("PROGRAM ENDED");
    }
}
