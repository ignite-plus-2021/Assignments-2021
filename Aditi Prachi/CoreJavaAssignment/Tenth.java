import java.util.*;

public class Tenth {
    public static int GreatestCommonDivisor(int a, int b){
        if (a == 0)
            return b;
        return GreatestCommonDivisor(b%a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = GreatestCommonDivisor(a,b);
        System.out.println(g);
    }
}
