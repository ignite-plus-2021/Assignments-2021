import java.util.*;
class  evenodd
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=in.nextInt();
		if(n%2==0)
			System.out.println("%.2f"%n);
		else
			System.out.println("Number is odd");
	}
}
