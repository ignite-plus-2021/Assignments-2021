import java.math.BigInteger;
import java.util.Scanner;

public class DeciToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        Long n = sc.nextLong();
        while (n >= 1) {
            long temp =  n % 2;
            str = str + String.valueOf(temp);
            n = n / 2;
        }
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        System.out.println(s);
    }
}
