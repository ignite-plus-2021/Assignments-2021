package target.assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Exception handling assignment
class nonDeliverableZipCodeException extends Exception {
    nonDeliverableZipCodeException(String s){
        super(s);
    }
}

public class CheckSwiggyDelivery {
    // Function to validate the pin code of India.
    public static boolean isValidZipCode(int zipCode)
    {
        if (zipCode == 0) {
            return false;
        }
        // Regex to check valid pin code of India.
        String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(String.valueOf(zipCode));
        return m.matches();
    }
    public static void isZipCodeDeliverable(int zipCode) throws nonDeliverableZipCodeException {
        //Array ogf non deliverable zip codes
        int[] nonDeliverableZipCodes = {123456,345678,234567,823654,914678};
        boolean deliverable=true;

        for(int zip : nonDeliverableZipCodes)
        {
            if(zipCode == zip)
                deliverable=false;
        }

        if(!deliverable)
            throw new nonDeliverableZipCodeException("Delivery is not available in your area.");
        else
            System.out.println("Delivery available in your area!");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zipCode;

        do {
            System.out.print("Enter zip code : ");
            zipCode = scanner.nextInt();

            if(!isValidZipCode(zipCode))
                System.out.println("Enter a valid zip code!");

        }while (!isValidZipCode(zipCode));

        try {
            isZipCodeDeliverable(zipCode);
        }
        catch(Exception e) {
            System.out.println("Exception occurred: "+e);
        }
    }
}
/*
Enter zip code : 789
Enter a valid zip code!
Enter zip code : 123478
Delivery available in your area!

Enter zip code : 234567
Exception occurred: target.assignment.nonDeliverableZipCodeException: Delivery is not available in your area.

 */