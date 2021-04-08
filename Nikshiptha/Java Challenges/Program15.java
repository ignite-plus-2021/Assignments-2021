class Program15 
{
	public static void main(String[] args) 
	{
		String s="GOD";
		per(s," ");
	}
	static void per(String s,String a)
	{
		if(s.length()==0)
		{
			System.out.print(a+" ");
			return;
		}
		else
		{
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				String rem=s.substring(0,i)+s.substring(i+1);
				per(rem,a+ch);
			}
		}
	}
}
