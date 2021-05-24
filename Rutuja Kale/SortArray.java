import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer b_nums[]= {0,1,1,0,1,1,0,1,0,0};
		
		for (Integer integer : b_nums) {
			System.out.print(b_nums[integer]+" ");
		}
		System.out.println(" ");
		Integer i=0,j=b_nums.length-1;
		while(i<=j) {
			if(b_nums[i]==1 && b_nums[j]==0 ) {
				
				b_nums[i]=0;
				b_nums[j]=1;
//				int temp = b_nums[i];
//				b_nums[i]=b_nums[j];
//				b_nums[j]=temp;
				i++;
				j--;
//				System.out.println("");
//				for (Integer integer : b_nums) {
//					System.out.print(b_nums[integer]+" ");
//				}
			}else if(b_nums[i]==0) {
				i++;
			}else if(b_nums[j]==1) {
				j--;
			}
		}
		//Arrays.sort(b_nums);
		

		for(int r=0;r<b_nums.length;r++) {
			System.out.print(b_nums[r]+" ");
		}
		
		for (Integer integ : b_nums) {
			System.out.print(b_nums[integ]+" ");
		}

	}

}
