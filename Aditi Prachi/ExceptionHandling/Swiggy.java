import java.util.Scanner;

class MyException extends Exception 
{ 

}
public class Swiggy {

   	static int checkZip(){
        	Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ZIP code:");
          	String zip = sc.next();
          	int n= zip.length();
          	if(zip.equals("123") || zip.equals("456")  || zip.equals("789"))
            		return 0;
          	else 
            		return 1;
   	}
	public static void main(String args[]) 
	{ 
		try{ 
          		if(checkZip()==1)
				System.out.println("Delivery available in your area");
		  	else
				throw new MyException();
		    		
		} 
		catch (MyException e) 
		{ 
			System.out.println("Not deliverable to this zipcode"); 
		} 
	} 
} 
