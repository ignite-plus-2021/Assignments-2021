import java.io.*;
import java.util.*;
class  Program8
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("Enter the file name you want to create ");
		Scanner s=new Scanner(System.in);
		String name=new String(s.nextLine());
		System.out.println("Specify the path :");
		String path=new String(s.nextLine());
		File f=new File(path,name);
		boolean test=f.createNewFile();
		if(test)
			System.out.println("File created Successfully at location "+path);
		else
			System.out.println("There was an error in creating the file");	
	}
}
