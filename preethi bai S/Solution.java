package myproject;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("input first number:");
		int n1=in.nextInt();
		System.out.println("input Second number:");
		int n2=in.nextInt();
		System.out.println("input third number:");
		int n3=in.nextInt();
		if(n1==n2 && n2==n3)
		{
			System.out.println("number is equal");
		}
		else
		{
			System.out.println("number is not equal");
		}
		
		

	}

}
