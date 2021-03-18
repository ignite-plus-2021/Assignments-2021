package assignment1;

import java.util.Scanner;

public class ques2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int b_zero =0;
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] b_nums =  new int[n];
        System.out.println("Enter the binary elements");
        for(int i=0;i<n;i++){
            b_nums[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(b_nums[i]==0)
                b_zero++;
        }
        for(int i=0;i<b_zero;i++)
            b_nums[i]=0;
        for(int i=b_zero;i<n;i++)
            b_nums[i]=1;
        System.out.println("The elements after sorting are");
        for(int i=0;i<n;i++){
            System.out.println(b_nums[i]);
        }

    }
}
