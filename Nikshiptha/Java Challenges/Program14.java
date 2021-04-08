import java.util.*;
class Program14 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the first String: ");
		Scanner s=new Scanner(System.in);
		String n=new String(s.nextLine());
		System.out.print("Enter the second String: ");
		String x=new String(s.nextLine());
		if(n.contains(x))
			System.out.println("String found");
		else
			System.out.println("String not found");
	}
}