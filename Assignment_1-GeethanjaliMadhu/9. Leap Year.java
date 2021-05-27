import java.util.Scanner;

public class LeapYear
{
  public static void main(String[] args)
  {
    Scanner kyb = new.Scanner(System.in);
    System.out.println("Please enter a year:  ");
    int year = kyb.nextInt();
    if(year % 100 == 0)
    {
      if(year % 400 == 0)
        System.out.println(year + ", is a Leap Year");
    }
    else if(year % 4 == 0)
      System.out.println(year + ", is a Leap Year");
    else
      System.out.println(year + ", is not a Leap Year");
  }
}
