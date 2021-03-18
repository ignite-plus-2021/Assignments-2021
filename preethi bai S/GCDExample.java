package myproject;
import java.util.Scanner;

public class GCDExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number to find gcd");
		int n1=sc.nextInt();
		System.out.println("enter the second number to find gcd");
		int n2=sc.nextInt();
		System.out.println("gcd of two number is" +n1+ "and" +n2+ "is:" + findGCD(n1,n2));
		
		}
	private static int findGCD(int n1, int n2)
	{
		if(n2 == 0)
		{
			return n1;
		}
	    return findGCD(n2, n1%n2);
	}

}
