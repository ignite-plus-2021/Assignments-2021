import java.util.*;
class Program13
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the String: ");
		Scanner s=new Scanner(System.in);
		String n=new String(s.nextLine());
		char str[]=n.toCharArray();
		int wrdcount=1;
		if(str.length!=0)
		{
			for(int i=0;i<str.length;i++)
			{
				if(str[i]==' ')
					wrdcount++;
			}
		}
		else
			wrdcount=0;
		System.out.println("The wordcount is: "+wrdcount);
	}
}
