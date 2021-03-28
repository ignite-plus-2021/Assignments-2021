import java.util.Arrays;
class BubbleSort
{
    void bubbleSortArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] >arr[j+1])
                {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {5, -3, 8, 0, 10, 2, 45};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));
        ob.bubbleSortArray(arr);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));
    }
}
