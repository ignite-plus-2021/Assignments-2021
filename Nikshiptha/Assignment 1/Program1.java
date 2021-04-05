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
/* Output:
       ==>   Enter three numbers: 5 4 1
             The numbers are not equal

       ==>   Enter three numbers: 5 5 5
             All the numbers are equal

 */