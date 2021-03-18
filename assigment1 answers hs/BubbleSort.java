//Q8. Write a Java program to sort an array of given integers using the Bubble sorting Algorithm.

import java.util.Arrays;
import java.util.Scanner;

class BubbleSort {
    void bubbleSort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    // driver code
    public static void main(String[] args) {
        int n, i;
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of integers to sort");
        n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " integers");
        for (i = 0; i < n; i++)
            array[i] = in.nextInt();
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(array);
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(array));

    }
}