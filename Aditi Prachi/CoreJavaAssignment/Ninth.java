import java.util.*;

public class Ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year= sc.nextInt() ;
        int leap = 0;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = 1;
            }
            else
                leap = 1;
        }
        if (leap==1) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
