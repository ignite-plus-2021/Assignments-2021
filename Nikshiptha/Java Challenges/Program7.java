import java.util.*;
class Program7 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the size of array: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int sum=0;
		System.out.print("Enter the array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			sum=sum+arr[i];
		}
		float avg=sum/n;
		System.out.println("The average of the elements of the array is "+avg);
	}
}
