import java.util.*;

public class Second {
    public static void main(String[] args) {
        int i, j = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int b_num[] = new int[n];
        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            b_num[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (b_num[i] == 0) {
                j++;
                int temp = b_num[i];
                b_num[i] = b_num[j];
                b_num[j] = temp;
            }
        }
        for (i = 0; i < n; i++) {
            System.out.print(b_num[i] + " ");
        }
    }
}
