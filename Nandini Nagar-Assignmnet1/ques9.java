package target;

import java.util.Scanner;

public class ques9 {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        boolean flag=false;
        System.out.print("Enter year : ");
        int year=s.nextInt();
        if(year%400==0 && year%100==0)
            flag=true;
        else if(year%4==0 && year%100!=0)
            flag=true;
        if(flag==true)
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}
