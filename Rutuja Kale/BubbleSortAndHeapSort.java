import java.util.Scanner;

public class BubbleSortAndHeapSort {
	public static Integer[] bubbleSort(Integer[] array, Integer n) {
		Integer dummy[]=array.clone();
		for(Integer i=0;i<n;i++) {
			for(Integer j=0;j<n-i-1;j++) {
				if(dummy[j]>dummy[j+1]) {
					Integer temp=dummy[j];
					dummy[j]=dummy[j+1];
					dummy[j+1]=temp;
				}
			}
		}
		
		return dummy;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to sort");
		Integer n=sc.nextInt();
		Integer array[]=new Integer[n]; //array to store numbers
		System.out.println("Enter the numbers to sort");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		Integer ans[]=bubbleSort(array,n);
		for(Integer i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

}
