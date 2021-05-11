import java.io.*;

public class fostream {
    
    public static void main(String[] args)
    {
          String s="JAVA ASSIGNMENT";
          System.out.println("creating a file:");
          
          try{

          File f=new File("createfile1.txt");
          FileOutputStream fout=new FileOutputStream(f);
          byte[] b=s.getBytes();
          fout.write(b);
          System.out.println("Sucessully written the data into file");
          fout.close();

          //checking if the data is written sucessuly
          System.out.println("contents of files are:");
         FileInputStream fin=new FileInputStream(f);
         byte[] b1=new byte[100];
         
         int k=-1;
         while((k=fin.read())!=-1)
         {
             System.out.print((char)k);
         }
         


          }

          catch(IOException e)
          {
              System.out.println("Error:"+e);
          }
          
    }

}
