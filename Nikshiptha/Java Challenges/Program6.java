import java.util.*;
class Program6 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a year: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if((n%4==0&&n%100!=0)||n%400==0)
			System.out.println(n +" is a leap year");
		else
			System.out.println(n+" is not a leap year");
	}
}
