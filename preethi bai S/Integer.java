package myproject;
import java.util.Scanner;
public class Integer {

	public static void main(String[] args) {
		int i=0;
		int result=1;
		Scanner in=new Scanner(System.in);
		System.out.println(" enter the n integer number");
		int n=in.nextInt();
		while(i<=n)
		{
			System.out.println(i+" "+ result);
			result=2*result;
			i=i+1;
		}
		
				

	}

}
