/*  Write a program that takes an integer command-line argument n and prints all the positive powers of 2 less than or equal to n. Make sure that your program works properly for all values of n.
*/
import java.util.*;
import java.lang.Math;
public class Program3
{
    public static void main(String[] args)
    {
        System.out.print("Enter the value of n: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=0;
        System.out.print("The powers of 2 less than or equal to "+n+" are ");
        while(Math.pow(2,k)<=n)
        {
            System.out.print((int)Math.pow(2,k)+" ");
            k++;
        }
    }
}
/* Output:
Enter the value of n: 1024
The powers of 2 less than or equal to 1024 are 1 2 4 8 16 32 64 128 256 512 1024
*/