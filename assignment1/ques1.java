package assignment1;

import java.util.Scanner;

public class ques1 {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a==b) && (b==c)){

            System.out.println("All numbers are equal.");
        }
        else
            System.out.println("Numbers are not equal");
    }
}
