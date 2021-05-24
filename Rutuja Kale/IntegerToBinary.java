import java.util.Scanner;

public class IntegerToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer n=sc.nextInt();
		Integer m;
		String x="";
		int count=0;
		while(n>0) {
			Integer a = n%2; //finds the remainder	
			x=a+x;			 //concatenates the remainder to x, x is our answer string 
			n=n/2;			 //divides n into half
		}
		System.out.println(x);		
		
	}

}
