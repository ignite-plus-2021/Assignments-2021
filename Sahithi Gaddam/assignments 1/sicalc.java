import java.util.*;
class  sicalc
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
         System.out.println("Enter pricipal amount:");
          int amount=in.nextInt();
          
         System.out.println("Enter intrest rate:");
         int rate=in.nextInt();

         System.out.println("Enter time in years:");
         int time=in.nextInt();

        System.out.println("amount accumulated="+(amount*(1+(rate*time)/100)));
	}
}
