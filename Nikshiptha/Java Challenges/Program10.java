import java.util.*;
import java.io.*;
class Program10 
{
	public static void main(String[] args) throws IOException
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Specify the path of file from which you want to read data :");
		String pread=new String(s.nextLine());
		System.out.print("Specify the path of file to which you want to write data :");
		String pwrite=new String(s.nextLine());
		FileInputStream fi=new FileInputStream(pread);
		FileOutputStream fo=new FileOutputStream(pwrite,true);
		File fr=new File(pwrite);
		int b;
		while((b=fi.read())!=-1)
			fo.write(b);
		if(fr.length()==0)
			System.out.println("Error in writing data to the file");
		else
			System.out.println("Data copied Succesfully");
		fo.close();
		fi.close();		
	}
}