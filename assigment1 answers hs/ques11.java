//Q11.Write a program converting to binary.

import java.util.Scanner;

public class ques11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = in.nextInt();

        int[] binary=new int[30];
        int i=0;
        for ( i=0;n>0;i++){
              binary[i]= n%2;
              n= n/2;
        }
        for ( i=i-1;i>=0;i--){
            System.out.print(binary[i]);
        }

    }
}
