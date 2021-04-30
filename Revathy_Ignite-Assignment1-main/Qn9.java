import java.util.Scanner;
class Qn9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean flag = false;
        if(year%400 == 0){
            flag = ture;
        }
        elseif(year%100 == 0){
            flag = false;
        }
        elseif(year%4 == 0){
            flag = true;
        }
        else(){
            flag = false;
        }
        if(flag){
            System.out.println("Leap year");
        }
       else(){
          System.out.println("Not Leap year");
       }
    }
}
