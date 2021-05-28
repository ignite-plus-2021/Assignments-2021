import java.util.*;
import java.lang.*;

public class GreatestCommonDivisor
{
  public static int gcd(int a, int b)
  {
    if(x == 0)
      return y;
    else if(x > y)
    {
      if(x % y == 0)
        return y;
    }
    else return gcd(x % y, y);
  }
  public static void main(Stirng[] args)
  {
    Scanner kyb = new Scanner();
    System.out.prntln("Please enter the two values: ");
    int x = kyb.nextInt();
    int y = kyb.nextInt();
    int g = gcd(x, y);
    System.out.println("GCD of " + x + "&" + y + " = " + g);
  }
}
