import java.util.*;
class Program4 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a character : ");
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		int g=ch;
		System.out.println("The ASCII value of the character "+ch+" is: "+g); 
	}
}
