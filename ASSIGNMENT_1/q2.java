package com.company;
import java.util.*;

public class q2 {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter  size of  array");
        int n=in.nextInt();
        int []a=new int[n];

        System.out.println("enter  any array of only binary numbers:");
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();

        int i=0,j=n-1;
        while(i<j)
        {
            if(a[i]==0)
                i++;

            else if(a[i]==1)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }

        }

        //sorted array
        for( i=0;i<n;i++)
            System.out.print(a[i] +" ");


    }
}
