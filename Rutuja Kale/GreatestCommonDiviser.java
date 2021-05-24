import java.util.Scanner;

public class GreatestCommonDiviser {
	public static Integer GCD(Integer x,Integer y) {
		Integer q=0; //quotient
		Integer r=0;//remainder
		while(y>0) {
			q=x/y; //quotient
			r=x%y;//remainder
			
			x=y;
			y=r;
		}
		return x;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		Integer x = sc.nextInt();
		Integer y = sc.nextInt();
		System.out.println("Greatest Common Diviser is: "+GCD(x,y));
	}

}
