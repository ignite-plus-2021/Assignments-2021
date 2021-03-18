import java.util.*;

public class First {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if((a==b)&&(a==c)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
