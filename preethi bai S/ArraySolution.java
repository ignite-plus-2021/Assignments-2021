package myproject;
import java.util.Arrays;
public class ArraySolution {
	public static void sort_binary_nums(int[] b_nums)
	{
		int k=0;
		for(int i=0; i<b_nums.length; i++)
		{
			if(b_nums[i] == 0)
			{
				b_nums[k++]=0;
			}
		}
		for(int i=k; i<b_nums.length; i++)
		{
			b_nums[k++]=1;
		}
	}

	public static void main(String[] args) {
		int b_nums[] = {0,1,1,0,1,1,0,1,0,0};
		System.out.println("origin array :"+ Arrays.toString(b_nums));
		sort_binary_nums(b_nums);
		System.out.println("after sorting:" + Arrays.toString(b_nums));

	}

}
