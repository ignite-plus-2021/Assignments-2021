import java.util.*;
import java.lang.Math.*;
class  Program2
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the radius of the cylinder:");
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		System.out.print("Enter the height of the cylinder:");
		int h=s.nextInt();
		System.out.println("The volume of cylinder is: "+Math.PI*r*r*h);
	}
}
