//Q2. Write a Java program to sort a given binary array in linear times.
//        b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 }
//        Output: After sorting: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]

import java.util.Arrays;

public class ques2 {
    public static void sorting(int[] binary_no)
    {
        int k = 0;

        for (int i = 0; i < binary_no.length; i++)
        {
            if (binary_no[i] == 0) {
                binary_no[k++] = 0;
            }
        }

        for (int i = k; i < binary_no.length; i++) {
            binary_no[k++] = 1;
        }
    }

    public static void main (String[] args)
    {
        int[] binary_no = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
        System.out.println("Original array: "+ Arrays.toString(binary_no));
        sorting(binary_no);
        System.out.println("After sorting: "+Arrays.toString(binary_no));

    }
}
