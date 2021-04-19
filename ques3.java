import java.util.Scanner;
import java.lang.Math;
class Powersoftwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; Math.pow(2,i)<=n ; i++){
			System.out.print(Math.pow(2,i) + " ");
		}
	}
}