import java.util.Scanner;

class InvalidZipCodeException extends Exception {
	InvalidZipCodeException(String s) {
		super(s);
	}
}

public class pinCodeException {
	public static void validateZipCode(Integer z) throws InvalidZipCodeException {
		String zip = z.toString();
		if (zip.equals("123") || zip.equals("456") || zip.equals("789")) {
			throw new InvalidZipCodeException("We don't deliver in your location");
		} else {
			System.out.println("Delivery available in your area");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the zip code of your area");
		Integer zipCode = sc.nextInt();
		try {
			validateZipCode(zipCode);
		} catch (Exception e) {
			System.out.println("Exception occured: " + e);
		}

	}

}
