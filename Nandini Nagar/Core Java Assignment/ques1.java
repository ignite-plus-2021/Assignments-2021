package target;

public class ques1 {
    public static void main(String args[]){
        int a[]=new int[3];
        for(int i=0;i<=2;i++) a[i]=Integer.parseInt(args[i]);
        if((a[0]==a[1]) && (a[1]==a[2])){
            System.out.println("equal");
        }
        else System.out.println("not equal");

    }
}
