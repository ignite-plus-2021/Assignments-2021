
public class commandLine {
	public static void main(String[] args) {
		Integer number1 = Integer.parseInt(args[0]);
		Integer number2 = Integer.parseInt(args[1]);
		Integer number3 = Integer.parseInt(args[2]);
		
		if(number1==number2 && number2==number3) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}
}
