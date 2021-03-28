import java.util.Scanner;
public class Decimal_Binary{
    public staitc void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int d;
      System.out.println("Enter decimal number");
      d=sc.nextInt();
      String b=Integer.toBinaryString(d);
       System.out.println("The binary of " +d+ " is "+b);
    }
}
