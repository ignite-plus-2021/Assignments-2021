import java.util.*;
class Program11 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the String: ");
		Scanner s=new Scanner(System.in);
		String n=new String(s.nextLine());
		char str[]=n.toCharArray();
		for(int i=0;i<str.length;i++)
		{
			if(str[i]>='A'&&str[i]<='Z')
				str[i]=(char)((int)str[i]+32);
		}
		System.out.print("The string in lowercase is: ");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]);
		}
	}
}
