import java .util.*;

public class perfectsquare {
    

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any  number:");
          int n1=in.nextInt();
        double sqrt=Math.sqrt(n1);
        if(Math.floor(sqrt)==Math.ceil(sqrt))
        System.out.println("PERFECT NUMBER");

        else
        System.out.println("NOT PERFECT NUMBER");

}
}
