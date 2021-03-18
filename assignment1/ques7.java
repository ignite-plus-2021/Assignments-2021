package assignment1;

import java.util.Scanner;

/*
Every for loop can be written as a while loop and vice versa so there are no cases where it's a must to use
either of the loops.
Just use the loop which you feel is easier to write.

Generally for loop is used when we know exactly how the loop will work and the number of times it will work for
whereas, while loop is used when the loop will work based on some conditions other than the looping variables conditions.

refer below program for example: it is shown that like in all cases while accessing arrays also either of the loop can be used.
 */
public class ques7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter the elements");


        //Accessing array with for loop
        for(int i=0;i<5;i++)
            a[i] = sc.nextInt();


        //Accessing array with while loop
        System.out.println("The elements are");
        int i=0;
        while(i<5){
            System.out.println(a[i]);
            i++;

        }

    }
}
