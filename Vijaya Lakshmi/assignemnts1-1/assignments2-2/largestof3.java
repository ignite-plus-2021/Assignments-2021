import java.util.*;


public class largestof3 {


    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any three numbers");
          int n1=in.nextInt();
          int n2=in.nextInt();
          int n3=in.nextInt();

          int max=n1>n2 ? ( n1>n3 ? n1 : n3 ): ( n2 > n3 ? n2 :n3 );
          System.out.println("Largest of two numbers is : "+max);

}
    
}
