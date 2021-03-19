package target;
import java.math.BigInteger;
import java.util.Scanner;

public class ques11 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n,x;
        BigInteger d;
        BigInteger r=BigInteger.valueOf(0);
        BigInteger i=BigInteger.valueOf(1);
        n=s.nextInt();
        while(n>0){
            x=n%2;
            d=BigInteger.valueOf(x);
            r=r.add(i.pow(x).multiply(d));
            i=i.multiply(BigInteger.valueOf(10));
            n=n/2;
        }
        System.out.println(r);
    }
}
