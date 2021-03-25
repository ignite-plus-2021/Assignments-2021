package com.assignment;
import java.util.*;
public class q11 {
    public void convertBinary(int num){
        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {
        q11 obj=new q11();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int num = in.nextInt();
        System.out.print("\nBinary representation is:");
        obj.convertBinary(num);
    }
}
