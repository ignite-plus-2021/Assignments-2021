public class CheckerBoard
{
  public static void checkerBoard(int size)
  {
    for(int i = 1; i <= size; i++)
    {
      if(i % 2 == 0)
        System.out.print("  ");
      for(int j = 1; j <= size; j++)
      {
        System.out.print(" * ");
      }
    }
  }
  public static void main (String[] args)
  {
    int n = Integer.parseInt(args[0]);
    System.out.println("Checkerboard Pattern: ");
    checkerBoard(n);
  }
}
