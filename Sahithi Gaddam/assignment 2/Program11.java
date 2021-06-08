import java.util.*;
public class Program11
{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rem=0;
        int m=n;
        int i=(int)(Math.log(n)/Math.log(2));
        int[] bin=new int[i+1];
        while(n!=0)
        {
            rem = n % 2;
            n = n / 2;
            bin[i] = rem;
            i--;
        }
        System.out.print("The binary number of "+ m+" is: ");
        for(i=0;i<bin.length;i++)
        {
            System.out.print(bin[i]);
        }
    }
}