package target;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ques8 {
    static int n=5;
    static int arr[]=new int[n];
    static void create(){
        System.out.print("Enter five elements : ");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();

    }static void print(){
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }
    public static void main(String args[]){
        create();
        ques8_bubblesort b=new ques8_bubblesort();
        b.bubble_sort(arr,n);
        print();
        create();
        ques8_heapsort h=new ques8_heapsort();
        h.heap_sort(arr,n);
        print();
    }
}
