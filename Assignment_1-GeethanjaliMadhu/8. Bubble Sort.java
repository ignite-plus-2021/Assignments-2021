public class BubbleSort
{
  public static void bubbleSortArray(int[] a, int l)
  {
    for (int i = 0; i < l; i++)
    {
      for(int j = 0; j < (n-1); j++)
      {
        if(a[j] > a[j+1])
        {
          int temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
        }
      }
    }
  }
        
  public static void main(String[] args)
  {
    int arr[] = {1, 4, -6, 8, -2, 9, 31, -22};
    int n = arr.length;
    System.out.println("Array before sorting: ");
    for(int i = 0; i < n; i++)
      System.out.println(arr[i] + " ");
    System.out.println();
    bubbleSortArray(arr, n);
    System.out.println("Array after sorting: ");
    for(int i = 0; i < n; i++)
      System.out.println(arr[i] + " ");
  }
}
