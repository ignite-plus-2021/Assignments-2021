import java.util.*;
import java.io.*;
class Program9 
{
	public static void main(String[] args) throws IOException
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Specify the path of file to which you want data to be written:");
		String path=new String(s.nextLine());
		FileOutputStream f=new FileOutputStream(path,true);
		byte arr[]={65,66,67,68,69};
		f.write(arr);
		f.close();
		System.out.println("Data written to file is: ");
		FileReader fr=new FileReader(path);
		File fn=new File(path);
		int i;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		if(fn.length()==0)
			System.out.println("Error in writing data to the file");
		fr.close();
	}
}
