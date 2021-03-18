//InvalidZipCodeException is a custom exception. it is thrown when the customer
// resides at a non-deliverable zip code.

import java.util.Scanner;

class InvalidZipCodeException extends Exception{
    InvalidZipCodeException(String s){
        super(s);
    }
}
class Swiggy {

    static void validate(int zipcode)throws InvalidZipCodeException {
        if(zipcode==123||zipcode== 456|| zipcode==789)
            throw new InvalidZipCodeException("non-deliverable");
        else
            System.out.println("Delivery available in your area!");
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int zipcode = in.nextInt();
        try{
            validate(zipcode);
        }catch(Exception m){System.out.println("Exception occured: "+m);}

        System.out.println("rest of the code...");
    }
}
