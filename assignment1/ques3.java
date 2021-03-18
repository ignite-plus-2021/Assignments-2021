package assignment1;
import java.lang.Math;
import java.util.Scanner;

public class ques3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       long n;
       System.out.println("Enter the value of n");
       n= sc.nextLong();
       for(long i=0;Math.pow(2,i)<=n;i++){
           System.out.println("2^"+ i+ "= "+ Math.pow(2,i));
       }
    }
}
