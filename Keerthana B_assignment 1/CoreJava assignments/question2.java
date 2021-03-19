/*Write a Java program to sort a given binary array in linear times. b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 }
Output: After sorting: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
 */
import java.util.*;
public class question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int b_num[] = new int[n];
        System.out.println("Enter the elements");
        for (int i=0; i<n; i++) {
            b_num[i] = sc.nextInt();
        }
        int k=-1;
        for (int i=0; i<n; i++) {
            if (b_num[i] == 0) {
                k++;
                int temp = b_num[i];//swap the elements
                b_num[i] = b_num[k];
                b_num[k] = temp;
            }
        }
        for (int i=0; i<n; i++) {
            System.out.print(b_num[i] + " ");
        }

    }
}
