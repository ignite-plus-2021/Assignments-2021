package TargetAssignment;

public class Question8HeapSort {
    // Java program for implementation of Heap Sort
    public static class HeapSort
    {
        public void sort(int arr[])
        {
            int n = arr.length;

            // Build heap (rearrange array)
            for (int i = n / 2 - 1; i >= 0; i--)
                heap(arr, n, i);

            // One by one extract an element from heap
            for (int i=n-1; i>=0; i--)
            {
                // Move current root to end
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                // call max heapify on the reduced heap
                heap(arr, i, 0);
            }
        }

        // To heapify a subtree rooted with node i which is
        // an index in arr[]. n is size of heap
        void heap(int arr[], int n, int i)
        {
            int largest = i; // Initialize largest as root
            int l = 2*i + 1; // left = 2*i + 1
            int r = 2*i + 2; // right = 2*i + 2

            // If left child is larger than root
            if (l < n && arr[l] > arr[largest])
                largest = l;

            if (r < n && arr[r] > arr[largest])
                largest = r;
            if (largest != i)
            {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;
                heap(arr, n, largest);
            }
        }

        /* A utility function to print array of size n */
        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+" ");
            System.out.println();
        }

        // Driver program
        public static void main(String args[])
        {
            int arr[] = {105,227,72,45,16,23,2};
            int n = arr.length;

            HeapSort ob = new HeapSort();
            ob.sort(arr);

            System.out.println("Sorted array is");
            printArray(arr);
        }
    }

}
