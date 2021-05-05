package com.company;

import java.util.Scanner;

public class heapsort {



    public static void heapify(int[] a,int n,int i)
    {
        int largest=i;
        int l=2*i+1;
        int r=(2*i)+2;

        if(l<n && a[l]>a[largest])
          largest=l;

        if(r<n && a[r]>a[largest])
            largest=r;


           if(largest!=i) {
               int temp = a[largest];
               a[largest] = a[i];
               a[i] = temp;

               heapify(a,n,largest);
           }



    }

    public static void  heap_sort(int[] a,int n)
    {
        for(int i=n/2-1;i>=0;i--)
            heapify(a,n,i);

        for(int i=n-1;i>=0;i--)
        {
             int temp=a[i];
             a[i]=a[0];
             a[0]=temp;

             heapify(a,i,0);
        }
    }

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
        System.out.println("enter any number:");
    int n = in.nextInt();

    int a[] = new int[100];

        System.out.println("enter  any array values:");
        for (int i = 0; i < n; i++)
    a[i] = in.nextInt();

    //HEAPSORT
        heap_sort(a,n);


        for (int i = 0; i < n; i++)
            System.out.println(a[i]+" ");



}}
