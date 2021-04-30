import java.util.Scanner;

public class Qn11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a decimal number");
        n = sc.nextInt();
        String b = Integer.toBinaryString(n);
        System.out.println("Its binary equivalent is "+ b);
    }
}
