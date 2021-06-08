import java.util.*;
public class Program2
{
    public static void main(String[] args)
    {
        System.out.print("Enter the size of the array: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,m=0;
        int[] b_num=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(i=0;i<n;i++)
        {
            b_num[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if (b_num[i] == 0)
                m++;
        }
        System.out.print("After sorting:[");
        for(i=0;i<n;i++)
        {
            if(i<m)
                b_num[i]=0;
            else
                b_num[i]=1;
            System.out.print(b_num[i]);
            if(i!=(n-1))
                System.out.print(", ");
        }
        System.out.print("]");
    }
}