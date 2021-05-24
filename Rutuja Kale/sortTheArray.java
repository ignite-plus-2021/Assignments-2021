
public class sortTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//given array to sort
		Integer b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
		//variable i stores starting index of array and j stores ending index of array
		Integer i=0,j=b_nums.length-1;
		
		while(i<=j) {
			//if 1 is found at i index and 0 at j index swap them
			if(b_nums[i]==1 && b_nums[j]==0) {
				b_nums[i]=0;
				b_nums[j]=1;
				i++;
				j--;
			}else if(b_nums[i]==0) {  //if i index has 0, no need to swap increment i
				i++;
			}else if(b_nums[j]==1) { //if j index has 1, no need to swap increment j
				j--;
			}
		}
		
		for(int m=0;m<b_nums.length;m++) {
			System.out.print(b_nums[m]+" ");
		}

	}

}
