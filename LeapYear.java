import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String year = sc.next();
        String str="";
        str = str+ year.charAt(2) + year.charAt(3);
        int n = Integer.valueOf(str);
        if (n % 4 == 0) {
            System.out.println(year + " is LEAP YEAR");
        } else {
            System.out.println(year + " is NOT LEAP YEAR");
        }
    }
}