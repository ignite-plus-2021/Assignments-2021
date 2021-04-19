import java.util.Scanner;

class heapsort {
	static void heapify(int[] arr, int size, int i)
	{
		int temp;
		int largest = i;
		int left = 2*i + 1;
		int right = 2*i + 2;

		if (left < size && arr[left] >arr[largest])
			largest = left;

		if (right < size && arr[right] > arr[largest])
			largest = right;

		if (largest != i)
		{
			temp = arr[i];
			arr[i]= arr[largest];
			arr[largest] = temp;
			heapify(arr, size, largest);
		}
	}
	static void heapSort(int arr[], int size)
	{
		int temp;
		int i;
		for (i = size / 2 - 1; i >= 0; i--)
			heapify(arr, size, i);
		for (i=size-1; i>=0; i--)
		{
			temp = arr[0];
			arr[0]= arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] arr = new int[count];
		for(int i=0; i < count; i++){
			arr[i] = sc.nextInt();
		}
		heapSort(arr,count);
		System.out.println("Array After Heap Sort");
		for(int i=0; i < count; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
