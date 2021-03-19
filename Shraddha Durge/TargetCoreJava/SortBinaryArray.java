package target.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SortBinaryArray {
    static void sortBinaryNumbers(int binaryNumArray[], int sizeOfBArray)
    {
        int k = 0;

        for (int i = 0; i < sizeOfBArray; i++)
        {
            if (binaryNumArray[i] == 0) {
                binaryNumArray[k++] = 0;
            }
        }

        for (int i = k; i < sizeOfBArray; i++) {
            binaryNumArray[k++] = 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size binary array : ");
        int sizeOfBArray = sc.nextInt();

        int binaryNumArray[] = new int[sizeOfBArray];

        System.out.println("Enter binary array : ");
        for(int i = 0; i < sizeOfBArray;i++)
        {
            binaryNumArray[i] = sc.nextInt();
        }
        System.out.println("Original binary array: "+ Arrays.toString(binaryNumArray));

        sortBinaryNumbers(binaryNumArray , sizeOfBArray);

        System.out.println("Binary array after sorting: "+Arrays.toString(binaryNumArray));

    }
}

/*
Enter size binary array : 10
Enter binary array :
0
1
1
0
1
1
0
1
0
0
Original binary array: [0, 1, 1, 0, 1, 1, 0, 1, 0, 0]
Binary array after sorting: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
 */