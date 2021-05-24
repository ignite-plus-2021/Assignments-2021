import java.util.Scanner;
public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer dontStop=1;
		do {
			System.out.println("Enter any year");
			Integer year = sc.nextInt();
			String lenght=year.toString();
	//		A year is a leap year if it is divisible by 4 and not divisible by 100 or if it is divisible by 400
			if((year%4==0 && year%100!=0) || (year%400==0)) {			
				System.out.println(year+" is a leap year");
			}else {
				System.out.println(year+" is not a leap year");
			}
			System.out.println("Do you want to continue? Press 1 for YES or 0 for NO");
			dontStop=sc.nextInt();
			
		}while(dontStop==1);	
		

	}

}
