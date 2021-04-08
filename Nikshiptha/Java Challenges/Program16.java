import java.util.*;
class Program16 
{
	public static void main(String[] args) 
	{
		int count,flag=0;
		System.out.print("Enter the String: ");
		Scanner s=new Scanner(System.in);
		String n=new String(s.nextLine());
		char str[]=n.toCharArray();
		System.out.println("The duplicate characters in the string are: ");
		for(int i=0;i<str.length;i++)
		{
			count=1;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					count++;
					str[j]='1';
				}
			}
			if(count>1 &&str[i]!='1')
			{
				flag=1;
				System.out.print(str[i]+" ");
			}
		}
		if(flag==0)
			System.out.println("No duplicate characters in the string");
	}
}
