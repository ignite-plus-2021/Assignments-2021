import java.util.*;
class Program17
{
	public static void main(String[] args) 
	{
		System.out.println("Enter three numbers:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int greatest=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("The greatest of the three numbers is: "+greatest);
	}
}
