import java.util.*;
class swap3no
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
        System.out.println("Enetr Three Numbers:");
		int a=in.nextInt();
        int b=in.nextInt();
		int c=in.nextInt();
		System.out.println("Before swapping:"+a+" "+b+" "+c);
        a = a+b+c;
        b = a-(b+c);
        c = a-(b+c);
        a = a-(b+c);
		System.out.println("After swappin:"+a+" "+b+" "+c);
	}
}
