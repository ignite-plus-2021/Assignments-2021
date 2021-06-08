import java.util.*;
public class Program8
{
    public static void main(String[] args)
    {
        System.out.print("Enter the size of array: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=read(n,s);
        bubble(arr,n);
        System.out.println("Bubble sort");
        print(arr);
        int[] a=read(n,s);
        heap(a,n);
        System.out.println("Heap sort");
        print(a);
    }
    static int[] read(int n,Scanner s)
    {
        int[] arr=new int[n];
        System.out.print("Enter the elements into the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        return arr;
    }
    static void heap(int[] a,int n)
    {
        for(int i=(n/2)-1;i>=0;i--)
            heapsort(a,n,i);
        for(int i=n-1;i>=0;i--)
        {
            int temp=a[0];
            a[0]=a[i];
            a[i]=temp;
            heapsort(a,i,0);
        }
    }
    static void heapsort(int[] a,int n,int i)
    {
        int large=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n&&a[left]>a[large])
            large=left;
        if(right<n&&a[right]>a[large])
            large=right;
        if(large!=i)
        {
            int temp=a[i];
            a[i]=a[large];
            a[large]=temp;
            heapsort(a,n,large);
        }


    }
    static void bubble(int[] arr,int n) {
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j <n-i; j++)
            {
                if (arr[j-1] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    static void print(int[] arr)
    {
        System.out.print("The array after sorting is: ");
        for(int value:arr)
        {
            System.out.print(value+"\t");
        }
        System.out.println();
    }
}