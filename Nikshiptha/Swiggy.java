import java.util.*;
public class Swiggy {
    public static void main(String[] args)
    {
        System.out.print("Enter your zip-code: ");
        Scanner s = new Scanner(System.in);
        String zip = s.nextLine();
        try
        {
            validateZip(zip);
        }
        catch (CannotDeliverException e)
        {
            System.out.print(e);
        }
    }
    public static void validateZip(String zipcode) throws CannotDeliverException
    {
        String regex="\\d{5}(-\\d{4})?";
        if(!(zipcode.matches(regex)))
            throw new CannotDeliverException();
        else
            System.out.print("Delivery available in your area!");
    }
}
class CannotDeliverException extends Exception
{
    public String toString()
    {
        return "You reside at non-deliverable zipcode.Please change your delivery address.";
    }
}
/*Output:
Enter your zip-code: 12345-1254
Delivery available in your area!
Enter your zip-code: 4587
You reside at non-deliverable zipcode.Please change your delivery address.
 */