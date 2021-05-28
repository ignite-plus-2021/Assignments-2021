import java.util.Arrays;

class BinaryArray
{
  public static void sortBinaryArray(int[] a, int n)
  {
    int j = -1;
    for(int i = 0; i < n; i++)
    {
      if(a[i] < 1)
      {
        j++;
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
      }
    }
  }
  public static void main(String[] args)
  {
    int b_nums[] = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0};
    System.out.println("Unsorted Array: " + Arrays.toString(b_nums));
    int l = b_nums.length;
    sortBinaryArray(b_nums, l);
    System.out.println("Sorted Array: ");
    for(int k = 0; k < l; k++)
      System.out.println(b_nums[k] + " ");
  }
}
