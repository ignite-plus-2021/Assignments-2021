import java.util.*;

public class wordsinstring {
  
    public static void main(String args[])
    {
      System.out.println("enter any string:");
      Scanner in= new Scanner(System.in);
      String s =in.nextLine();
      int c=1;

      for(int i=0;i<s.length();i++)
      {
          if(s.charAt(i)==' ')
          c++;
      }

      System.out.println("NUMber of words= "+c);


    }

}
