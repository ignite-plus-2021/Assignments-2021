import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt() ;
        int i =0;
        while(((int)Math.pow(2,i))<n){
            System.out.print((int)(Math.pow(2,i))+" ");
            i++;
        }
    }
}
