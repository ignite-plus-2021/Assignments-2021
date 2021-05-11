import java .util.*;

public class leapyr {
   
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any  year:");
          int yr=in.nextInt();

          if( (yr%400==0) ||  ( yr%4==0 && yr%100!=0 ) )
           System.out.println("LEAP YEAR");

           else
           System.out.println("NOT LEAP YEAR");


}}
