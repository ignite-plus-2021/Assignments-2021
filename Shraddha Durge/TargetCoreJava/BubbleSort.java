package target.assignment;

import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int[] array, int sizeOfArray)
    {
        for (int i = 0; i < sizeOfArray - 1; i++)
        {
            for (int j = 0; j < sizeOfArray - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    // swap  arrayToBeSorted[j+1] and  arrayToBeSorted[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            /* System.out.println("Pass "+ (i+1));
            printArray(array);*/
        }
    }

    static void printArray(int[] array)
    {
        for (int j : array) System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int sizeOfArray = sc.nextInt();
        int[] arrayToBeSorted = new int[sizeOfArray];

        System.out.println("Enter elements to be sorted : ");
        for (int i=0; i<sizeOfArray; ++i)
            arrayToBeSorted[i] = sc.nextInt();

        bubbleSort(arrayToBeSorted,sizeOfArray);

        System.out.println("Sorted array using Bubble sort algorithm : ");
        printArray(arrayToBeSorted);
    }
}

/*
Enter size of array : 7
Enter elements to be sorted :
56
44
82
69
93
26
15
Sorted array using Bubble sort algorithm :
15 26 44 56 69 82 93
 */