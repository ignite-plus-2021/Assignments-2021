/*Write a program that takes an integer command-line argument n and prints all the positive powers of 2 less than
or equal to n. Make sure that your program works properly for all values of n.
*/
import java.util.*;
public class question3 {
    public static void main(String[] args){
        long i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        long n = sc.nextLong();
        while(((int)Math.pow(2,i))<=n){
            System.out.print((int)(Math.pow(2,i))+" ");
            i++;
        }
    }
}
