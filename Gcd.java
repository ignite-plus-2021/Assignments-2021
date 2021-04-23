import java.util.Scanner;
public class Gcd {
    /*
    if x is greater than y, then if y divides x, the gcd of x and y is y;
     the gcd of x and y is the same as the gcd of x % y and y.
     */
    public static int gcd(int x, int y) {
        if(y == 0){
            return x;
        }
        return gcd(y,x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int gcdX = gcd(x, y);
        int gcdY = gcd(y, x);
        System.out.println(gcdX);
        System.out.println(gcdY);
    }
}