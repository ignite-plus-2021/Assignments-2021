import java.util.*;
public class Program1
{
    public static void main(String args[])
    {
        System.out.print("Enter three numbers: ");
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a==b && b==c && c==a)
            System.out.println("All the numbers are equal");
        else
            System.out.println("The numbers are not equal");

    }
}