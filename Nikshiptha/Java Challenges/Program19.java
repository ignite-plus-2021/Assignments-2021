import java.util.*;
class Program19 
{
	public static void main(String[] args) 
	{
		int flag=0;
		System.out.print("Enter a number : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=n;
		while(c!=1)
		{
			if(c%5==0)
				c=c/5;
			else if(c%3==0)
				c=c/3;
			else if(c%2==0)
				c=c/2;
			else
			{
				flag=1;
				break;
			}
		}
		if(flag==1||n==1)
			System.out.println(n+" is not an ugly number");
		else
			System.out.println(n+" is an ugly number");
	}
}
