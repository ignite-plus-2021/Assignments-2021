package target.assignment;

import java.util.Scanner;

public class HeapSort {
    static void heapify(int[] array, int sizeOfHeap, int i)
    {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        // If left child is larger than root
        if (left < sizeOfHeap && array[left] > array[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < sizeOfHeap && array[right] > array[largest])
            largest = right;

        // If largest is not root
        if (largest != i)
        {
            int temp = array[i];
            array[i]= array[largest];
            array[largest] = temp;
            heapify(array, sizeOfHeap, largest);
        }
    }

    static void heapSort(int[] array, int size)
    {
        int i, temp;

        // Build heap
        for (i = size / 2 - 1; i >= 0; i--)
            heapify(array, size, i);

        // One by one extract an element from heap
        for (i = size-1; i >= 0; i--)
        {
            // Move current root to end
            temp = array[0];
            array[0]= array[i];
            array[i] = temp;
            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    static void printArray(int[] array)
    {
        for (int j : array) System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int sizeOfArray = sc.nextInt();
        int[] arrayToBeSorted = new int[sizeOfArray];

        System.out.println("Enter elements to be sorted : ");
        for (int i=0; i<sizeOfArray; ++i)
            arrayToBeSorted[i] = sc.nextInt();

        heapSort(arrayToBeSorted,sizeOfArray);

        System.out.println("Sorted array using Heap sort algorithm : ");
        printArray(arrayToBeSorted);
    }
}

/*
Enter size of array : 7
Enter elements to be sorted :
56
32
89
44
76
24
11
Sorted array using Heap sort algorithm :
11 24 32 44 56 76 89
 */