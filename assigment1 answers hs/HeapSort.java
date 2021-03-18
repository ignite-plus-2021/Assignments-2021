//Q8. Write a Java program to sort an array of given integers using the Heap sort Algorithm.

import java.util.Scanner;

public class HeapSort{
    private static int n;
    public static void sort(int[] arr){
        heapMethod(arr);
        for (int i = n; i > 0; i--){
            swap(arr,0, i);
            n = n -1;
            heap(arr, 0);
        }
    }
    public static void heapMethod(int[] arr){
        n = arr.length-1;
        for (int i = n /2; i >= 0; i--)
            heap(arr, i);
    }
    public static void heap(int[] arr, int i){
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= n && arr[left] > arr[i])
            max = left;
        if (right <= n && arr[right] > arr[max])
            max = right;
        if (max != i){
            swap(arr, i, max);
            heap(arr, max);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        int n;
        System.out.println("Enter the number of elements to be sorted:");
        n = in.nextInt();
        int[] arr = new int[ n ];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        sort(arr);
        System.out.println("After sorting ");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]+" ");
        System.out.println();
    }
}