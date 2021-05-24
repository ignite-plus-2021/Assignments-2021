
public class powerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reading input from command line
		Integer n = Integer.parseInt(args[0]);
		Integer i=0;		
		Integer num=0;
		//if 2 power i is smaller than n print num and increment i and continue till num becomes greater than n
		while(num<n) {
			num= (int) Math.pow(2, i);
			i++;
			if(num<n)
				System.out.println(num);
		}
		
	}

}
