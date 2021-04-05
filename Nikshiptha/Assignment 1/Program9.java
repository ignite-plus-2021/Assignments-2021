import java.util.*;
public class Program9
{
    public static void main(String[] args)
    {
        int year;
        System.out.print("Enter a year: ");
        Scanner s =new Scanner(System.in);
        year=s.nextInt();
        if((year%4==0)&&(year%100!=0)||(year%400==0))
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
    }
}
/*Output :
Enter a year: 2022
2022 is not a leap year
 */