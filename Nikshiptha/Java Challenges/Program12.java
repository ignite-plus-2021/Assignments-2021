import java.util.*;
class Program12 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the First String: ");
		Scanner s=new Scanner(System.in);
		String fs=s.nextLine();
		System.out.print("Enter the Second String: ");
		String ss=s.nextLine();
		System.out.println("String after concatenation using + operator is "+fs+ss);
		System.out.println("String after concatenation using concat is "+fs.concat(ss));
	}
}
