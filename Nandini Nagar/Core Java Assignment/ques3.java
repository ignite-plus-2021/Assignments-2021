package target;
import java.lang.Math;
public class ques3 {
    public static void main(String args[]){
        int n;
        double i=1,x;
        n=Integer.parseInt(args[0]);
        while(true){
            x=Math.pow(2,i);
            if(x>n) break;
            System.out.print(x+" ");
            i+=1;
        }
    }
}
