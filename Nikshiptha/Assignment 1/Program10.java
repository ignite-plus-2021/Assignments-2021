import java.util.*;
public class Program10
{
    public static void main(String[] args) {
        System.out.print("Enter the two numbers: ");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int g=gcd(x,y);
        System.out.println("The gcd is: "+g);
    }
    public static int gcd(int a,int b)
    {
        if(a>b)
        {
            return a%b==0?b:gcd(a%b,b);
        }
        else
        {
            a=a*b;
            b=a/b;
            a=a/b;
            return gcd(a,b);
        }
    }
}
/* Output:Enter the two numbers: 8	12
          The gcd is: 4
 */

