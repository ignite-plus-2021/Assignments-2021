/*
 Write a Java program to sort an array of given integers using the Bubble sorting Algorithm and Heap sort Algorithm.
 */

import java.util.*;
public class question8 {
    //bubble sort
    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        int temp;
        for (int i=0; i<n-1; i++)
            for (int j=0; j<n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    //heap sort
    static void heapSort(int arr[])
    {
        int n = arr.length;
        int temp;
        for (int i = n/2-1; i>=0; i--)
            heapify(arr,n,i);
        for (int i = n-1; i>0; i--) {
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
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
            heapify(arr,n,largest);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("enter the values");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
       System.out.println("The sorted array using Bubble Sort is");
        bubbleSort(num);
        for (int i=0; i<n; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println("The sorted array using Heap Sort is ");
        heapSort(num);
        for (int i=0; i<n; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
