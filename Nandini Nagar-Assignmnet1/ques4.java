package target;

public class ques4 {
    public static void main(String args[]){
        int i=2,x=0;
        x=i++; //Post-Increment
        System.out.println("i="+i+" x="+x);
        i=2;x=0;
        x=++i; //Pre-Increment
        System.out.println("i="+i+" x="+x);
    }
}
