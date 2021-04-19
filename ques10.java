import java.util.Scanner;
class gcd
{
	static int greatestcommondivisor(int number1, int number2) {
		if(number2 == 0){
			return number1;
		}
		return greatestcommondivisor(number2, number1%number2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		System.out.println("GCD of " + number1 +" and " + number2 +" is :" + greatestcommondivisor(number1,number2));

	}
}