package assignment1;

import java.util.Scanner;

public class ques8 {
    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    static void heapSort(int arr[])
    {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    static void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter 10 values ");
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the sorting algorithm to be used \n  1. Bubble sort\n  2. Heap sort ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1: System.out.println("Sorting array using Bubble Sort ");
            bubbleSort(a);
            for (int i = 0; i < 10; i++) {
                System.out.print(a[i] + " ");
            }
            break;
            case 2: System.out.println("Sorting array using Heap Sort ");
            heapSort(a);
            for (int i = 0; i < 10; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
