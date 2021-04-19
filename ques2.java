import java.util.Scanner;
class Sorbinaryarray {
	public static void main(String[] args) {
		int temp = 0;
		int[] b_nums = {0,1,0,1,1,1,0,1,0,0};
		for(int i = 0; i<b_nums.length ; i++){
			if (b_nums[i]==0)
				b_nums[temp++] = 0;
			}
		for(int j = temp; j< b_nums.length ; j++){
			b_nums[j] = 1;
		}
		for(int i = 0; i< b_nums.length ; i++)
			System.out.print(b_nums[i] + " ");

	}
}