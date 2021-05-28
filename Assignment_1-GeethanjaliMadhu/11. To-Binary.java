import java.util.Scanner

public class DecToBinary
{ 
  public static void main(String[] args)
  {
    Scanner kyb = new Scanner();
    int num = kyb.nextInt();
    String b = Integer.toBinaryString(num)
    System.out.println("Binary equivalent of " + num + " - " + b);
  }
}
