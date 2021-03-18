package assignment1;

/*  In case of ++i the value of i is first incremented and then used for assigning or evaluation
        whereas
        In case of i++ the value is first used and then incremented for next use.

        refer the below program for example.

*/

public class ques4 {
    public static void main(String args[]){

        //i++ case
        int i = 10;
        int j;
        j=i++;
        System.out.printf("i= %d\nj= %d",i,j);

        //++i case
        i=10;
        j=++i;
        System.out.printf("\n\ni= %d\nj= %d",i,j);
    }
}
