package com.company;
import java.util.Scanner;

public class ques8 {
    static int temp;

    public static void bubbleSort(int[] arr) {
        int temp1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++)
                if (arr[j - 1] > arr[j]) {
                    temp1 = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp1;
                }
        }
    }

    public static void heapify(int[] arr, int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest])
            largest = left;

        if (right < size && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, size, largest);
        }
    }

    public static void heapSort(int[] arr) {
        int i;
        for (i = arr.length / 2 - 1; i >= 0; i--)
            heapify(arr, arr.length, i);
        for (i = arr.length - 1; i >= 0; i--) {
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Choose your option: 1. Bubble Sort 2. Heap Sort\n");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                bubbleSort(arr);
                break;
            case 2:
                heapSort(arr);
                break;
            default:
                System.out.print("Invalid choice!");
        }
        System.out.print("After Sorting:\n");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

