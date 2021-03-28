import java.util.Arrays;

class Sort_Array
{

	public static void sort_binary_nums(int[] b_arr)
	{
		int k = 0;

		for (int i = 0; i < b_arr.length; i++)
		{
			if (b_arr[i] == 0) {
				b_arr[k++] = 0;
			}
		}

		for (int i = k; i < b_arr.length; i++) {
			b_arr[k++] = 1;
		}
	}

	public static void main (String[] args)
	{
		int b_arr[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
        System.out.println("Original array: "+Arrays.toString(b_arr)); 
		sort_binary_nums(b_arr);
		System.out.println("After sorting: "+Arrays.toString(b_arr));
		
	}
}
