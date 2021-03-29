package TargetAssignment;
import java.util.Scanner;
public class Question11 {
    public static class DecimalToBinaryExample2{
        public static void toBinary(int decimal){
            int binary[] = new int[40];
            int index = 0;
            while(decimal > 0){
                binary[index++] = decimal%2;
                decimal = decimal/2;
            }
            for(int i = index-1;i >= 0;i--){
                System.out.print(binary[i]);
            }
            System.out.println();//new line
        }
        public static void main(String args[]){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a number: ");
            int a =input.nextInt();
            toBinary(a);
        }}
}
