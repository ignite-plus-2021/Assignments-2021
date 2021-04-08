import java.util.*;
class Program5 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sqrt=(int)Math.sqrt(n);
		if(sqrt*sqrt==n)
			System.out.println(n+" is a perfect square");
		else
			System.out.println(n+ " is not a perfect square");
	}
}
