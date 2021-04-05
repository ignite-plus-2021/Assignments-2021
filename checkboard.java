import java.util.Scanner;

public class Checkboard {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=obj.nextInt();
		checkers(n);
	}
  public static void checkers(int n)
  {
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=n;j++)
		  {
				  System.out.print("* ");  
		  }
		  System.out.println();
	  }
  }
}
