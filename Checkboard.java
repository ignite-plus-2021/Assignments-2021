import java.util.Scanner;

public class Checkboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         Write a program Checkerboard that takes an integer command-line argument n and uses a loop nested within a loop to
         print out a two-dimensional n-by-n checkerboard pattern with alternating spaces and asterisks.
         */
        int n=sc.nextInt();
        String[][]a=new String[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2==0){
                    if(j%2==0){
                        a[i][j]=" ";
                    }
                    else{
                        a[i][j]="*";
                    }
                }
                else{
                    if(j%2==0){
                        a[i][j]="*";
                    }
                    else{
                        a[i][j]=" ";
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
