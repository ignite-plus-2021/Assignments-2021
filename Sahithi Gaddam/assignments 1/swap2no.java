import java.util.*;
class swap2no
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
        System.out.println("Enetr Two Numbers:");
		int a=in.nextInt();
        int b=in.nextInt();

		System.out.println("Before swapping:"+a+" "+b);

        a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After swapping:"+a+" "+b);
	}
}
