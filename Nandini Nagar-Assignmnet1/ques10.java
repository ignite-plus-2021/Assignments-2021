package target;

public class ques10 {
    public static int gcd(int x,int y){
        if(y==0) return x;
        else  return gcd(y,(x%y));
    }
    public static void main(String args[]){
       int x= gcd(18,15);
        System.out.println("GCD="+x);
    }
}
