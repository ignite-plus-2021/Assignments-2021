import java.util.*;

public class substring {
    

    public static void main(String args[])
    {
      System.out.println("enter any string:");
      Scanner in= new Scanner(System.in);
      String s =in.nextLine();
      
      System.out.println("enter string to be found :");
      String s1 =in.nextLine();
     

     /* int index=s.indexOf(s1);
      if(index==-1)
      System.out.println(s1+" not in "+s);

      else
      System.out.println(s1+" present in "+s+"  at index  "+index);
      */

    int index=-1,c=-1;
      for(int i=0;i<s.length();i++)
      {  
             index=i;
             c=0;
          for(int j=0;j<s1.length();j++)
          {
              if(s.charAt(i)==s1.charAt(j))
              {
                i++;
               
                c++;
              } 

          }

          if(c==s1.length())
          {
            System.out.println(s1+" present in "+s+"  at index  "+index);
            break;
          }
      }


   if(c!=s1.length())
     System.out.println(s1+" not in "+s);


}}
