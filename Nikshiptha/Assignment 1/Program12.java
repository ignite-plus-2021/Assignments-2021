import java.util.*;
public class Program12
{
    public static void main(String[] args)
    {
        System.out.print("Enter the value of n:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i+j)%2==0)
                    System.out.print("*  ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
/* Output:
Enter the value of n:10
*   *   *   *   *
  *   *   *   *   *
*   *   *   *   *
  *   *   *   *   *
*   *   *   *   *
  *   *   *   *   *
*   *   *   *   *
  *   *   *   *   *
*   *   *   *   *
  *   *   *   *   *

 */