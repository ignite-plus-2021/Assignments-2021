import java.util.*;

public class findduplicateinstr {
    

    public static void main(String args[])
    {
      System.out.println("enter any string:");
      Scanner in= new Scanner(System.in);
      String s =in.nextLine();

     
      HashSet<Character> set=new HashSet<Character>();
      ArrayList<Character> ar=new ArrayList<Character>();

      for(int i=0;i<s.length();i++)
      {
         if(!set.contains(s.charAt(i)))
                 set.add(s.charAt(i)); 
                 
        else
            ar.add(s.charAt(i)) ;
        
    }
        for(int i=0;i<ar.size();i++)
        System.out.println(ar.get(i));

    }}
