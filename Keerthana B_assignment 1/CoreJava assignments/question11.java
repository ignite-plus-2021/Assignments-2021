/*Write a program converting to binary
Input - 19 output -10011
Input - 100000000 Output - 101111101011110000100000000
 */

import java.util.*;
public class question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int[] binary = new int[99999];
        int i = 0;
        while (num > 0)
        {
            binary[i] = num%2;
            num = num/2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binary[j]);
    }
}
