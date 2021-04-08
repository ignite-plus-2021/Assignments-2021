class Program20 
{
	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer("I am always ready to learn although I do not always like being taught.");
		for(int i=0;i<s.length();i++)
		{
			int p=s.indexOf("a");
			if(p!=-1)
			{
				s.insert(p,'$');
				s.deleteCharAt(p+1);
			}
		}
		System.out.println("The String after replacement is: "+s);
	}
}
