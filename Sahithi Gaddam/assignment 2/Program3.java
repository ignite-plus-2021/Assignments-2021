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