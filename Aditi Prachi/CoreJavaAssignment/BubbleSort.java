import java.util.*;

public class BubbleSort {
    static void bubbleSort(int[] arr,int n) {
        for(int i=0; i < n-1; i++){
            int flag = 0;
            for(int j=0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag==0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr number of  elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Array Before Sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSort(arr,n);
        System.out.println("Array After Sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

