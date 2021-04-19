import java.util.Scanner;
class checkerboard {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
		char[] color = {' ', '*'};
		for(int row = 0; row < n; ++row) {
			int temp = row % 2;
			for(int col = 0; col < n; ++col) {
				System.out.print(" " + color[temp]);
						++temp;
				temp %= 2;
			}
			System.out.println();
		}

	}
}