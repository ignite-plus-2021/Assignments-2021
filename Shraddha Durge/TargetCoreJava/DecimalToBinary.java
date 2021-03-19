package target.assignment;

import java.util.Scanner;

public class DecimalToBinary {
    public static void decimalToBinary(int decimalNumber){
        int[] binaryNumber = new int[40];
        int count = 0;

        while(decimalNumber > 0){
            binaryNumber[count++] = decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
        }

        for(int i = count-1; i >= 0; i--){
            System.out.print(binaryNumber[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter decimal number : ");
        int decimalNumber = scanner.nextInt();

        System.out.print("Binary conversion of decimal number "+decimalNumber + " is ");
        decimalToBinary(decimalNumber);


    }
}

/*

Enter decimal number : 19
Binary conversion of decimal number 19 is 10011

Enter decimal number : 100000000
Binary conversion of decimal number 100000000 is 101111101011110000100000000
 */