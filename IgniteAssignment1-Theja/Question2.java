//Sorting Array

public class Question2 {

	public static void main(String[] args) {
		int[]b_nums= {0,1,1,0,1,1,0,1,0,0};
		int temp;
		for(int i=0;i<b_nums.length;i++)
		{
			int flag=0;
			for(int j=0;j<b_nums.length-1;j++)
			{
				if(b_nums[j]>b_nums[j+1])
				{
					temp=b_nums[j];
					b_nums[j]=b_nums[j+1];
					b_nums[j+1]=temp;
				}
			}
			
		}
		for(int i=0;i<b_nums.length;i++)
		{
			System.out.print(b_nums[i]+" ");
		}

	}
}

