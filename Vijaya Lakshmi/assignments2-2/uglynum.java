import java.util.*;

public class uglynum {
 

    static int ugly(int a,int b)
    {
         while(a%b==0)
             a=a/b;

          return a;   
         

    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any  number:");
          int n1=in.nextInt();
           n1=ugly(n1,2);
          n1=ugly(n1,3);
          n1=ugly(n1,3);

          if(n1==1)
          System.out.println("UGLY NUMBER");

          else
          System.out.println("NOT UGLY NUMBER");
        
         


    }

}
