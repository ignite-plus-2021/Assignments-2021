public class Q2 {

	public static void main(String[] args) {
		int[]bi_nums= {0,1,1,0,1,1,0,1,0,0};
		int temp;
		for(int i=0;i<bi_nums.length;i++)
		{
			int flag=0;
			for(int j=0;j<bi_nums.length-1;j++)
			{
				if(bi_nums[j]>bi_nums[j+1])
				{
					temp=bi_nums[j];
					bi_nums[j]=bi_nums[j+1];
					bi_nums[j+1]=temp;
				}
			}
			
		}
		for(int i=0;i<bi_nums.length;i++)
		{
			System.out.print(bi_nums[i]+" ");
		}

	}
}