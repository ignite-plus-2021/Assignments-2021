import  java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
                for(int k=0;k<n;k++)
                    System.out.print(a[k]+" ");
                System.out.println();
            }

        }
        System.out.println("The final sorted array will be ");
       for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
