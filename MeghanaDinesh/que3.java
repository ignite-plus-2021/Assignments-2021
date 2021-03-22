import java.lang.Math;
public class que3
{
    public static void main(String args[])
    {
        int n=0;
        try
        {
           n=Integer.parseInt(args[0]);
        }
        catch(Exception e)
        {
            System.out.println("Enter an integer command line arguement");
            System.exit(1);

        }
        int pow=1;
        double ans=1;
        while(ans<n)
        {
	    System.out.println(ans);
            ans=Math.pow(2,pow);
            pow++;
        }
    }

}
