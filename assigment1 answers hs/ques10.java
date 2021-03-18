//Q10. Write a program GreatestCommonDivisor that finds the greatest common divisor (gcd) of
//        two integers using Euclid’s algorithm, which is an iterative computation based on the following
//        observation: if x is greater than y, then if y divides x, the gcd of x and y is y; otherwise,
//        the gcd of x and y is the same as the gcd of x % y and y.




import java.util.Scanner;

public class ques10 {
    static int gcdmethod(int x,int y){
        if (x==0){
            return y;
        }
        if (y==0){
            return x;
        }
        if (x==y){
            return x;
        }
        if (x>y)
            return gcdmethod(x-y,y);
        return gcdmethod(x,y-x);

    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter number: ");
        int y = in.nextInt();
        int x = in.nextInt();
        int gcd=gcdmethod(x,y);
        System.out.print("gcd of" +" "+ x + " "+"and" +" "+ y +" "+ "is" +" "+ gcd);




    }
}
