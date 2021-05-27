public class PowerOfTwo
{
  static int power(int b, int e)
  {
    if(e == 0)
      return 1;
    else
      return b * power(b, e-1);
  }
  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);
    if(n < 0)
      n = n + (-2 * n);
    
    for(int i = 0; i<=n; i++)
      System.out.println("2 to the power " + i + " = " + power(2,i));
  }
}
